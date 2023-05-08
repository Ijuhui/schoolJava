package idusw.java.pim.service;

import idusw.java.pim.domain.Member;

import java.util.List;

public class MemberServiceImpl implements MemberService { //정의한 인터페이스를 구현
    @Override
    public int create(Member m) {
        System.out.println("멤버 등록 서비스 구현 코드 : ");
        return 0;
    }

    @Override
    public Member readById(Member m) {
        System.out.println("멤버 조회 서비스 구현 코드 : ");
        return null;
    }

    @Override
    public List<Member> readList() {
        System.out.println("멤버 목록 서비스 구현 코드 : ");
        return null;
    }

    @Override
    public int update(Member m) {
        System.out.println("멤버 수정 서비스 구현 코드 : ");
        return 0;
    }

    @Override
    public int delete(Member m) {
        System.out.println("멤버 탈퇴 서비스 구현 코드 : ");
        return 0;
    }

}
