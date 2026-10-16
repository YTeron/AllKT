package kt2;

import java.util.*;

public class BootKT2 {
    public static void boot(){
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("AAA123",1,2));
        fleet.add(new Truck("BEC103",1.5,2.5));
        fleet.add(new Motorcycle("BNM432",1,5.5));
        fleet.add(new Car("TYE753",2,4));
        fleet.add(new Car("YTE234",30,6));
        fleet.forEach(vehicle -> System.out.println(vehicle));

        Set<String> set =new HashSet<>();
        fleet.forEach(vehicle -> set.add(vehicle.plateNumber));
        System.out.println("Всего машин в автопарке: " + fleet.size());
        System.out.println("Уникальных номеров:    " + set.size());

        if (set.size() == fleet.size()) {
            System.out.println("Дубликатов номеров нет.");
        } else {
            System.out.println("Есть дубликаты! Количество повторяющихся записей: " + (fleet.size() - set.size()));
        }
        Map<String,Vehicle> byPlate =new HashMap<>();
        fleet.forEach(vehicle -> byPlate.put(vehicle.plateNumber, vehicle));
        System.out.println(byPlate.get("YTE234"));

        Set<Vehicle> set2 = new HashSet<>();
        set2.add(new Car("AAA123", 100, 4));
        set2.add(new Car("AAA123", 999, 2));
        set2.add(new Truck("BEC103", 50, 5));

        System.out.println(set2.size());
        System.out.println(set2);
        set2.forEach(System.out::println);

        Queue<Vehicle> serviceQueue = new LinkedList<>();

        serviceQueue.offer(new Car("AAA123", 100, 4));
        serviceQueue.offer(new Truck("BEC103", 50, 5));
        serviceQueue.offer(new Motorcycle("BNM432", 30, 0.6));

        System.out.println("В очереди: " + serviceQueue.size() + " авто");

        int number = 1;
        while (!serviceQueue.isEmpty()) {
            Vehicle v = serviceQueue.poll();
            System.out.println("Обслуживаем " + number + ": " + v);
            number++;
        }
        System.out.println("Очередь пуста: " + serviceQueue.isEmpty());
    }
}
