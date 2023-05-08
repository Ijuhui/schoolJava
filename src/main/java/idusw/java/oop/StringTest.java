package idusw.java.oop;
// package : 연관성 높은 클래스, 인터페이스, 열거형 등의 모음
// import : 현재 클래스를 컴파일 하거나 객체화 된 후 동작할 때 필요한 클래스 라이브러리에 대한 정보를 제공
import java.lang.String; // 자동으로 java.lang 패키지 안에 있는 클래스들을 import 함
import java.lang.reflect.Array;
import java.util.ArrayList;

import idusw.java.Day;

public class StringTest {
    public static void main(String[] args){
        String greeting = "안녕"; //String 객체
        String name = new String("fighting");
        char[] aka = {'f', 'i', 'g', 'h', 't', 'i', 'n', 'g'}; // 문자열 객체와 문자 배열은 다르다

        // String 객체 10개를 저장할 수 있는 자료구조를 생성하고, 참조변수에 배정함
        String[] stringArray = new String[10];
        ArrayList<String> stringArrayList = new ArrayList<>(10);

       /* String[] newArray = new String[15];
        for (int i = 0; i < newArray.length; i++)
            newArray[i] = stringArray[i];
        //5개의 String 추가할 수 있음

       */

        for (int i = 0 ; i < 15; i++)
            stringArrayList.add("str" + i);
        for(String s : stringArrayList)
            System.out.println(s + ",");


        System.out.println(greeting + " ");

        for(int i = 0 ; i < name.length(); i++)
            System.out.println(name.charAt(i));

        for (int i = 0; i<aka.length; i++){
            System.out.println(aka[i]);
        }

        System.out.println(Day.Monday); // 다른 패키지에 포함된 클래스(인터페이스형, 열거형, 그 외 기타)
        AdminMenu adminMenu = new AdminMenu(); // 같은 패키지에 포함된 클래스는 import 필요 없음
    }
}
