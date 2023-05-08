package idusw.java.fundmetals;

public class Student {
    private Long hakbun;
    private String name;
    private Grade grade;

    public Student(Long hakbun, String name, Grade grade) {
        this.hakbun = hakbun;
        this.name = name;
        this.grade = grade;
    }

    public Long getHakbun() {
        return hakbun;
    }

    public void setHakbun(Long hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
