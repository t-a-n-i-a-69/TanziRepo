package com.sample;

public class ShortCircuit {
    /*
        & is bitwise. && is logical.
        & evaluates both sides of the operation.
        && evaluates the left side of the operation, if it's true, it continues and evaluates the right side.
   */
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 10;
        int a = 1;
        int b = 4;
        //int result = x+y+z;
        if (x < y | z < a & b > x) { // bitWise operator
            System.out.println("without Short circuit");
        }

        if (x < y && y < z) { //logical operator
            System.out.println("With short circuit");
        }
    }
}
