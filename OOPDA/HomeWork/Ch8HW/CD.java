
public class CD extends MediaItem
{
    private String Artist;
    private int Tracks;
    
    //Constructor
    public CD(String TitleIn, boolean AvailabilityIn, int PlayTimeHoursIn, int PlayTimeMinutesIn,
    int CopyrightYearIn, String ArtistIn, int TracksIn)
    {
        super(TitleIn, AvailabilityIn, PlayTimeHoursIn, PlayTimeMinutesIn, CopyrightYearIn);
        CDSetArtist(ArtistIn);
        CDSetTracks(TracksIn);
        
    }
    
    //sets the Artist using ArtistIn as input
    public void CDSetArtist(String ArtistIn)
    {
        if (SimpleChecks.CheckIsNull(ArtistIn) == true)  //if ArtistIn is null
        {
            System.out.println("Cannot accept Nothing as an Artist!");  //tell them it cannot be accepted
        }
        else  //if ArtistIn is not null
        {
            Artist = ArtistIn;  //set the variable
        }
    }
    //simple get method for Artist variable
    public String CDGetArtist()
    {
        return Artist;
    }
    
    //sets the Tracks using TracksIn as input
    public void CDSetTracks(int TracksIn)
    {
        if (SimpleChecks.CheckNotNegative(TracksIn) == true)  //if the TracksIn >= 0
        {
            Tracks = TracksIn;  //set the variable
        }
        else  //if TracksIn < 0
        {
            System.out.println("This CS cannot have a negative number of tracks!"); 
            //tell them theyre wrong
        }
    }
    //simple get method for Tracks variable
    public int CDGetTracks()
    {
        return Tracks;
    }
    
    //toString for CDs
    public String toString()
    {
        return super.toString() + "CD Artist: " + Artist + ". Number of Tracks: " + 
        Tracks + ".";
        
    }
}
