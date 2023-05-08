package idusw.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {
    public void whoAmI() { //ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함
        System.out.println("I'm MyArrayList Class extended ArrayList");
    }
    // overriding 을 하지 않을 경우 기존 클래스에 정의된 메소드를 상속 받음

    // 상위 클래스인 ArrayList
    public List<E> subList(int fromIndex, int toIndex){ //overriding, 메소드 재정의. overloading(중첩. 메소드 이름만 같음)
        List<E> list = new ArrayList<>();
        list.add((E) "a");
        this.printMsg(); // printMsa() 상속관계 상에 나타날 수도 있는 경우
        return list; //super.subList(fromIndex, toIndex + 1);
    }
    private void printMsg(){
        System.out.println("private method");
    }
}
