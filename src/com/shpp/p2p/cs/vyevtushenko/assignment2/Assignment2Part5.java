package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import sun.font.CoreMetrics;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;
    public void run() {


        for(int i = 0; i < NUM_ROWS; i++) {
            for(int j = 0; j < NUM_COLS; j++) {
                GRect square = new GRect(getWidth()/2.0+BOX_SPACING + j *(BOX_SIZE + BOX_SPACING) , getHeight()/2.0 +BOX_SPACING + i * (BOX_SIZE + BOX_SPACING), BOX_SIZE, BOX_SIZE);
                square.setFilled(true);
                square.setFillColor(Color.BLACK);
                add(square);
            }
        }
    }
}
