package idusw.java.inheritance;

import java.lang.String; //기본 패키지 : java.lang.* -> import 필요 없음
import java.util.ArrayList; // import : 현재 클래스와 다른 패키지에 위치한 클래스에 대한 정보 제공
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InheritanceTest {
    public static void main(String[] args) {
        // JCF : Java Collection Framework, 집합 개체들을 효율적으로 다루기 위한 클래스 라이브러리 모음
        // java.util 패키지에 포함되어 있음

        List<String> list = new ArrayList<>();
        List<String> stringArrayList = new MyArrayList<>();
        list = stringArrayList; //up cast : sub -> super class, 명시 / 묵시 모두 가능
        ((MyArrayList<String>)list).whoAmI();
        List<String> newArrayList = new NewArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("d");
        stringArrayList.add("c");
        stringArrayList.add("e");

        ((MyArrayList<String>)stringArrayList).whoAmI();
        ((NewArrayList<String>)newArrayList).whoAmI2(); //다운 캐스팅(dawn casting) : super -> sub, 명시적이어야 함

        //for each statement 사용, for 문도 가능
        for (String s: stringArrayList)
            System.out.printf("%4s", s); //print or println() 문을 선호함
        System.out.println("\n Sorting");

        Collections.sort(stringArrayList);
        for (String s: stringArrayList)
            System.out.printf("%4s", s); //print or println() 문을 선호함

        System.out.println("\n SubList");
        List<String> temp = stringArrayList.subList(2, 3); //List 인터페이스를 구현한 클래스 중 하나가 ArrayList임
        for (String s: temp)
            System.out.printf("%4s", s); //print or println() 문을 선호함
    }
}
