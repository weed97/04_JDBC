package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }


    public void printMenu(MenuDTO menu) {
        System.out.println(menu);
    }


    public void printSucessMessage(String sucessCode) {

        String sucessMessage = "";
        switch (sucessCode) {

            case "insert" : sucessMessage = "신규 메뉴 등록을 실패했습니다."; break;
            case "update" : sucessMessage = "신규 메뉴 수정을 실패했습니다."; break;
            case "delete" : sucessMessage = "신규 메뉴 삭제을 실패했습니다."; break;
        }

        System.out.println(sucessMessage);
    }
    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "메뉴 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신규 메뉴 등록을 실패했습니다."; break;
            case "update" : errorMessage = "신규 메뉴 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "신규 메뉴 삭제을 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
