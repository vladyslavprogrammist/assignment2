package com.shpp.p2p.cs.vyevtushenko.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    public void run() {
        double a, b, c;
        a = readDouble("Please enter a: ");
        b = readDouble("Please enter b: ");
        c = readDouble("Please enter c: ");

        double D = (b * b) - 4 * a * c;
        double x, x1, x2;
        double y = Math.sqrt(D);
        if (D < 0) {
            println("There are no real roots");
        }
        else if (D == 0) {
            x = (-b) / (2 * a);
            println("There is one root: " + x);
        }
        else {
            x1 = ((-b) + y) / (2 * a);
            x2 = ((-b) - y) / (2 * a);
            println("There are two roots: " + x1 + " and " + x2);
        }

    }
}
