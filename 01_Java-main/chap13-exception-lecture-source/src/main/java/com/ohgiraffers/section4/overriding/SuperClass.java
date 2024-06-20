package com.ohgiraffers.section4.overriding;

import java.io.IOException;

public abstract class SuperClass {
    // 부모의 예외처리 클래스보다 상위의 예외로는 후손클래스에서 오버라이딩 할 수 없다.
    public abstract void method() throws IOException;
}
