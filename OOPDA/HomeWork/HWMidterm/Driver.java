import java.util.*;
/**
 * Driver is just a class that is used to check that the other classes are functioning properly
 * following the instructions on the spec
 * 
 * @author Brian Krick 
 * @version 10/5
 */
public class Driver
{
    
    /**
     * Driver is just a class that is used to check that the other classes are functioning properly
     * following the instructions on the spec
     */
    public Driver()
    {
        List <Vehicle> MyList = new ArrayList<Vehicle>();  //instruction 1
        
        Vehicle A = new Scooter("A", 2);
        MyList.add(A);
        Vehicle B = new Scooter("B", 3);
        MyList.add(B);        
        Vehicle C = new Moped("C", 2);
        MyList.add(C);
        Vehicle D = new Moped("D", 2);
        MyList.add(D);
        Vehicle E = new Car("E", 4);
        MyList.add(E);
        Vehicle F = new Car("F", 4);
        MyList.add(F);
        Vehicle G = new Bus("G", 6);
        MyList.add(G);
        Vehicle H = new Bus("H", 6);
        MyList.add(H);                         //instructions 2 and 3
        
        System.out.println("All Vehicles: ");
        for (Vehicle currentV : MyList)        //instruction 4
        {
            System.out.println("\n" + currentV.toString());  
        }
        
        int N = 0;
        for (Vehicle currentV : MyList)        //instruction 5
        {
            N = N + currentV.getNumberOfTires();
        }
        System.out.println("\nTotal Number of Tires: " + N);
        
        int T = 0;
        System.out.println("\nAll Powered Vehicles: ");
        for (Vehicle currentV : MyList)          //instruction 6
        {
            if (currentV instanceof Powered)
            {
                Powered other = (Powered) currentV;
                System.out.println("\n" + currentV.getName() + " has " + 
                other.getHorsePower() + " horse power.");
                T = T + other.getHorsePower();
            }
        }
        
        System.out.println("\nTotal Horse Power: " + T); //instruction 7
        
    }

    
}
