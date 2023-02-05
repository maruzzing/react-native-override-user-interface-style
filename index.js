// main index.js

import { NativeModules } from 'react-native';

const { RNUserInterfaceStyle } = NativeModules;

export default {
  getTheme: RNUserInterfaceStyle.getTheme,
  setTheme: RNUserInterfaceStyle.setTheme,
};
