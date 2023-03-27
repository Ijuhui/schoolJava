package idusw.java;

public class StatementTest {
    public static void main(String[] args){
        IfStatement ifStm1 = new IfStatement(10, 5);
        IfStatement ifStm2 = new IfStatement(10, 20);
        ifStm1.printIfTest();
        ifStm2.printIfTest();
    }
}

class IfStatement{
    int i;
    int j;
    public IfStatement(int i, int j){ //객체 초기화 시 i, j 값이 결정됨
        this.i = i; //i는 매개변수, this.i 는 인스턴스(현재 클로스로부터 생성된 객체) 변수
        this.j = j;
    }
    public void printIfTest(){
        if(i >= j) System.out.println(i + "와" + j + "를 비교했을 때 더 큰 것은 " + i);
        else System.out.println(i + "와" + j + "를 비교했을 때 더 큰 것은 " + j);
    }
}