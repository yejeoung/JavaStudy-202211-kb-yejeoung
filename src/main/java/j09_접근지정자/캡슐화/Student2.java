package j09_접근지정자.캡슐화;

public class Student2 {
    /*
        school
        name
        year
        gender
     */
    private String school;
    private String name;
    private int year;
    private boolean gender;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isGender() { //boolean은 get이 아닌 is가 붙는다.
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
