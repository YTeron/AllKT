package kt2;

import java.util.Objects;

public abstract class Vehicle {
    protected String plateNumber;
    protected double dailyRate;
    public Vehicle(String plateNumber,double dailyRate){
        this.plateNumber = plateNumber;
        this.dailyRate = dailyRate;
    }
    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return String.format("%s - %.2f Р/сутки",plateNumber,dailyRate);
    }
    @Override
    public boolean equals(Object objects) {
        if (this == objects) return true;
        if (objects == null || getClass() != objects.getClass()) return false;
        Vehicle vehicle = (Vehicle) objects;
        return Objects.equals(plateNumber, vehicle.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }
}
