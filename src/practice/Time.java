package practice;

class Time
{
    private int limit;
    private int value;

    Time(int limit, int value)
    {
        this.limit = limit;
        this.value = value;
    }

    void increaseTime()
    {
        value++;
        if (value == limit)
        {
            value = 0;
        }
    }

    int getValue()
    {
        return value;
    }
}

class Clock
{
    private Time second;
    private Time minute;
    private Time hour;

    public Clock(int hour, int minute, int second)
    {
        this.minute = new Time(60, minute);
        this.hour = new Time(24, hour);
        this.second = new Time(60, second);
    }

    public void tick()
    {
        second.increaseTime();
        if (second.getValue() == 0)
        {
            minute.increaseTime();
            if (minute.getValue() == 0)
            {
                hour.increaseTime();
            }
        }

    }

    public void print()
    {
        System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
    }


    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        while (true)
        {
            clock.tick();
            clock.print();
        }
//        in.close();
    }
}
