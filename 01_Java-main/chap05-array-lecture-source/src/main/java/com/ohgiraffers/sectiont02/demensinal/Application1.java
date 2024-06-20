package com.ohgiraffers.sectiont02.demensinal;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 다차원 배열
         *
         * 다차원 배열은 2차원 이상의 배열을 의미한다.
         * 배열의 인덱스마다 또다른 배열의 주소를 보관하는 배열을 의미한다.
         * -> 2차원 배열은 1차원 배열 여러개를하나로묶어서 관리하는 배열을 의미한다.
         * */

        /*
         * 2차원 배열을 사용하는 방법
         * 1. 배열의 주소를 보관하는레퍼런스 변수 선언(stack)
         * 2. 여러개의 1차원 배열의 주소를 관리하는 배열 생성(heap)
         * 3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
         * 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용
         * */

        int[][] arr;
        int arr2[][];
        // int[] arr[];

        // arr = new int[][]; // 크기를 지정하지 않으면 에러 발생
        // arr2 = new int[][2];
        arr = new int[3][]; // 주소를 묶어서 관리할 배열의 크기를 지정해야함.

        arr[0] = new int[5];
        arr[1] = new int[5];
        arr[2] = new int[6];


        arr2 = new int[3][5];

        // 크기 할당 후에, 아무 값을 대입하지 않아도,
        // heap 영역에는 값이 없는 상태로 공간 생성이 불가능하기 때문에, 기본값이 들어있다.

        // arr2[0]에 있는 배열 값을 출력
        for (int i = 0; i < arr2[0].length; i++) {
            System.out.println(arr[0][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2[1].length; i++) {
            System.out.println(arr2[1][i] + " ");

        }

        for (int i = 0; i < arr2[2].length; i++) {
            System.out.println(arr2[2][i] + " ");

        }
        System.out.println();

        System.out.println("======= 이중 for 문으로 이차원배열 출력 =======");
        for (int j = 0; j < arr2.length; j++) {
            for (int i = 0; i < arr2[j].length; i++) {
                System.out.println(arr2[j][i] + " ");


            }
            System.out.println();

        }


    }
}
