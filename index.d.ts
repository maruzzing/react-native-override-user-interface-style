export type Theme = 'default' | 'light' | 'dark';

declare namespace _default {
  const getTheme: () => Promise<Theme | null>;
  const setTheme: (theme: Theme) => void;
}

export default _default;
