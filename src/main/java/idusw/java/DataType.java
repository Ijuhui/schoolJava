package idusw.java;

public class DataType {
    public void printDataType(){
        byte b = 10;
        b = Byte.MAX_VALUE; // 정적 상수 변수, 이탤릭, 대문자와 언더바로 표현됨
        short s = 128;
        s = 32767; // short 형에 저장할 수 있는 최대값은 32767, 16bit 표현할 수 있는 값의 범위
        int i = 32768;
        i = Integer.MAX_VALUE; // 2147483647 = 0x7ffffffff
        i = Integer.MIN_VALUE-1; // -2147483648. Overflow : 표현 범위를 넘어서 값이 손상됨
        System.out.println(i); //Integer : int 자료형의 Wrapper Class임. int형을 효과적으로 다루기 위해 정의한 클래스
        //기본형 8갖에 대한 8개의 Wrapper class가 존재함
        System.out.println("0x"+Integer.toHexString(202212017));
        System.out.println("0b"+Integer.toBinaryString(202212017));
    }
    public void printMessage(){
        int i = 10; // i 변수는 정수형을 보관할 수 있는 기억공간에 대한 식별자
        var j = "hahaha"; //var 타입 추론, Java SE 10 이후에 등장
        var k = 10.1;
        //System.out.println(i+j+k);
    }
    public void printCode(){
        int i = 10;
        int j = 3;
        double d = 3.0;
        System.out.println(i/j); //3. 정수형의 연산 결과는 정수
        System.out.println(i/d); //3.3333333333 i를 실수형으로 변환, 광역화 형변화
        d = (double) j; //명시적 형변혼, 광역화 형변화, 컴파일러
        d = j; //묵시적 형변환
        j = (int)d; //명시적 형변환, 협소화 형변화, 개발자
        boolean b = true;
        // i = (int)b; //boolean 형은 형변환 금지

        char ch = 'A';
        i = ch; // char는 2byte 문자형, 내부적으로 0~65535로 매칭됨
    }
    public static void main(String[] args){
        new DataType().printMessage(); // 객체를 생성하고 바로 메소드 호출, 익명 클래스라고 함. 참조 변수가 없어서 다음에 참조할 수 없다
        DataType dt = new DataType(); // 객체를 생성하고, dt라는 참조변수에 배정. dt를 통해 객체를 활용할 수 있음
        dt.printMessage();
        dt.printCode();
        new DataType().printDataType();
    }
}
