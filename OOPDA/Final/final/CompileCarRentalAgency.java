import java.util.List;

/* 
This class must compile against your code, even if (some of) the methods
are empty implementations.  The ‘throws Exception’is needed to compile .
Whether or not it executes correctly with your code is another story ...
 */

class CompileCarRentalAgency {
    public static void main (String[] args) throws Exception {
        testMethods();
    }
    public static void testMethods() throws Exception {  
        try{
        String serialNumber = "a123";
        String serialNumber2 = "a2";
        int mpg = 123;
        String type = "plugin"; 
        boolean rented;
        Car car;
        Economy economy;
        PlugIn plugIn;
        TwoSeater twoSeater;
        SUV suv;
        Sporty sporty;
        List<Car> cars;
        List<Sporty> sporties;
        CarRentalAgency agency = new CarRentalAgency(); 
        plugIn = new PlugIn(serialNumber2, mpg); 
        twoSeater = new TwoSeater(serialNumber, mpg);
        suv = new SUV(serialNumber);
        car = plugIn;
        car = twoSeater; 
        car = suv;
        agency.addCar(car);
        System.out.println(car.toString());
        System.out.println(car.getSerialNumber());
        
        economy = plugIn;
        economy = twoSeater;
        System.out.println("MPG: " + economy.getMilesPerGallon()); 
        sporty = twoSeater;
        sporty = suv;
        System.out.println("Sportiness: " + sporty.sportiness());
        agency.addCar(plugIn);
        cars = agency.getCars();

        System.out.println("Avg MPG: " + agency.getAvgMPG());
        sporties = agency.getSportyCars();
        cars = agency.getCars(type);
        cars = agency.getAvailableCars();
        cars = agency.getAvailableCars(type);

        serialNumber = agency.rentCar(type);
        rented = agency.isRented(serialNumber);
        cars = agency.getRentedCars();
        cars = agency.getRentedCars(type);

        agency.addCar(new TwoSeater("1234", 29));
        agency.addCar(new TwoSeater("4353", 32));
        System.out.println("");
        agency.printAll();
        System.out.println("");
        agency.printAvailableCars();
        agency.returnCar(serialNumber);
    }
    catch (NoSuchSerialNumberException | NoSuchCarTypeException | DuplicateSerialNumberException |
            NoSuchRentedCarException | NullStringException | NullCarException | BelowZeroException |
            EmptyStringException e)
    {
        e.toString();
    }
        
    }
    }