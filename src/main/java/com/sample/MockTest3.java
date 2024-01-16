package com.sample;

public class MockTest3 {
    public static void main(String args[]) {
        {
            try {
                int a = 0;
                int b = 5;
                int c = a / b;
                System.out.print("Hello");
            } catch (Exception e) {
                System.out.print("World");
            }
        }
    }
}
