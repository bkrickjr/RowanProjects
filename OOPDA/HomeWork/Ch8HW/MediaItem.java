
public class MediaItem
{
    private String Title;
    private boolean IsIn;
    private int PlayTimeHours;
    private int PlayTimeMinutes;
    private int TotalPlayTime;
    private int CopyrightYear;
    
    //Constructor
    public MediaItem(String TitleIn, boolean AvailabilityIn, int PlayTimeHoursIn, int PlayTimeMinutesIn,
    int CopyrightYearIn)
    {
        MISetTitle(TitleIn);
        MISetIsIn(AvailabilityIn);
        MISetPTH(PlayTimeHoursIn);
        MISetPTM(PlayTimeMinutesIn);
        MISetCRY(CopyrightYearIn);
    }
    
    //Sets the title using TitleIn as input
    public void MISetTitle(String TitleIn)
    {
        if (SimpleChecks.CheckIsNull(TitleIn) == true)  //if TitleIn is null
        {
            System.out.println("Cannot accept Nothing as a Title!");  //tell them it cannot be accepted
        }
        else  //if TitleIn is not null
        {
            Title = TitleIn;  //set the variable
        }
    }
    //simple get method for Title variable
    public String MIGetTitle()
    {
        return Title;
    }
    
    //Sets the IsIn using AvailabilityIn as input
    public void MISetIsIn(boolean AvailabilityIn)
    {
        if (AvailabilityIn == true)
        {
            IsIn = true;
        }
        else
        {
            IsIn = false;
        }
    }
    //simple get method for IsIn variable
    public boolean MIGetIsIn()
    {
        return IsIn;
    }
    
    //Sets PlayTimeHours using PlayTimeHoursIn as input
    public void MISetPTH(int PlayTimeHoursIn)
    {
        if (SimpleChecks.CheckNotNegative(PlayTimeHoursIn) == true)  //if the PTH >= 0
        {
            PlayTimeHours = PlayTimeHoursIn;  //set the variable
        }
        else  //if PTH < 0
        {
            System.out.println("This item cannot have negative hours of runtime!"); //tell them theyre wrong
        }
    }
    //simple get method for PlayTimeHours variable
    public int MIGetPTH()
    {
        return PlayTimeHours;
    }
    
    //Sets PlaytimeMinutes using PlayTimeMinutesIn as input
    public void MISetPTM(int PlayTimeMinutesIn)
    {
        if (SimpleChecks.CheckNotNegative(PlayTimeMinutesIn) == true)  //if the PTM >= 0
        {
            
            if (PlayTimeMinutesIn > 59)
            {
                //run the check to see how many hours there are
              PlayTimeHours += SimpleChecks.CheckMtH(PlayTimeMinutesIn);
              PlayTimeMinutes = PlayTimeMinutesIn - (60 * SimpleChecks.CheckMtH(PlayTimeMinutesIn));
              // set playtimeminutes to the In minus 60 multiplied by however many hours are calculated
              // from those minutes
            }
            else
            {
                PlayTimeMinutes = PlayTimeMinutesIn;
            }
            
        }
        else //if PTM < 0
        {
            System.out.println("This item cannot have negative minutes of runtime!");
        }
    }
    //simple get method for PlayTimeMinutes variable
    public int MIGetPTM()
    {
        return PlayTimeMinutes;
    }
    
    //get method for TotalPlayTime, returns the play time in minutes
    public int GetTotalPlayTime()
    {
        if (PlayTimeHours > 0)  //if there are any hours to the play time
        {
            TotalPlayTime = SimpleChecks.CheckHtM(PlayTimeHours);
        }
        TotalPlayTime = TotalPlayTime + PlayTimeMinutes;
        return TotalPlayTime;
    }
    
    //Sets Copyight Year using CopyRightYearIn as input
    public void MISetCRY(int CopyrightYearIn)
    {
        if (SimpleChecks.CheckNotNegative(CopyrightYearIn) == true)
        {
            CopyrightYear = CopyrightYearIn;
        }
        else 
        {
            System.out.println("Theres no way it could have a negative Copyright Year!");
        }
    }
    //simple get method for CopyrightYear variable
    public int MIGetCRY()
    {
        return CopyrightYear;
    }
    
    //toString for Media Items
    public String toString()
    {
        return "\nMedia Item: " + Title + " " + SimpleChecks.CheckIsIn(this.IsIn) + ". Running Time: " + 
        PlayTimeHours + " hours and " + PlayTimeMinutes +
        " minutes. Copyright Year: " + CopyrightYear + ". ";
    }
}
