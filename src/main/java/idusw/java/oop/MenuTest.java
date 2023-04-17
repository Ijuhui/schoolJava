package idusw.java.oop;

import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        //사전 등록된 계정 정보
        String rootID = "root";
        String rootPW = "cometrue";
        String userID = "dream";
        String userPW = "cometrue";
        boolean login = false; //로그인에 성공하면 true, 미 로그인 상태이면 false
        UserMenu userMenu = new AdminMenu();//new UserMenu();
        //참조 변수를 통해 객체와 상호작용
        Scanner sc = new Scanner(System.in); //키보드 입력을 받고, 공백 문자로 구분하여 어휘를 반환해주는 클래스
        userMenu.showMenu(login);
        System.out.println("아이디를 입력하세요");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String pw = sc.next();
        System.out.println("아이디: " + id + "\n패스워드: " + pw);
        if (id.equals(rootID) && pw.equals(rootPW)){ // ==: 동등 연산자, 객체가 같은지 비교. equals: 값이 같은지 비교
            login = true;
            userMenu.showMenu(login);
        }
        else
            userMenu.showMenu(login);
    }
}
