package com.shpp.p2p.cs.vyevtushenko.assignment2;


import com.shpp.cs.a.console.TextProgram;

public class BuzzFizzBazz extends TextProgram {
    public void run() {
        int number = readInt("Please enter quantity: ");
        for(int i = 0; i < number; i++){
            if(i % 3 == 0) {
                println("Fizz");
            } else if(i % 5 == 0) {
                println("Bazz");
            } else if(i % 3 == 0 && i % 5 == 0) {
                println("Buzz");
            } else {
                println(i);
            }
        }
    }
}
