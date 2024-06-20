package com.ohgiraffers.section02.loopling;

public class Ex_Star {
    public void forStar1() {

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");

            }

            System.out.println();
        }
    }

    public void forStar2() {
        System.out.println();

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void forStar3() {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print(" ");

            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void forStar4() {

        System.out.println();
        int num = 1;
        for (int i= 0; i< 5; i++ ) {

            for (int k = 4; k>i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < num; j++)
            {
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }
    }
}




