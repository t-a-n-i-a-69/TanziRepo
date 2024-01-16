package com.sample;

public class MockTest2 {
    public static void main(String args[]){
        try{
            int a =1;
            int b =10/a;
            try{
                if(a ==1) a=a/a-a;
                if(a==2){
                    int c[] = {1};
                    c[8] = 9;
                }
            }finally {
                System.out.print("Over");
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        finally {
            System.out.print("End");
        }
    }
}
