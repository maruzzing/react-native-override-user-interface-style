// main index.js

import { NativeModules } from "react-native";

const { RNUserInterfaceStyle } = NativeModules;

export default class RNUserInterfaceStyle {
  static getTheme = RNUserInterfaceStyle.getTheme();
  static setTheme = (theme) => RNUserInterfaceStyle.setTheme(theme);
}
