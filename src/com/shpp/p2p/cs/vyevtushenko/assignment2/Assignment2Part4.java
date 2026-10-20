package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import com.sun.org.apache.bcel.internal.generic.GotoInstruction;
import sun.font.CoreMetrics;

import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    static final double height = 600;
    static final double width = 160;


    public void run() {
        GRect rectangle1 = new GRect(getWidth()/2.0, getHeight()/2.0, width, height);
        rectangle1.setFilled(true);
        rectangle1.setFillColor(Color.BLACK);
        add(rectangle1);

        GRect rectangle2 = new GRect(getWidth()/2.0+width, getHeight()/2.0, width, height);
        rectangle2.setFilled(true);
        rectangle2.setFillColor(Color.YELLOW);
        add(rectangle2);

        GRect rectangle3 = new GRect(getWidth()/2.0+width+width, getHeight()/2.0, width, height);
        rectangle3.setFilled(true);
        rectangle3.setFillColor(Color.RED);
        add(rectangle3);

        GLabel name = new GLabel("Flag of Belgium");
        name.setFont("Arial-BOLD-25");
        name.setLocation(getWidth(), getHeight()*2);
        add(name);
    }


}
