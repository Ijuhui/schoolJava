package idusw.java.pim.controller;

import idusw.java.pim.domain.Member;
import idusw.java.pim.service.MemberService;

public class MemberController {
    private MemberService memberService;
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
    public String registerRequest(Member m){
        String result = null;
        return result;
    }
    public String detailInfoRequest(Member m){
        String result = null;
        return result;
    }
    public String listRequest(){
        String result = null;
        return result;
    }
}
