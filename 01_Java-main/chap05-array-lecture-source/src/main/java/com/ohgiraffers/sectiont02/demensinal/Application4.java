package com.ohgiraffers.sectiont02.demensinal;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 가별배열
        *
        * 할당과 동시에 블록을 이용해서 초기화가 가능하다.
        * */

        // 정변배열
        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        // 반복문을 이용한 출력
        System.out.println(" =========== 정변 배열 ===========");
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.println(iarr[i][j] + " ");

            }
            System.out.println();

        }

        int[][] iarr2 = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        System.out.println(" ========= 가변배열 =========");
        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2.length; j++) {
                System.out.println(iarr2[i][j] + " ");


            }
            System.out.println();

        }
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[][] iarr3 = {arr1, arr2};
        System.out.println("================= 미리 할당한 배열을 이용한 방식 ===============");
        for (int i = 0; i < iarr3.length; i++) {
            for (int j = 0; j < iarr3.length; j++) {
                System.out.println(iarr3[i][j] + " ");


            }
            System.out.println();
        }



    }
}
