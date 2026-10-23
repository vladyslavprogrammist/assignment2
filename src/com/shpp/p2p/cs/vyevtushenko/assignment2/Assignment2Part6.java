package com.shpp.p2p.cs.vyevtushenko.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;
import sun.font.CoreMetrics;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram{

    static final int COUNT = 12;
    static final int WIDTH = 200;
    static final int HEIGHT = 200;
    static final int x1 = 0;
    static final int y1 = 50;
    static final int x2 = 0;
    static final int y2 = 0;

    public void run() {
        int s = 0;
        for(int i = 0; i < COUNT; i++){
            if(i % 2 == 0){
                GOval oval = new GOval(x1 + s, y1, WIDTH, HEIGHT );
                oval.setFilled(true);
                oval.setFillColor(Color.GREEN);
                oval.setColor(Color.RED);
                add(oval);

            }
            else {
                GOval oval = new GOval(x2+s, y2, WIDTH, HEIGHT );
                oval.setFilled(true);
                oval.setFillColor(Color.GREEN);
                oval.setColor(Color.RED);
                add(oval);

            }
            s+=100;


        }
    }
}
