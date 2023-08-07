public abstract class Officer {
    private String code;
    private String name;
    private int registerNumber;
    protected double salary;
    private Department department;

    public Officer(String code, String name, int registerNumber, int salary) {
        this.code = code;
        this.name = name;
        this.registerNumber = registerNumber;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public abstract double salaryCalculaion();

}
