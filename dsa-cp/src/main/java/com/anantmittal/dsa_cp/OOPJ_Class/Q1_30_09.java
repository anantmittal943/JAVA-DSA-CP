package com.anantmittal.dsa_cp.OOPJ_Class;

// Spring Simulation
public class Q1_30_09 {
    public static void main(String[] args) {
        double k = 10.0;
        double m = 1.0;
        double x = 0.5;
        double v = 0.0;
        double dt = 0.01;

        for (int step = 0; step < 500; step++) {

            double F = -k * x; // Hooke's Law

            double a = F / m;

            v += a * dt;
            x += v * dt;

            if (step % 10 == 0) {
                int pixels = (int) Math.round(x * 100); // convert m → cm
                if (pixels < 0) pixels = 0;             // no negative bars
                for (int i = 0; i < pixels; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
