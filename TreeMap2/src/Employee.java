public class Employee implements Comparable<Employee> {
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
        return "\n" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSal=" + empSal;
    }

    @Override
    public int compareTo(Employee employee) {
//        int deptDiff = this.empDept.compareTo(employee.empDept);
//        if (deptDiff == 0)
        return this.empNo - (employee.empNo);
//            return employee.empNo - this.empNo;
//        return deptDiff;
    }
}
