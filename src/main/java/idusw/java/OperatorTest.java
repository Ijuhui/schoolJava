package idusw.java;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;

public class OperatorTest {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.printValue();
        operator.printValueByShift();
        operator.printList();
        operator.printGaussian();
    }
}

class Operator {
    int base = 4;
    int multiple = 5; //2의 10제곱을 의미함
    public void printValue(){
        int result = 1;
        for (int i = 1; i <= multiple; i++) //제어 변수 비교 시 변수를 사용하여 수정이 용이하다
            result = result * base;
        System.out.println(base + "의 " + multiple + "제곱 값은: " + result);
    }
    public void printValueByShift(){
        int result = 1 << 10;
        int result1 = base << (multiple -1); //shift : 2진법 연산, 비트 연산, 왼쪽으로 한 비트씩 이동
        // 0000 0100 << 1 -> 0000 1000 으로 쉬프트 연산, 2를 곱한 효과
        System.out.println(base + "의 " + multiple + "2배씩 반복한 값은: " + result1);
    }
    public void printList(){ //1~100의 합을 출력
        int i, sum = 0, to = 10000;
        long s = System.nanoTime();
        for(i = 1; i <= to; i++){ // i: 제어변수 초기화 -> 조건 확인 -> 제어변수 수정 -> 조건 확인
            sum = sum + i;
        }
        long e = System.nanoTime();
        System.out.println(sum + ":" + (e-s));
    }
    public void printGaussian(){
        int from, to, result = 0;
        from = 1; to = 10000;
        long s = System.nanoTime();
        result = (from + to) * (to - from) / 2;
        long e = System.nanoTime();
        System.out.println(result + ":" + (e-s));
        double doubleVar1 = 1.0;
        double doubleVar2 = 0.9;
        double diff = doubleVar1 - doubleVar2;
        System.out.println(diff);

        BigDecimal bd1 = new BigDecimal(doubleVar1);
        BigDecimal bd2 = new BigDecimal(doubleVar2);
        BigDecimal bddiff = new BigDecimal(0.0);
        bddiff = bd1.subtract(bd2); //좀 더 정확한 값(더 많은 유효 숫자)를 구할 수 있다
        System.out.println(bddiff.toString());
    }
}
