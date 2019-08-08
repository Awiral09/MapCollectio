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
                empNo +
                ", " + empName +
                ", " + empDept +
                ", " + empSal;
    }

   /* @Override
    public int compareTo(Employee employee) {
        int depDiff = this.empDept.compareTo(employee.empDept);
        if(depDiff == 0)
            return this.empNo - employee.empNo;
        return depDiff;
    }*/

    @Override
    public int compareTo(Employee employee) {
        int depDiff = this.empDept.compareTo(employee.empDept);
        if (depDiff == 0)
            return this.empNo - employee.empNo;
        return depDiff;
    }
}


