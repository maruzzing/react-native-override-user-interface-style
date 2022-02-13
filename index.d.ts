declare module "react-native-override-user-interface-style" {
  export type Theme = "default" | "light" | "dark";

  export default class RNUserInterfaceStyle {
    static getTheme(): Promise<Theme | null>;
    static setTheme(theme: Theme): void;
  }
}
