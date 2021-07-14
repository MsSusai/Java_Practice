package practice;

import java.util.ArrayList;

public class NoteBook
{
    private ArrayList<String> note = new ArrayList<String>();

    public void add(String s)
    {
        note.add(s);
    }

    public int getSize()
    {
        return note.size();
    }

    public String getNote(int index)
    {
        return note.get(index);
    }

    public void removeNote(int index)
    {
        note.remove(index);
    }

    public String[] list()
    {
        String[] list = new String[note.size()];
//        for (int i = 0; i < note.size(); i++)
//        {
//            list[i] = note.get(i);
//        }
        note.toArray(list);
        return list;
    }

    public static void main(String[] args)
    {
        NoteBook notebook = new NoteBook();
        notebook.add("第一");
        notebook.add("第二");
        notebook.add("第三");
        notebook.getNote(1);
        notebook.removeNote(1);
        System.out.println(notebook.getSize());
        String[] a = notebook.list();
        for (String s : a)
        {
            System.out.println(s);
        }
    }
}
