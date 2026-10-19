package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import com.sun.org.apache.bcel.internal.generic.GotoInstruction;
import sun.font.CoreMetrics;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {
    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */
    static final double FIRST_TOE_OFFSET_X = 20;
    static final double FIRST_TOE_OFFSET_Y = 40;
    static final double SECOND_TOE_OFFSET_X = 50;
    static final double SECOND_TOE_OFFSET_Y = 20;
    static final double THIRD_TOE_OFFSET_X = 80;
    static final double THIRD_TOE_OFFSET_Y = 40;

    /* The pos of the heel relative to the upper-left
     * corner of the pawprint.
     */
    static final double HEEL_OFFSET_X = 40;
    static final double HEEL_OFFSET_Y = 60;

    /* Each toe is an oval with this width and height. */
    static final double TOE_WIDTH = 20;
    static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    static final double HEEL_WIDTH = 40;
    static final double HEEL_HEIGHT = 60;

    static final double addToCordX = 200;
    static final double addToCordY = 50;
    ;
    /* The default W and H of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        drawPaw(20, 20);
        drawPaw(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coord of the up-left corner of the bounding box for the pawprint.
     * @param y The y coord of the up-left corner
     */
    void drawPaw(double x, double y) {

        GOval oval1 = new GOval(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        oval1.setFilled(true);
        oval1.setColor(Color.BLACK);
        add(oval1);

        GOval oval2 = new GOval(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        oval2.setFilled(true);
        oval2.setColor(Color.BLACK);
        add(oval2);

        GOval oval3 = new GOval(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        oval3.setFilled(true);
        oval3.setColor(Color.BLACK);
        add(oval3);

        GOval oval4 = new GOval(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
        oval4.setFilled(true);
        oval4.setColor(Color.BLACK);
        add(oval4);

        GOval oval5 = new GOval(FIRST_TOE_OFFSET_X  + addToCordX, FIRST_TOE_OFFSET_Y  + addToCordY, TOE_WIDTH, TOE_HEIGHT);
        oval5.setFilled(true);
        oval5.setColor(Color.BLACK);
        add(oval5);

        GOval oval6 = new GOval(SECOND_TOE_OFFSET_X  + addToCordX, SECOND_TOE_OFFSET_Y  + addToCordY, TOE_WIDTH, TOE_HEIGHT);
        oval6.setFilled(true);
        oval6.setColor(Color.BLACK);
        add(oval6);

        GOval oval7 = new GOval(THIRD_TOE_OFFSET_X  + addToCordX, THIRD_TOE_OFFSET_Y  + addToCordY, TOE_WIDTH, TOE_HEIGHT);
        oval7.setFilled(true);
        oval7.setColor(Color.BLACK);
        add(oval7);

        GOval oval8 = new GOval(HEEL_OFFSET_X  + addToCordX, HEEL_OFFSET_Y  + addToCordY, HEEL_WIDTH, HEEL_HEIGHT);
        oval8.setFilled(true);
        oval8.setColor(Color.BLACK);
        add(oval8);

    }
}
