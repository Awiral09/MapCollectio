public class Employee {
    private int empNo;
    private String empName;
    private String empDept;
    private double empSal;


    Employee(int empNo, String empName, String empDept, double empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
