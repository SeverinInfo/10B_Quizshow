import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit ;

class TIMER
{
    private int i; 
    //public int nummer;    
    public long nummer;
    
    public TIMER()
    {
        i = 25;
        
    }

    void delay(int ms) {
        
        try
                 {
                    TimeUnit.MILLISECONDS.sleep(ms);
                 }
                catch(InterruptedException e)
                 {
                    e.printStackTrace();
                 }
        
    }
    
                
    void runterzaehlen() {
        
        Timer timer = new Timer();
            
            timer.scheduleAtFixedRate(new TimerTask() 
            {
                
                public void run() {                     
                    System.out.println(i);
                    i--;                    
                    if (i == 0) 
                    {
                        return ;
                    }
                }
            }
            ,1000, 1000);
        
        nummer = i;          
        
    }
                
    // public long getNummer() {
        // return nummer;}
        
    // public long setNummer(long nummer) {
        // this.nummer = nummer;}   
        
        
    }
    

