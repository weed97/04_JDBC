package com.ohgiraffers.section01.list.run;

import java.time.LocalDateTime;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 컬렉션 프레임워크(Collection Framework)
         * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         * 표준화 된 방법을 제공하는 클래스들의 집합이다.
         * => 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스 집합
         * */

        /*
         * Collection FameWork 는 크게 3가지 인터페이스 중 한 가지를 상속 받아 구현해 두었다.
         * 1. List 인터페이스
         * 2. Set 인터페이스
         * 3. Map 인터페이스
         *
         * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의
         * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의되지 않음.
         * */


        /*
         * 각 인터페이스 별 특징
         * 1. List 인터페이스
         * - 순서가 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
         * - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
         * 2. Set 인터페이스
         * - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
         * - HashSet, TreeSet 등이 있다.
         * 3. Map 인터페이스
         * - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
         * - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고, 중복된 key를 허용하지 않는다.
         * - HashMap, TreeMap, HashTable, Properties 등이 있다.
         * */

        /*
         * ArraayList
         * -> 배열의 단점을 보완하기위해 만들어졌다.
         * 배열의 단점 : 크기 변경 불가, 요소의 추가, 수정, 삭제, 정렬 복잡함
         * 크기 변경(새로운 더큰 배열 만들고 옮기기), 요소의 추가, 수정, 삭제, 정렬 기능을
         * 미리 메소드로 구현해서 제공한다.
         * */

        ArrayList<Object> aList = new ArrayList();

        /*
         * 다형성을 적용해 상위 레퍼런스로 ArrayList 객체를 만들 수 있다.
         * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
         * 레퍼런스 타입은 List로 해두는게 더 유연한 코드를 작성 가능하다.
         * */
        List<Object> list = new ArrayList<>();

        /*
         * arrayList는 저장 순서가 유지되며, index(순번)이 적용된다.
         * Object 클래스의 하위 타입 인스턴스를 모두 저장 가능
         * */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        // toString 메서드가 오버라이딩 되어있음
        System.out.println("list : " + list);

        // arrayList의 크기는 size() 확인할 수 있다.
        // size()는 사실 요소의 갯수를 반환한다.
        System.out.println("list의 size : " + list.size());

        // 인덱스가 지정되어있기 때문에 for문으로 접근 가능
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " : " + list.get(i));
        }

        // arrayList는 데이터의 중복저장을 허용한다.
        list.add("apple");
        System.out.println("list = " + list);

        /*
         * 원하는 인덱스 위치에 값을 추가할 수 있다.
         * 새로운 값이 들어가는 인덱스 위치에 값을 넣고, 이후 인덱스는 하나씩 뒤로 밀리게 된다.
         * */
        list.add(1,"banana");
        System.out.println("list = " + list);

        /*
         * 저장된 값을 삭제할 때는 remove() 메서드를 사용한다.
         * 중간 인덱스의 값을 삭제할 경우, 자동으로 인덱스를 하나씩 앞으로 당긴다.
         * */
        list.remove(2);

        System.out.println("list = " + list);

        // 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다.
        List<String> stringList = new ArrayList<>();
        // 타입을 지정해서 타입 이외의 인스턴스는 저장하지 않을 수 있다.
        // stringList.add(123);
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList : " + stringList);

        /*
         * sort 정렬
         * Collection -> 인터페이스 -> 바로사용불가
         * Collections 클래스를 사용 -> Collection 사용되는 기능을 static 메서드로 구현한 클래스
         * */
        Collections.sort(stringList);
        //Collections.reverse(stringList);

        System.out.println("stringList = " + stringList);

        /*
         * ArrayList에는 기본적으로 역순으로 정렬하는 기능이 제공되지 않는다.
         * LinkedList decendingIterator() 메소드를 사용하면
         * 내림차순으로 정렬된 Iterator 타입의 목록으로 반환된다.
         * */

        /*
         * Iterator
         * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성 할 수 있다.
         * 컬렉션에서 값을 읽어오는 방식을 통일되게 제공하기 위해서 사용
         *
         * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는경우 false 반환
         * next() : 다음요소를 반환
         * */

        stringList = new LinkedList<>(stringList);

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

        List<String> descList = new ArrayList<>();

        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);

    }
}