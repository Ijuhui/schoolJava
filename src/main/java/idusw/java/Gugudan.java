package idusw.java;

public class Gugudan {
    //정적 변수
    static int from = 2;
    //인스턴스(클래스로부터 실체화 된 객체) 변수
    int row = 9;
    static final int COLUMN = 9; //정적 상수 변수 : 프로그램을 실행 시부터 접근 가능, 수정 불가(final)

    public void printSingle(int r) { //지정한 단만 출력
        for (int i = 1; i <= COLUMN; i++) // i : 지역 변수
            System.out.println(r + "X" + i + " = " + (r * i));
    }
    public void printMultiple(int start, int end){
        for(int i= start; i <= end; i++)
        if ((i%3) == 0) printSingle(i);
        else System.out.println(i + "는 3의 배수 아님");
    }



    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for(int i= from; i <= gugudan.row; i++)
            if ((i%3) == 0) gugudan.printSingle(i);
            else System.out.println(i + "는 3의 배수 아님");
    }

    }

