class Time
{
    private int limit;
    private int value;

    Time(int limit)
    {
        this.limit = limit;
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
    private Time minute;
    private Time hour;

    Clock()
    {
        minute = new Time(60);
        hour = new Time(24);
    }

    void start()
    {
        while (true)
        {
            minute.increaseTime();
            if (minute.getValue() == 0)
            {
                hour.increaseTime();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }


    public static void main(String[] args)
    {
        Clock clock = new Clock();
        clock.start();
    }
}
