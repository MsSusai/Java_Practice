package CDlist;

public class ShinRaBanSho extends CD
{
    private String singer;

    public ShinRaBanSho(String title, String artist, String singer)
    {
        super(title, artist);
        this.singer = singer;
    }

    public void print()
    {
        super.print();
        System.out.println(" by " + singer);
    }
}
