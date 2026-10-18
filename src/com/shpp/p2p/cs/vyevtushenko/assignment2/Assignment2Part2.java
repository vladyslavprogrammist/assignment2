package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import sun.font.CoreMetrics;

import java.awt.*;



public class Assignment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;


    public void run() {
        GOval circle1 = new GOval(0, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT);
        circle1.setFilled(true);
        circle1.setColor(Color.BLACK);
        add(circle1);

        GOval circle2 = new GOval(getWidth() + APPLICATION_WIDTH, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT);
        circle2.setFilled(true);
        circle2.setColor(Color.BLACK);
        add(circle2);

        GOval circle3 = new GOval(0, getHeight() + APPLICATION_HEIGHT, APPLICATION_WIDTH, APPLICATION_HEIGHT);
        circle3.setFilled(true);
        circle3.setColor(Color.BLACK);
        add(circle3);

        GOval circle4 = new GOval(getWidth() + APPLICATION_WIDTH, getHeight() + APPLICATION_HEIGHT, APPLICATION_WIDTH, APPLICATION_HEIGHT);
        circle4.setFilled(true);
        circle4.setColor(Color.BLACK);
        add(circle4);

        GRect rectangle  = new GRect(APPLICATION_WIDTH / 2.0, APPLICATION_HEIGHT / 2.0, APPLICATION_WIDTH  + getWidth(), APPLICATION_HEIGHT + getHeight());
        rectangle.setFilled(true);
        rectangle.setColor(Color.WHITE);
        add(rectangle);

    }
}
