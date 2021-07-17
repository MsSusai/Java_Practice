package castle;

import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description)
    {
        this.description = description;
    }

    public void setExit(String dir, Room room)
    {
        exits.put(dir, room);
    }


    public String getExit()
    {
        StringBuffer sb = new StringBuffer();
        for (String dir : exits.keySet())
        {
            sb.append(dir);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Room getExitRoom(String direction)
    {
        return exits.get(direction);
    }

    @Override
    public String toString()
    {
        return description;
    }
}
