package com.hp.git;

public class Demo {
    public static void main(String[] args) {

        c1:for (int i = 0; i < 10; i++) {
            System.out.println("循环打印");
            if (i == 4){
                break c1;
            }
            System.out.println("结束");


        }
    }
}
