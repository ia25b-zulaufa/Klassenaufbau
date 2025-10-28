package exercise3;

import java.math.RoundingMode;

public class Car {
  public double fuelLevel;
  public double mileage;
  public String licensePlate;
  public double fuelConsumption;
  public int fuelCapacity;

  public Car(String licensePlate, double mileage, int fuelCapacity, double fuelConsumption, double fuelLevel) {
      this.licensePlate = licensePlate;
      this.mileage = mileage;
      this.fuelCapacity = fuelCapacity;
      this.fuelConsumption = fuelConsumption;
      this.fuelLevel = fuelLevel;
  }

  public void drive(int distance) {
      double tempFuelLevel = fuelLevel - (fuelConsumption * distance);
      double tempMileage = mileage + distance;

      if (tempFuelLevel < 0){
          tempMileage = mileage + (fuelLevel / fuelConsumption);
          tempFuelLevel = 0;
      }
      fuelLevel = tempFuelLevel;
      mileage = Math.round(tempMileage * 100d) / 100d;
  }

  public void refuel(int amount) {
    fuelLevel += amount;
    if (fuelLevel > fuelCapacity) {
        fuelLevel = fuelCapacity;
    }
  }

  public String toString() {
      return "Car{" +
              "licensePlate='" + licensePlate + '\'' +
              ", mileage=" + mileage +
              ", fuelConsumption=" + fuelConsumption +
              ", fuelCapacity=" + fuelCapacity +
              ", fuelLevel=" + fuelLevel +
              '}';
  }
}
