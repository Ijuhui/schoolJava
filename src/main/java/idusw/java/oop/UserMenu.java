package idusw.java.oop;

public class UserMenu {
    public void showMenu(boolean login){
        if(!login)
            preLoginMenu();
        else
            loginMenu();
    }
    public void preLoginMenu(){
        System.out.println("0. 종료       1. 로그인");
    }
    public void loginMenu(){
        System.out.println("2. 로그아웃     3. 등록       4.수정        5.삭제");
    }

}
