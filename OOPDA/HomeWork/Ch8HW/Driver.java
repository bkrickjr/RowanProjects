import java.util.*;
public class Driver
{
    ArrayList<MediaItem> Library = new ArrayList<MediaItem>(); 
    public Driver()
    {
        //create 2+ instances of each
        CD Cd1 = new CD("Sounds of the Trailer Park", true, 5, 34, 2007, "BackWater Orchestra", 36);
        CD Cd2 = new CD("Weddings, Mitzvahs, and other Happy Events", false, 6, 43, 2003,
                            "The Party Band", 47);
        DVD Dvd1 = new DVD("Taken 6: Thats MY GrandMother", false, 1, 47, 2020, "R", 3, 45);
        DVD Dvd2 = new DVD("How to Train Your Dragon 4: Potty Training", true, 1, 36, 
                              2017, "PG", 2, 6);
        AudioBook Ab1 = new AudioBook("7 Steps back to Childhood", false, 1, 45, 
                            2013, "Klive Bookston", "Jack Black");
        AudioBook Ab2 = new AudioBook("How To: The Latest Dances of 2015 Explained",
                            true, 2, 30, 2015, "Tony Binkerton", "Betty White");
        
        
        //Store the instances in an array
        Library.add(Cd1);
        Library.add(Cd2);
        Library.add(Dvd1);
        Library.add(Dvd2);
        Library.add(Ab1);
        Library.add(Ab2);
        
        //Exercise the accessor and mutator methods of the objects
        Cd1.MISetIsIn(false);   //check out Cd1
        Cd2.MISetIsIn(true);    //check in Cd2
        Dvd1.MISetIsIn(true);   //check in Dvd1
        Ab1.MISetIsIn(true);    //check in Ab1
        
        //pirnt out all pertinent information about each item
        System.out.println("Whole Library: ");
        for (MediaItem currentItem : Library)
        {
            System.out.println(currentItem.toString());
        }
        
        System.out.println("\n\nAvailable Items: ");
        for (MediaItem currentItem : Library)
        {
            if (currentItem.MIGetIsIn() == true)
            {
                System.out.println(currentItem.toString());
            }
        }
    }

    
}
