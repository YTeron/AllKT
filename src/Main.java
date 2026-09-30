//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee =new Employee("DASHA","Builder",10000);
        Employee employee2 =new Employee("DASHA","Builder",-10000);
        System.out.println(employee2);
        System.out.println( Employee.getEmployeeCount());
        Manager manager =new Manager("DASHA","Builder",10000,20);
        manager.setSalary(manager.calculateBonus());
        System.out.println(manager);
        Employee[] staff = {
                new Employee("Иван",   "Разработчик",     80000),
                new Employee("Пётр",   "Тестировщик",     70000),
                new Manager("Ольга",   "Руководитель",   120000, 2),
                new Manager("Сергей",  "Директор",       200000, 120)
        };

        for (Employee item : staff) {
            System.out.println(item);
            System.out.printf("Премия: %s%n", item.calculateBonus());
        }
        int managerCount = 0;
        for (Employee item : staff) {
            if (item instanceof Manager) {
                Manager manager1 = (Manager) item;
                managerCount++;
                System.out.printf("Manager: имя: %s, команда: %d%n", manager1.getName(), manager1.getTeamSize());
            }
        }
        System.out.println("Всего менеджеров: " + managerCount);
        System.out.println(Employee.totalBonusBudget(staff));
    }
}