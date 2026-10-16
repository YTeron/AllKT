package kt2;

public class Car extends Vehicle implements Insurable{
    private  int seats;
    public Car(String plateNumber, double dailyRate,int seats) {
        super(plateNumber, dailyRate);
        this.seats =seats;
    }

    @Override
    public double getInsuranceFee() {
        return dailyRate *0.05;
    }

    @Override
    public double calculateRentalCost(int days) {

        return days>7? dailyRate *days * 0.9 : dailyRate *days;
    }
}
