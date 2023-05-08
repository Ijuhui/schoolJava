package idusw.java.oop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) { //args : 명령행 매개 변수

        ArrayList<String> arrayList = new ArrayList<>(); //api 프로그래밍의 기본
        int i = 0;
        while (i < 10){
            arrayList.add("요소" + (10 - i));
            i++;
        }
        arrayList.remove(6);
        for (int j = 0;j < arrayList.size(); j++)
            System.out.println(arrayList.get(j)); //순차 접근
        System.out.println("-----------------------------------------");

        String Temp = new String("");
        for (int j = 0; j < arrayList.size(); j++){
            for (int k = j +1; k < arrayList.size(); k++) //앞 요소가 뒤 요소보다 큰 값
            if(arrayList.get(j).compareTo(arrayList.get(k)) >= 0) {
                Temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(k));
                arrayList.set(k, Temp);
            }
        }

        //Collections.sort(arrayList);

        for(String s : arrayList) // for each statement : 순차 접근에 최적화 되어 있음. 인덱스 관리필요 없음
            System.out.println(s);
        ReverseArrayList<String> reverseArrayList = new ReverseArrayList<>();
        reverseArrayList.add("1");
        reverseArrayList.add("3");
        reverseArrayList.add("5");
        reverseArrayList.add("2");
        reverseArrayList.add("4");
        reverseArrayList.add(3, "7");
        for (String s : reverseArrayList)
            System.out.println(s);

        reverseArrayList.sort("asc");
        reverseArrayList.sort("desc");



        if (args.length > 0){
/*            for (int i = 0; i < 3; i++)
                System.out.println("ping "+ args[0]);

            System.out.println("168.126.63.1에 대한 Ping 통계:");*/
        } else System.out.println("help");
    }
}
