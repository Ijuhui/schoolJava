package idusw.java.fundmetals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in); //키보드 입력을 받아 지정된 유형으로 반환
        int count = 0;
        do {
            System.out.println("학번 : ");
            Long id = sc.nextLong(); // 숫자 문자열이어야 함 // Long.valueOf("202212017L"); //
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("국어 성적 : ");
            Double korean = sc.nextDouble();
            System.out.println("수학 성적 : ");
            Double math = sc.nextDouble();
            System.out.println("물리 성적 : ");
            Double physics = sc.nextDouble();

            Grade grade = new Grade(korean, math, physics);
            Student student = new Student(id, name, grade);
            studentList.add(student);
            count++;
        }while(count < 5);

        for(Student student : studentList){
            Grade grade = student.getGrade();
            System.out.format("%10d %10s %7.2f %7.2f\n", student.getHakbun(), student.getName(), grade.calcAberage(), grade.calcSum());
        }
    }
}
