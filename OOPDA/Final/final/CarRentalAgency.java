import java.util.*;
/**
 * Car Rental Agenecy Class 
 * 
 * @author Brian Krick
 * @version 12/10/15
 */
public class CarRentalAgency
{
    ArrayList<Car> CarList = new ArrayList<Car>();
    /**
     * Constructor for CarRentalAgency
     */
    public CarRentalAgency()
    {
    }

    /**
     * addCar method adds a car to the agency cannot be null or have the same serial number as another car
     * 
     * @param - Car C
     * @return - void
     * @exception - NullCarException
     * @exception - DuplicateSerialNumberException
     */
    public void addCar(Car c)
    throws NullCarException, DuplicateSerialNumberException
    {
        if (c == null)
        {
            throw new NullCarException("Cannot Add A Null Car");
        }
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == c.getSerialNumber())
            {
                throw new DuplicateSerialNumberException("Cannot Have A Duplicate Serial Number");
            }
        }
        CarList.add(c);
    }

    /**
     * getCars method returns a list of all cars in the agency
     * 
     * @param - none
     * @return - List of Cars
     */
    public List getCars()
    {
        return (List) CarList;
    }

    /**
     * getSportyCars
     * 
     * @param - none
     * @return - List of all Cars that are Sporty
     */
    public ArrayList getSportyCars()
    {
        ArrayList<Car> tempList = new ArrayList<Car>();
        for (Car current : CarList)
        {
            if (current instanceof Sporty)
            {
                tempList.add(current);
            }
        }
        return tempList;
    }
    
    /**
     * getAvgMPG
     * 
     * @param - none
     * @return - double Average of all the cars MPG
     */
    public double getAvgMPG()
    {
        double total = 0.0, average;        
        int count = 0;
        
        for(Car current : CarList)
        {
            if (current instanceof Economy)
            {
                Economy other = (Economy) current;
                total += other.getMilesPerGallon();
                count++;
            }
        }
        
        average = total/count;
        
        return average;
    }
    
    
    /**
     * getcars method that is passed a type as a String
     * 
     * @param - type of car looking for, only accepts "PlugIn" , "TwoSeater" , "SUV"
     * @return - List of all cars matching parameter type
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchCarTypeException 
     */
    public ArrayList getCars(String type)
    throws NullStringException, EmptyStringException, NoSuchCarTypeException
    {
        if (type == null)
        {
            throw new NullStringException("Cannot Find A List Of Null Cars");
        }
        
        if (type == "")
        {
            throw new EmptyStringException("Cannot Find A List Of Empty Type Cars");            
        }
        
        if (type != "PlugIn" && type != "TwoSeater" && type != "SUV")
        {
            throw new NoSuchCarTypeException("Cannot Find A Car of Type");
        }
        
        ArrayList<Car> tempList = new ArrayList<Car>();
        
        if (type == "PlugIn")
        {
            for (Car current : CarList)
            {
                if (current instanceof PlugIn)
                {
                    tempList.add(current);
                }
            }
        }
        
        if (type == "TwoSeater")
        {
            for (Car current : CarList)
            {
                if (current instanceof TwoSeater)
                {
                    tempList.add(current);
                }
            }
        }
        
        if (type == "SUV")
        {
            for (Car current : CarList)
            {
                if (current instanceof SUV)
                {
                    tempList.add(current);
                }
            }
        }
        
        return tempList;
    }

    /**
     * getAvailableCars method returns a list of all cars that are not rented
     * 
     * @param - none
     * @return - List of all cars not currently rented
     */
    public ArrayList getAvailableCars()
    {
        ArrayList<Car> tempList = new ArrayList<Car>();
        
        for (Car current : CarList)
        {
            if (!(current.getRented()))
            {
                tempList.add(current);
            }
        }
        
        return tempList;
    }
    
    
    /**
     * getAvailableCars returns a list of all cars of a specificied tpye
     * 
     * @param - String type looking for, only accepts "PlugIn" , "TwoSeater" , "SUV"
     * @return - list of all specified cars
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchCarTypeException
     */
    public ArrayList getAvailableCars(String type)
    throws NullStringException, EmptyStringException, NoSuchCarTypeException
    {
        if (type == null)
        {
            throw new NullStringException("Cannot Find A List Of Null Cars");
        }
        
        if (type == "")
        {
            throw new EmptyStringException("Cannot Find A List Of Empty Type Cars");            
        }
        
        if (type != "PlugIn" && type != "TwoSeater" && type != "SUV")
        {
            throw new NoSuchCarTypeException("Cannot Find A Car of Type");
        }
        
        ArrayList<Car> tempList = new ArrayList<Car>();
        
        if (type == "PlugIn")
        {
            for (Car current : CarList)
            {
                if (current instanceof PlugIn)
                {
                    if (!(current.getRented()))
                    {
                        tempList.add(current);
                    }
                }
            }
        }
        
        if (type == "TwoSeater")
        {
            for (Car current : CarList)
            {
                if (current instanceof TwoSeater)
                {
                    if (!(current.getRented()))
                    {
                        tempList.add(current);
                    }
                }
            }
        }
        
        if (type == "SUV")
        {
            for (Car current : CarList)
            {
                if (current instanceof SUV)
                {
                    if (!(current.getRented()))
                    {
                        tempList.add(current);
                    }
                }
            }
        }
        
        return tempList;
    }

    /**
     * rents a car of a specified type
     * 
     * @param - type of car looking for, only accepts "PlugIn" , "TwoSeater" , "SUV"
     * @return - String serialno of the car you rented, null if no car of that type available
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchCarTypeException
     */
    public String rentCar(String type)
    throws NullStringException, EmptyStringException, NoSuchCarTypeException
    {        
        if (type == null)
        {
            throw new NullStringException("Cannot Find A List Of Null Cars");
        }
        
        if (type == "")
        {
            throw new EmptyStringException("Cannot Find A List Of Empty Type Cars");            
        }
        
        if (type != "PlugIn" && type != "TwoSeater" && type != "SUV")
        {
            throw new NoSuchCarTypeException("Cannot Find A Car of Type");
        }
        
        if (type == "PlugIn")
        {
            for (Car current : CarList)
            {
                if (current instanceof PlugIn)
                {
                    if (!(current.getRented()))
                    {
                        current.setRented(true);
                        return current.getSerialNumber();
                    }
                }
            }
        }
        
        if (type == "TwoSeater")
        {
            for (Car current : CarList)
            {
                if (current instanceof TwoSeater)
                {
                    if (!(current.getRented()))
                    {
                        current.setRented(true);
                        return current.getSerialNumber();
                    }
                }
            }
        }
        
        if (type == "SUV")
        {
            for (Car current : CarList)
            {
                if (current instanceof SUV)
                {
                    if (!(current.getRented()))
                    {
                        current.setRented(true);
                        return current.getSerialNumber();
                    }
                }
            }
        }
        
        return null;
    }

    /**
     * returnCar lets you return a car using the serialno, if that car is not in the system or not rented
     * throws specific exceptiosn
     * 
     * @param - String serial no
     * @return - void
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchSerialNumberException
     * @exception - NoSuchRentedCarException
     */
    public void returnCar(String serialno)
    throws NullStringException, EmptyStringException, NoSuchSerialNumberException, NoSuchRentedCarException
    {        
        if (serialno == null)
        {
            throw new NullStringException("Cannot Return A Null Car");
        }
        if (serialno == "")
        {
            throw new EmptyStringException("Cannot Return An Empty Type Car");            
        }
        
        boolean found = false;
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == serialno)
            {
                found = true;
            }
        }
        
        if (!found)
        {
            throw new NoSuchSerialNumberException("That Serial Number Doesn't Exist In Our Records");
        }
        
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == serialno && current.getRented() == false)
            {
                throw new NoSuchRentedCarException("That Car Is Not Rented Out");
            }
        }
        
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == serialno)
            {
                current.setRented(false);
            }
        }
        
    }
    
    /**
     * isRented tells you if a car is rented based on a specific serialno
     * 
     * @param - String serialno
     * @return - true if the car is rented out, false if available
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchSerialNumberException
     */
    public boolean isRented(String serialno)
    throws NullStringException, EmptyStringException, NoSuchSerialNumberException
    {
        if (serialno == null)
        {
            throw new NullStringException("Cannot Check A Null Serial Number");
        }
        
        if (serialno == "")
        {
            throw new EmptyStringException("Cannot Check An Empty Serial Number");            
        }
        
        boolean found = false;
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == serialno)
            {
                found = true;
            }
        }        
        if (!found)
        {
            throw new NoSuchSerialNumberException("That Serial Number Doesn't Exist In Our Records");
        }
        
        for (Car current : CarList)
        {
            if (current.getSerialNumber() == serialno && current.getRented() )
            {
                return true;
            }
        }
        
        return false;
    }

    /**
     * getRentedCars returns a list of all cars that are rented
     * 
     * @param - none
     * @return - list of all cars rented
     */
    public ArrayList getRentedCars()
    {
        ArrayList<Car> tempList = new ArrayList<Car>();
        
        for (Car current : CarList)
        {
            if (current.getRented())
            {
                tempList.add(current);
            }
        }
        
        return tempList;
    }

    /**
     * getRentedCars of a specific type
     * 
     * @param - String type looking for only accepts "PlugIn" , "TwoSeater" , "SUV"
     * @return - list of cars of specified type
     * @exception - NullStringException
     * @exception - EmptyStringException
     * @exception - NoSuchCarTypeException
     */
    public ArrayList getRentedCars(String type)
    throws NullStringException, EmptyStringException, NoSuchCarTypeException
    {
        ArrayList<Car> tempList = new ArrayList<Car>();
        ArrayList<Car> RentedList = new ArrayList<Car>();
        
        if (type == null)
        {
            throw new NullStringException("Cannot Find A List Of Null Cars");
        }
        
        if (type == "")
        {
            throw new EmptyStringException("Cannot Find A List Of Empty Type Cars");            
        }
        
        if (type != "PlugIn" && type != "TwoSeater" && type != "SUV")
        {
            throw new NoSuchCarTypeException("Cannot Find A Car of Type");
        }        
        
        if (type == "PlugIn")
        {
            for (Car current : CarList)
            {
                if (current instanceof PlugIn)
                {
                    if (current.getRented())
                    {
                        RentedList.add(current);
                    }
                }
            }
        }
        
        if (type == "TwoSeater")
        {
            for (Car current : CarList)
            {
                if (current instanceof TwoSeater)
                {
                    if (!(current.getRented()))
                    {
                        RentedList.add(current);
                    }
                }
            }
        }
        
        if (type == "SUV")
        {
            for (Car current : CarList)
            {
                if (current instanceof SUV)
                {
                    if (!(current.getRented()))
                    {
                        RentedList.add(current);
                    }
                }
            }
        }   

        return RentedList;
    }

    /**
     * prints all cars in the agency
     * 
     * @param - none
     * @return - void
     */
    public void printAll()
    {
        for (Car current : CarList)
        {
            current.toString();
        }
    }
    
    /**
     * prints all available cars in the agency
     * 
     * @param - none
     * @return - void
     */
    public void printAvailableCars()
    {
        for (Car current : CarList)
        {
            if (!(current.getRented()))
            {
                current.toString();
            }
        }
    }

}
