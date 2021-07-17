package CDlist;

import java.util.ArrayList;

public class DataBase
{
    private ArrayList<CD> cdList = new ArrayList<CD>();

    void add(CD cd)
    {
        cdList.add(cd);
    }

    void list()
    {
        for (CD cd : cdList)
        {
            cd.print();
        }
    }

    public static void main(String[] args)
    {
        DataBase db = new DataBase();
        db.add(new ShinRaBanSho("ネタミニティ", "森羅万象", "あよ"));
        db.add(new ShinRaBanSho("シンクロ", "森羅万象", "あやぽんず　あよ"));
        db.add(new DiaoYeZong("辿", "凋叶棕", "めらみぽっぷ RD-Sounds", false));
        db.add(new DiaoYeZong("廻", "凋叶棕", "RD-Sounds", true));
        db.list();
    }
}
