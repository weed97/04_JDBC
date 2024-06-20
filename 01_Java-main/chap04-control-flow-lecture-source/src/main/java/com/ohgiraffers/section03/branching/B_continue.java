package com.ohgiraffers.section03.branching;

public class B_continue {

    /*
    * continue 문은 반복문 내에서 사용한다.
    *
    * 해당 반복문의 반복 회차를 중간에 멈추고, 다시 증감식으로 넘어가게 해준다.
    * 일반적으로 if(조건식) { continue; } 처럼 사용한다.
    * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 사용된다.
    * */

    public void testSimpleContinueStatement() {
        // 1~100 사이의 4의 배수이면서 5의 배수인 값 출력

        for(int i = 1 ; i <= 100; i++){

            if((i % 4 == 0) && (i % 5 == 0)) {

                //4와 5의 공배수
                System.out.println(i);
            } else {

                continue;
            }

            System.out.println("공배수를 찾았습니다.");

        }

    }

    public  void testSimpleContinueStatement2(){
        // continue 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 건너뛴다.

        /*
         * 구구단 2~9까지 출력
         * 각 단(dan)의 수(su)가 짝수인 경우 출력을 생략한다.
         * */

        for(int dan = 2; dan < 10; dan++){
            System.out.println(dan + "단 입니다.");

            for(int su = 1; su < 10; su++){

                if(su % 2 == 0) {
                    // su가 짝수일 경우 증감식으로 이동
                    continue;
                }

                System.out.println(dan + "*" + su +  " = " +(dan*su));
            }

            //줄바꿈

            System.out.println();
        }
    }

        public void testJumpContinue() {
        label :
            for(int dan = 2; dan < 10; dan++){
                System.out.println(dan + "단 입니다.");

                for(int su = 1; su < 10; su++){

                    if(su % 2 == 0) {
                        // su가 짝수일 경우 증감식으로 이동
                        continue label;
                    }

                    System.out.println(dan + "*" + su +  " = " +(dan*su));
                }

                //줄바꿈

                System.out.println();
            }
        }
    }

