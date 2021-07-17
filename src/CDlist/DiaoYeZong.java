package CDlist;

public class DiaoYeZong extends CD
{
    private String singer;
    private boolean pore;

    public DiaoYeZong(String title, String artist, String singer, boolean isPore)
    {
        super(title, artist);
        this.singer = singer;
        this.pore = isPore;
    }

    public void print()
    {
        super.print();
        if (pore)
        {
            System.out.println(" by " + singer + " 本专辑是纯音乐");
        }
        else
        {
            System.out.println(" by " + singer + " 本专辑不是纯音乐");
        }
    }
}
