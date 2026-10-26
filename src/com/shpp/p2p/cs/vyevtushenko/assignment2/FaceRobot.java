package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import com.sun.org.apache.bcel.internal.generic.GotoInstruction;
import sun.font.CoreMetrics;

import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class FaceRobot  extends WindowProgram {

    static final double HEAD_WIDTH  = 300;
    static final double HEAD_HEIGHT = 600;
    static final double EYE_RADIUS = 50;
    static final double MOUTH_WIDTH = 200;
    static final double MOUTH_HEIGHT = 100;


    public void run() {
        double center_X = getWidth() / 2.0;
        double center_Y = getHeight() / 2.0;

        GRect rect1 = new GRect(center_X, center_Y, HEAD_WIDTH, HEAD_HEIGHT);
        rect1.setFilled(true);
        rect1.setFillColor(Color.RED);
        rect1.setColor(Color.GREEN);
        add(rect1);

        GRect rect2 = new GRect(center_X+110, center_Y*2.0, HEAD_WIDTH/4.0, HEAD_HEIGHT/4.0);
        rect2.setFilled(true);
        rect2.setFillColor(Color.BLUE);
        rect2.setColor(Color.GREEN);
        add(rect2);


        GOval oval1 = new GOval(center_X + EYE_RADIUS, center_Y + EYE_RADIUS,EYE_RADIUS, EYE_RADIUS);
        oval1.setFilled(true);
        oval1.setFillColor(Color.GREEN);
        add(oval1);

        GOval oval2 = new GOval(center_X + EYE_RADIUS*4.0, center_Y + EYE_RADIUS,EYE_RADIUS, EYE_RADIUS);
        oval2.setFilled(true);
        oval2.setFillColor(Color.GREEN);
        add(oval2);

        GRect rect3 = new GRect(center_X+50, center_Y*3.0, MOUTH_WIDTH, MOUTH_HEIGHT);
        rect3.setFilled(true);
        rect3.setFillColor(Color.MAGENTA);
        rect3.setColor(Color.GREEN);
        add(rect3);
    }
}
