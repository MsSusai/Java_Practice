package CDlist;

public class CD
{
    private String title;
    private String artist;

    public CD(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public void print()
    {
        System.out.print(artist + ":" + title);
    }
}
