import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", LocalDate.of(2022,5,2),new BigDecimal(120000),TypeCar.SEDAN);
        System.out.println(bmw);
       bmw.determinationYearOfManufacture(bmw.getDateOfMade());
       bmw.bodyTypeIdentification(bmw.getTypeCar());

        System.out.println("-------------------------------------");


        Car audi = new Car("AUDI", LocalDate.of(2021,5,2),new BigDecimal(120000),TypeCar.STATION_WAGON);
        System.out.println(audi);
        audi.determinationYearOfManufacture(audi.getDateOfMade());
        audi.bodyTypeIdentification(audi.getTypeCar());

        System.out.println("-------------------------------------");


        Car  toyota = new Car("TOYOTA", LocalDate.of(2020,11,12),new BigDecimal(150000),TypeCar.SUV);
        System.out.println(toyota);
        toyota.determinationYearOfManufacture(toyota.getDateOfMade());
        toyota.bodyTypeIdentification(toyota.getTypeCar());
        System.out.println("-------------------------------------");


        Car honda = new Car("Honda", LocalDate.of(2017,5,2),new BigDecimal(120000),TypeCar.HATCHBACK);
        System.out.println(honda);
        bmw.determinationYearOfManufacture(honda.getDateOfMade());
        bmw.bodyTypeIdentification(bmw.getTypeCar());

        System.out.println("-------------------------------------");
        Car mazda = new Car("Mazda", LocalDate.of(2015,5,2),new BigDecimal(120000),TypeCar.CROSSOVER);
        System.out.println(mazda);
        bmw.determinationYearOfManufacture(mazda.getDateOfMade());
        bmw.bodyTypeIdentification(mazda.getTypeCar());

        







    }
}