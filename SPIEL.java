

 class SPIEL
{
   int i;
    
   SPIEL()
   {
        System.out.println(i);     // darstellung von i 
        i = 25;                     // startwert von i bei 25
   }

     void runterzaehlen (int i)           //methode, die von 25 bsi 0 sekunden runterzählt 
    {
        for (i = 25; i >= 0; i--)
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
