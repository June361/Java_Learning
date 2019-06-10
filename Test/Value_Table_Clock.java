import java.util.Timer;

public class Value_Table_Clock implements Value_Table
{

    public static boolean First_Scan=false;

    public static boolean Clock_0_5Hz=false;
    public static boolean Clock_1Hz=false;
    public static boolean Clock_2Hz=false;
    public static boolean Clock_5Hz=false;
    public static boolean Clock_10Hz=false;
    public static boolean Clock_100Hz=false;

    public static void First_Scan()
    {
        First_Scan=true;
        First_Scan=false;
    }

    public void Clock_1Hz()
    {

        Timer timer = new Timer();
        Clock_1Hz=false;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_1Hz==false)
                {
                    Clock_1Hz=true;
                }
                else
                {
                    Clock_1Hz=false;
                }
            }
        }, 500 , 1000);
    }

    public void Clock_0_5Hz()
    {

        Timer timer = new Timer();
        Clock_0_5Hz=false;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_0_5Hz==false)
                {
                    Clock_0_5Hz=true;
                }
                else
                {
                    Clock_0_5Hz=false;
                }
            }
        }, 1000 , 2000);
    }

    public void Clock_2Hz()
    {

        Timer timer = new Timer();
        Clock_2Hz=true;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_2Hz==false)
                {
                    Clock_2Hz=true;
                }
                else
                {
                    Clock_2Hz=false;
                }
            }
        }, 250 , 500);
    }

    public void Clock_5Hz()
    {

        Timer timer = new Timer();
        Clock_5Hz=true;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_5Hz==false)
                {
                    Clock_5Hz=true;
                }
                else
                {
                    Clock_5Hz=false;
                }
            }
        }, 100 , 200);
    }

    public void Clock_10Hz()
    {

        Timer timer = new Timer();
        Clock_10Hz=true;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_10Hz==false)
                {
                    Clock_10Hz=true;
                }
                else
                {
                    Clock_10Hz=false;
                }
            }
        }, 100 , 200);
    }

    public void Clock_100Hz()
    {

        Timer timer = new Timer();
        Clock_100Hz=true;
        timer.  schedule(new java.util.TimerTask()
        {
            public void run()
            {
                if (Clock_100Hz==false)
                {
                    Clock_100Hz=true;
                }
                else
                {
                    Clock_100Hz=false;
                }
            }
        }, 10 , 20);
    }
}
