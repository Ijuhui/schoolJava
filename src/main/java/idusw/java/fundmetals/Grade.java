package idusw.java.fundmetals;

public class Grade {
    /* 클래스 : 객체의 정의, 객체를 생성할 수 있음
    vs
    추상 클래스 : 하나 이상의 추상 메소드(메소드 선언으로만 구성)를 포함하는 클래스
    vs
    인터페이스 : 필드와 메소드 선언 및 default 메소드로 구성된 프로그래밍 요소, 외부 활용 방법에 대한 정의
    */
    private Double korean; //인스턴스 변수의 경우 초기화를 하지 않는 경우 기본값으로 초기화함
    private Double math;
    private Double physics;

    public Grade(Double korean, Double math, Double physics) {
        // @AllArgsConstructor Annotation(애노테이션) : lombok library 추가 되어있어야 함
        this.korean = korean;
        this.math = math;
        this.physics = physics;
    }

    public Double calcSum(){
        // return Double.valueOf("1.0");
        return korean + math + physics;
    }
    public Double calcAberage(){
        //return Double.valueOf("1.0");
        return calcSum() / 3;
    }
    // Lombok Library 사용하지 않고 직접 생성

    public Double getKorean() {
        return korean;
    }

    public void setKorean(Double korean) {
        this.korean = korean;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }
}
