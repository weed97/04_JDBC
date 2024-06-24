package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;


public class ElementTextService  {

    private ElementTextMapper mapper;

    public void selectCacheTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTextMapper.class);
        for (int i = 0; i < 10; i++) {
        // 조회시간 확인 용 시간 시간
        Long startTime = System.currentTimeMillis();

        List<String> nameList = mapper.selectCacheTest();
        System.out.println(nameList);

        // 조회 시간 확인 용 종료 시간
        Long endTime = System.currentTimeMillis();

        // 총 소요 시간 출력
        Long interval = endTime - startTime;
        System.out.println("수행시간 : " + interval + "(ms)");
    }
        sqlSession.close();
    }

    public void selectResultMapTest() {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTextMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();

        for(MenuDTO menuDTO : menuList) {
            System.out.println(menuList);
        }

        sqlSession.close();
    }
}
