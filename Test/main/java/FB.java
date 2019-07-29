import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class FB {

    public static int a;


    public void BDST_FB1000_V1_0_Get_Local_Machine_IP_And_Username()
            throws Exception
    {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local host address:"+addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: "+hostname);
        BDST_FB1002_V1_0_Get_Local_DateTime();
    }

    public void BDST_FB1001_V1_0_Get_IP(String url)
    {
        InetAddress address = null;
        try
        {
            address = InetAddress.getByName(url);
        }
        catch (UnknownHostException e)
        {
            System.exit(2);
        }
        System.out.println(address.getHostName() + "="+ address.getHostAddress());
        BDST_FB1002_V1_0_Get_Local_DateTime();
    }

    public void BDST_FB1002_V1_0_Get_Local_DateTime()
    {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        String datetime = dateFormat.format(now);
        System.out.println(datetime);
    }

    public void BDST_FB1003_V1_0_Exit()
    {
        System.out.println("Exit");
        BDST_FB1002_V1_0_Get_Local_DateTime();
        System.exit(0);
    }

    public void BDST_FB1004_V1_0_Println(String string)
    {
        System.out.println(string);
        BDST_FB1002_V1_0_Get_Local_DateTime();
    }

    public void BDST_FB1005_V1_0_Timer_DB()
    {

    }

    public void BDST_FB1005_V1_0_Timer(boolean stop)
    {
        Timer timer = new Timer();
        timer.schedule(new java.util.TimerTask()
        {
            public void run()
            {
                int step;
                step=0;
                switch(step)
                {
                    case 0 :
                        step=100;
                        break;

                    case 1000 :
                        step=200;
                        break;

                    case 2000 :
                        step=0;
                        break;

                    default :
                }

                if( stop==true)
                {
                    timer.cancel();
                }
            }
        }, 0 , 1000);

    }

}
