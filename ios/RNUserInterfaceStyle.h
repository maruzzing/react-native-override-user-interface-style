// RNUserInterfaceStyle.h

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>

NS_ASSUME_NONNULL_BEGIN

@interface RNUserInterfaceStyle : NSObject <RCTBridgeModule>
+ (void)initSystemTheme;
+ (void)setSystemTheme:(NSString *)theme update:(BOOL)update;
+ (NSString *)get:(NSString *)key;
+ (void)set:(NSString *)key value:(NSString *)value;
+ (NSUserDefaults *)getUserDefaults;

@end

NS_ASSUME_NONNULL_END

