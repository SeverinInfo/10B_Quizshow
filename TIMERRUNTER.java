
class TIMERRUNTER
{
    int i;                        // aktuelle sekunde von 120 bis 0 
    
    public TIMERRUNTER()
    {
       System.out.println(i);     // darstellung von i 
       i = 120;                     // startwert von i bei 120 
    }
    
     void zaehlen (int i)           //methode, die von 120 bsi 0 sekunden runterzählt (2min)
    {
        for (i = 120; i >= 0; i--)
        {             
        
             try
                 {
                    Thread.sleep(1000);
                 }
                catch(InterruptedException e)
                 {
                    e.printStackTrace();
                 }
                 
             System.out.println(i);
             if (i == 0) {
                System.out.println("Zeit abgelaufen");
               }       
        
        
        
    
    }
   }
}
