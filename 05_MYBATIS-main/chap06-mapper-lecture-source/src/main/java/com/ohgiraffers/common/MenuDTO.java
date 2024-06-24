package com.ohgiraffers.common;


import lombok.*;

@NoArgsConstructor // 매개변수 없는 기본 생성자
@AllArgsConstructor // 매개변수 있는 모든 생성자
@Getter // 게터
@Setter // 세터
@ToString // 투스트링
public class MenuDTO {
    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;




}
