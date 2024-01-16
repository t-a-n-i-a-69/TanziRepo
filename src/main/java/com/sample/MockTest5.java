package com.sample;

public class MockTest5 {
    public static void main(String args[]) throws Exception {
        int[] age = {25, 26, 27, 28, 29};
        int sum = 0;
        try{
            for(int item : age) sum += item;
            System.out.print("Total age =");
            if(sum > 125)
                throw  new Exception(sum+ "is above 125");
            System.out.println("avr age is :"+sum/age.length);
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
