package com.ohgiraffers.section04.use2;

public class DatabaseSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {
        System.out.println("Database에 저장 성공 했습니다.");
        return true;

    }
}
