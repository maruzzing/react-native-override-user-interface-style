// RNUserInterfaceStyle.m

#import "RNUserInterfaceStyle.h"
@import UIKit;

@implementation RNUserInterfaceStyle

+ (NSUserDefaults *)getUserDefaults {
    NSString *suiteName = [[NSBundle mainBundle] objectForInfoDictionaryKey:@"AppGroup"];
    if(suiteName == nil){
        return [NSUserDefaults standardUserDefaults];
    } else {
        return [[NSUserDefaults alloc] initWithSuiteName:suiteName];
    }
}

+ (void)set:(NSString *)key value:(NSString *)value {
    return [[RNUserInterfaceStyle getUserDefaults] setObject:value forKey:key];
}

+ (NSString *)get:(NSString *)key {
    return [[RNUserInterfaceStyle getUserDefaults] stringForKey:key];
}

+ (void)setSystemTheme:(NSString *)theme update:(BOOL)update{
  if(update){
    [RNUserInterfaceStyle set:@"theme" value:theme];
  }
  if (@available(iOS 13.0, *)) {
    dispatch_async(dispatch_get_main_queue(), ^{
      if ([theme isEqual: @"dark"]) {
        UIApplication.sharedApplication.delegate.window.overrideUserInterfaceStyle = UIUserInterfaceStyleDark;
      } else if ([theme isEqual: @"light"]) {
        UIApplication.sharedApplication.delegate.window.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
      } else {
        UIApplication.sharedApplication.delegate.window.overrideUserInterfaceStyle = UIUserInterfaceStyleUnspecified;
      }
    });
  }
}

+ (void)initSystemTheme {
  NSString *theme = [RNUserInterfaceStyle get:@"theme"];
  if (theme == nil) {
    [RNUserInterfaceStyle setSystemTheme:@"default" update:NO];
  } else {
    [RNUserInterfaceStyle setSystemTheme:theme update:NO];
  }
}

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(setTheme:(NSString *)theme)
{
  [RNUserInterfaceStyle setSystemTheme:theme update:YES];
}

RCT_EXPORT_METHOD(getTheme:(RCTPromiseResolveBlock)resolve
                  reject:(__unused RCTPromiseRejectBlock)reject)
{
  resolve([RNUserInterfaceStyle get:@"theme"]);
}

@end
