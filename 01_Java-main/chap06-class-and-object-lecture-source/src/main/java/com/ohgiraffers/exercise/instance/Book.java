package com.ohgiraffers.exercise.instance;

public class Book {
    //Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.
    private String writer;
    private String bookName;
    private int pageNumber;
    private String coverOption;




    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setCoverOption(String coverOption) {
        this.coverOption = coverOption;
    }


    public String bookGetInfo() {
        return "북 저자는 " + this.writer + "입니다" + "북 이름은 " + this.bookName + "입니다" + "페이지수는 " + this.pageNumber +"입니다." +"커버종류는 " +this.coverOption + "입니다." ;

    }



}
