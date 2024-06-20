package com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider {
    @Override
    public boolean save(String data) {
        System.out.println("["+ data +"]"  +"내용을" + " 파일저장이 실패했습니다.");
        return false;
    }

    // saveProvider를 상속받고, save()를 구현해라.
    // return은 무조건 false
    // 안내문구는 "파일저장이 실패했습니다."
}
