package idusw;

public class Main {
    public String method1(){ //일반 메소드 : 객체가 생성된 후 사용 가능함 (객체가 생성된다는 것은 메모리에 적재된다는 것)
        method2();
        return "first";
    }
    public String method2(){
        method3();
        return "second";
    }
    public String method3(){
        return "third";
    }
    public static void main(String[] args) { //main 메소드 - static 메소드
        Main m = new Main(); // Main이라는 클래스로부터 객체를 생성함(Heap 영역에 적재), m이라는 참조변수에 배정
        m.method1(); //m은 stack에 저장됨, 4byte, 개게의 참조 정보(주소)를 가짐
        int k = 0;
        var l = 10;
        var n = "10";
        {
            int i = 10;
            int j = 100;
            System.out.println(i+j);
        }
        //System.out.println(i+j);
        System.out.println(k);
    }
}