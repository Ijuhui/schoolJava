package idusw.java.oop;

public class AdminMenu extends UserMenu{ // 상속 : inheritance - 중첩(overloading), 재정의(overriding), 메소드 추가
    public void loginMenu(){ // method overriding : 재정의
        System.out.println("2. 로그아웃     3. 등록       4.수정        5.삭제        6.회원목록      7.회원정지");
    }
    public void loginMenu(String str){ // method overloading : 중첩 - 메소드 이름만 같고, 매개변수 타입, 개수 다름
        System.out.println("2. 로그아웃     3. 등록       4.수정        5.삭제        6.회원목록      7.회원정지");
    }
    public void customerMethod(){
        System.out.println("커스텀 메소드 추가");
    }
}
