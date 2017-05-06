
public class DVD extends MediaItem
{
    
    private String[]RatingArray = {"G", "PG", "PG13", "R", "NC17"};
    private String Rating;
    private int BonusHours;
    private int BonusMinutes;
    private int TotalWithBonusTime;
    
    //Constructor
    public DVD(String TitleIn, boolean AvailabilityIn, int PlayTimeHoursIn, int PlayTimeMinutesIn,
    int CopyrightYearIn, String RatingIn, int BonusHoursIn, int BonusMinutesIn)
    {
       super(TitleIn, AvailabilityIn, PlayTimeHoursIn, PlayTimeMinutesIn, CopyrightYearIn);
       DVDSetRating(RatingIn);
       DVDSetBonusHours(BonusHoursIn);
       DVDSetBonusMinutes(BonusMinutesIn);
    }
    
    //sets the rating using RatingIn as input
    public void DVDSetRating(String RatingIn)
    {
        if (SimpleChecks.CheckValidRating(RatingIn, RatingArray) == true) //if input is valid
        {
            Rating = RatingIn;   //set the variable
        }
        else
        {
            System.out.println("The input '" + RatingIn + "' is invalid! The ratings accepted " +
            "are 'G', 'PG', 'PG13', 'R', and 'NC17'");
            //otherwise tell them what they can enter
        }
    }
    //simple get method for Rating variable
    public String DVDGetRating()
    {
        return Rating;
    }
    
    //sets the BonusHours using BonusHoursIn as input
    public void DVDSetBonusHours(int BonusHoursIn)
    {
        if (SimpleChecks.CheckNotNegative(BonusHoursIn) == true)  //if the BonusHours >= 0
        {
            BonusHours = BonusHoursIn;  //set the variable
        }
        else  //if BonusHours < 0
        {
            System.out.println("This DVD cannot have negative hours of bonus footage!"); 
            //tell them theyre wrong
        }
    }
    //simple get method for BonusHours variable
    public int DVDGetBH()
    {
        return BonusHours;
    }
    
    //sets the BonusMinutes using BonusMinutesIn as input
    public void DVDSetBonusMinutes(int BonusMinutesIn)
    {
        if (SimpleChecks.CheckNotNegative(BonusMinutesIn) == true)  //if the BonusMinutesIn >= 0
        {
            
            if (BonusMinutesIn > 59)
            {
                //run the check to see how many hours there are
              BonusHours += SimpleChecks.CheckMtH(BonusMinutesIn);
              BonusMinutes = BonusMinutesIn - (60 * SimpleChecks.CheckMtH(BonusMinutesIn));
              // set Bonusminutes to the In minus 60 multiplied by however many hours are calculated
              // from those minutes
            }
            else
            {
                BonusMinutes = BonusMinutesIn;
            }
            
        }
        else //if PTM < 0
        {
            System.out.println("This DVD cannot have negative minutes of Bonus footage!");
        }
    }
    //simple get method for BonusMinutes variable
    public int DVDGetBM()
    {
        return BonusMinutes;
    }
    
    //get method for TotalPlayTime of the DVD overrides super's and returns minutes
    public int GetTotalPlayTime()
    {
       
       if (BonusHours > 0)
       {
           TotalWithBonusTime = BonusMinutes + SimpleChecks.CheckHtM(BonusHours);
       }
       TotalWithBonusTime += super.GetTotalPlayTime();
       return TotalWithBonusTime;
    }
    
    //toString for DVD
    public String toString()
    {
        return super.toString() + " DVD Rating: " + Rating + ". With an additional " + BonusHours +
        "hours and " + BonusMinutes + "minutes of footage!" ;
    }
}
