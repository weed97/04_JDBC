package com.ohgiraffers.section04.sort;

public class Application2 {
    // 순차정렬
    // 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 알고리즘
    public static void main(String[] args) {
        // 정렬할 배열
        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) {

            for (int j = 0; j < i; j++) {

                if (iarr[i] < iarr[j]) {
                    int temp;       // 2회차
                    temp = iarr[i]; //iarr[2] : 4 < iarr[0] : 2
                    iarr[i] = iarr[j]; // iarr[2] : 4 < iarr[1] : 5
                    iarr[j] = temp; // temp = iarr[2] : 4

                    // iarr[2] = iarr[1] : 5
                    // iarr[1] =temp : 4
                    //{2,4,5,6,1,3}
                    // 3회차(i = 3)
                    // iarr[3] : 6 < iarr[0] : 2
                    // iarr[3] : 6 < iarr[1] : 4
                    // iarr[3] : 6 < iarr[2] : 5
                    // 4회차 (i =4)
                    //  iarr[4] : 1 < iarr[0] : 2
                    //  temp = iaar[4] : 1
                    //  iarr[4] = iarr[0] : 2
                    //  iarr[0] = temp : 1
                    //  {1,4,5,6,2,3}
                    //  iarr[4] : 2 < iarr[1] : 4
                    // temp = iarr[4] : 2
                    // iarr[4] = iarr[1] : 4
                    // iarr[1] = temp
                    // {1,2,,5,6,4,3}
                    // iarr[4] < iarr[2] : 5
                    // temp = iarr[4] : 4
                    // iarr[4] =iarr[2] : 5
                    // iarr[2] = temp : 4
                    // {1,2,4,6,5,3}
                    // iarr[4] : 5 < iarr[3] : 6
                    // temp = iarr[4] : 5
                    // iarr[4] = iarr[3] : 6
                    // iarr[3] = temp : 5
                    // {1,2,4,5,6,3}
                    // 5회차 (i =5)
                    //      iarr[5] : 3 < iarr[0] : 1
                    //      iarr[5] : 3 < iarr[1] : 2
                    //      iarr[5] : 3 < iarr[2] : 4
                    //      temp = iarr[5] : 3
                    //      iarr[5] = iarr[2] :4
                    //      iarr[2] = temp : 3
                    //      {1,2,3,5,6,4}
                    //      iarr[5] : 4 < iarr[3] : 5
                    //      temp =iarr[5] :4
                    //      iarr[5] = iarr[3] : 5
                    //      iarr[3] = temp : 4
                    //      {1,2,3,4,6,5}
                    //      iarr[5] : 5 < iarr[4] : 6
                    //      temp = iarr[5] : 5
                    //      iarr[5] = iarr[4] : 6
                    //      iarr[4] = temp : 5
                    //      {1,2,3,4,5,6}

                }
            }
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");



        }

    }
}
