package kt1;

import kt1.Employee;

public class Manager extends Employee {
    private int teamSize;
    public Manager(String name, String position, double salary, int teamSize){
        super(name, position, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15 + getTeamSize() * 1000;
    }
    @Override
    public String toString() {
        return String.format("%s - %s, зарплата %s, размер команды %d", getName(), getPosition(), getSalary(), getTeamSize());
    }
}