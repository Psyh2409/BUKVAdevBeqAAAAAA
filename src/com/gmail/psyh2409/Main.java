package com.gmail.psyh2409;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        for (int a = 1; a < 10; a++) {
            int aaaaaa = (int) (a * Math.pow(10, 5)
                              + a * Math.pow(10, 4)
                              + a * Math.pow(10, 3)
                              + a * Math.pow(10, 2)
                              + a * Math.pow(10, 1)
                              + a * Math.pow(10, 0));
            for (int b = 1; b < 10; b++) {
                for (int y = 0; y < 10; y++) {
                    for (int k = 0; k < 10; k++) {
                        for (int v = 0; v < 10; v++) {
                            if ((a != b && a != y && a != k && a != v)
                                    && (b != y && b != k && b != v)
                                    && (y != k && y != v)
                                    && (k != v)) {
                                if ((int) ((b * Math.pow(10, 4)
                                        + y * Math.pow(10, 3)
                                        + k * Math.pow(10, 2)
                                        + v * Math.pow(10, 1)
                                        + a * Math.pow(10, 0))
                                        * b) == aaaaaa) {
                                    System.out.println(++i + ")  " + b + y + k + v + a + " * " + b + " = " + aaaaaa);
                                    // Output:
                                    // 1)  79365 * 7 = 555555
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
