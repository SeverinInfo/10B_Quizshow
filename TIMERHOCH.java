
class TIMERHOCH
{
    int i;                        // aktuelle sekunde von 0 bis 120 
    
    public TIMERHOCH()
    {
       System.out.println(i);     // darstellung von i 
       i = 0;                     // startwert von i bei 0 
    }
    
     void zaehlen (int i)           //methode, die von 0 bsi 120 sekunden zählt (2min)
    {
        for (i = 0; i <= 120; i++)
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
             if (i == 120) {
                System.out.println("Zeit abgelaufen");
               }       
        
        
        
    
    }
   }
}
