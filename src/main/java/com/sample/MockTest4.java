package com.sample;

import java.awt.print.Book;

public class MockTest4 {
    public static void main(String args[]) {
        Book HaryPotter = new Book();
        HaryPotter.setISBNcode("HP1234");
        Book LordOfRing = new Book();
        LordOfRing.setISBNcode("LR67890");
        System.out.println(HaryPotter.getISBNcode() + " " + LordOfRing.getISBNcode());
    }


    static class Book {
        public static String ISBNcode;

        public String getISBNcode() {
            return ISBNcode;
        }

        public void setISBNcode(String value) {
            ISBNcode = value;
        }
    }
}