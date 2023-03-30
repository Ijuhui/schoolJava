package idusw.java;

public class StatementTest { //public 클래스는 파일명과 같아야 함
    public static final double PI = 3.141592; //PI : 상수 변수(대문자를 사용함), 3.141592 : 실수 리터럴
    //final : 고치고 싶지 않은 변수(수정 불가)
    public static double noFinal = 3.141592; //noFinal : 변수, 3.141592 : 실수 리터럴
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        int i = Integer.MAX_VALUE;
        i += 1;
        System.out.println(i);
        IfStatement ifStm1 = new IfStatement(10, 5);
        IfStatement ifStm2 = new IfStatement(10, 20);
        ifStm1.printIfTest();
        ifStm2.printIfTest();
    }
}

class IfStatement{
    int i; //인스턴스, private 접근 수정자를 사용하는 경우가 많음
    private int j;
    public IfStatement(int i, int j){ //객체 초기화 시 i, j 값이 결정됨
        this.i = i; //i는 매개변수, this.i 는 인스턴스(현재 클로스로부터 생성된 객체) 변수
        this.j = j;
    }
    public void printIfTest(){
        if(i >= j) System.out.println(i + "와 " +  j + "를 비교했을 때 더 큰 것은 " + i);
        else System.out.println(i + "와 " + j + "를 비교했을 때 더 큰 것은 " + j);
    }
}