public class Student extends StudentHeightComparator {
    private int sno;
    private String name;
    private String course;
    private double fee;
    private double height;

    public Student(int sno, String name, String course, double fee, double height) {
        this.sno = sno;
        this.name = name;
        this.course = course;
        this.fee = fee;
        this.height = height;
    }


    public String toString() {
        return "\n" + sno +
                " " + name + '\'' +
                " " + course + '\'' +
                " " + fee +
                " " + height;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
