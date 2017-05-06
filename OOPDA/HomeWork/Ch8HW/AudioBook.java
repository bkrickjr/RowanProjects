
public class AudioBook extends MediaItem
{
    private String Author;
    private String Narrator;
    
    public AudioBook(String TitleIn, boolean AvailabilityIn, int PlayTimeHoursIn, int PlayTimeMinutesIn,
    int CopyrightYearIn, String AuthorIn, String NarratorIn)
    {
       super(TitleIn, AvailabilityIn, PlayTimeHoursIn, PlayTimeMinutesIn, CopyrightYearIn);
       ABSetAuthor(AuthorIn);
       ABSetNarrator(NarratorIn);
    }
    
    //set Author using AuthorIn as input
    public void ABSetAuthor(String AuthorIn)
    {
        if (SimpleChecks.CheckIsNull(AuthorIn) == true)  //if AuthorIn is null
        {
            System.out.println("Cannot accept Nothing as an Author!");  
            //tell them it cannot be accepted
        }
        else  //if AuthorIn is not null
        {
            Author = AuthorIn;  //set the variable
        }
    }
    //simple get method for Author variable
    public String ABGetAuthor()
    {
        return Author;
    }
    
    //set Narrator using NarratorIn as input
    public void ABSetNarrator(String NarratorIn)
    {
        if (SimpleChecks.CheckIsNull(NarratorIn) == true)  //if NarratorIn is null
        {
            System.out.println("Cannot accept Nothing as a Narrator!");  
            //tell them it cannot be accepted
        }
        else  //if NarratorIn is not null
        {
            Narrator = NarratorIn;  //set the variable
        }
    }
    //simpe get method for Narrator variable
    public String ABGetNarrator()
    {
        return Narrator;
    }
    
    //toString for AudioBooks
    public String toString()
    {
        return super.toString() + "Author: " + Author + ". Narrated by: " + Narrator + ".";
    }
}
