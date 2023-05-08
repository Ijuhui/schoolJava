package idusw.java.pim;

import idusw.java.pim.service.MemberService;
import idusw.java.pim.service.MemberServiceImpl;

public class PimApplication {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
    }
}
