package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Queue
        * 선입선출(FIFO -First IN First Out)방식의 자료구조
        * Queue 인터페이스를 상속받는 하위 인터페이스들
        * Deque, BlockingQueue, TransferQueue 등
        * 대부분의 큐는 LinkedList를 이용한다.
        * */

        // Queue는 인터페이스 이기 때문에 자체로 인스턴스 생성이 불가능
        // Queue<String> que  = new Queue<String>();


        Queue<String> que = new LinkedList<>();
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        * 큐에서 데이터를 꺼내는 방식
        * peek() : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환
        * poll : 해당 큐에 가장 앞에 있는 요소(먼저 들어온 요소)를 반환, 반환 후 제거
        * */

        System.out.println("peek() : " + que.peek());
        System.out.println("poll() : " + que.poll());
        System.out.println("que = " + que);




    }

}
