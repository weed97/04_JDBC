package com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findALLMembers() {

        Member[] foundMembersFromRepository = MemberRepository.findAllMembers(); // Member Repository의
        // Member Repository 필드로 있는 10 크기의 Member[]

        return MemberRepository.findAllMembers();
    }
}
