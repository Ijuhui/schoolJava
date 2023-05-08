package idusw.java.inheritance;

public class NewArrayList<E> extends MyArrayList<E> {
    // < > 제너릭(generic) : 컴파일 시점에 타입 체크하여 오류 발생을 방지
    public void whoAmI() { //ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함
        System.out.println("I'm NewArrayList Class extended MyArrayList");
    }
    public void whoAmI2() { //ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함
        System.out.println("I'm NewArrayList Class extended MyArrayList");
    }
}
