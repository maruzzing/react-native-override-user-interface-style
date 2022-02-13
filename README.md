# react-native-override-user-interface-style

## Installation

```bash
# Install & setup module
$ npm install react-native-override-user-interface-style --save
# --- or ---
$ yarn add react-native-override-user-interface-styl

# If you're developing your app using iOS, don't forget to run this command
$ cd ios/ && pod install
```


## Manual linking (only if needed)

<details>
<summary>Manually link the library on iOS</summary>
</br>

Add this line to your `ios/Podfile` file, then run `pod install`.

```bash
target 'YourAwesomeProject' do
  # …
  pod 'RNUserInterfaceStyle', :path => '../node_modules/react-native-override-user-interface-style'
end
```
</details>


<details>
<summary>Manually link the library on android</summary>
</br>

1. Add the following lines to `android/settings.gradle`:

```gradle
include ':react-native-override-user-interface-style'
project(':react-native-override-user-interface-style').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-override-user-interface-style/android')
```

2. Add the implementation line to the dependencies in `android/app/build.gradle`:

```gradle
dependencies {
  // ...
  implementation project(':react-native-override-user-interface-style')
}
```

3. Add the import and link the package in `MainApplication.java`:

```java
package com.maruzzing.rnuserinterfacestyle.RNUserInterfaceStylePackage; 

public class MainApplication extends Application implements ReactApplication {

  // …
    @Override
    protected List<ReactPackage> getPackages() {
      List<ReactPackage> packages = new PackageList(this).getPackages();
      // Packages that cannot be autolinked yet can be added manually here, for example:
      // …
      packages.add(new RNUserInterfaceStylePackage());
      return packages;
    }
  // …
}
```

</details>


## Setup

### iOS
1. Add AppGroup to your `info.plist`:
```
<key>AppGroup</key>
<string>your.group.name</string>
```

2. Update `AppDelegate.m` with the following additions:
```obj-c
#import "AppDelegate.h"
#import <React/RCTBundleURLProvider.h>
#import <React/RCTRootView.h>
#import "RNUserInterfaceStyle.h" // <- add the header import

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
    // ...other code

    [RNUserInterfaceStyle initSystemTheme];  // <- initialization system theme

    return YES;
}
@end
```

### android


## Usage
```javascript
import RNUserInterfaceStyle from 'react-native-override-user-interface-style';

// TODO: What to do with the module?
RNUserInterfaceStyle;
```
