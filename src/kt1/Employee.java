package kt1;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private static int employeeCount;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = (salary >= 0) ? salary : 0;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public static double totalBonusBudget(Employee[] staff){
        double itog=0;
        for (int i =0; i<staff.length;  i++){
            itog+= staff[i].calculateBonus();
        }
        return itog;
    }

    public void setSalary(double salary) {
        this.salary = (salary >= 0) ? salary : 0;
    }

    public double calculateBonus() {
        return (getSalary()*0.1);
    }

    @Override
    public String toString() {
        return String.format("%s - %s, зарплата %s", getName(), getPosition(), getSalary());
    }
}
