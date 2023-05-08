package idusw.java.oop;

import java.util.ArrayList;

public class ReverseArrayList<E> extends ArrayList<E> { // 상속 : 기존의 클래스를 활용하여 새로운 클래스를 정의, 생산성, 신뢰성

    public void add(int index, E e){ // 재정의, overriding : 기존 메소드를 사용하지 못함

    }


    public void sort(String direction){ //overloading : 중첩 (기능 확장)
        if(direction.equals("asc")){
            System.out.println("오름차순 정렬");
        }
        else if(direction.equals("desc"))
            System.out.println("내림차순 정렬");
        else
            System.out.println("잘못된 정렬 요청입니다.");
    }

    public void induk () { //메소드 추가

    }

}
