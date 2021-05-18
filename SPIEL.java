
 class SPIEL
{
   int i;
   
     
   
   SPIEL()
   {
        System.out.println(i);     // darstellung von i 
        i = 25;                     // startwert von i bei 25
        
   }

   
   
   
   
     void runterzaehlen (int z)           //methode, die von 25 bsi 0 sekunden runterzählt 
    {
        
        for (z = 25; z >= 20; z--)
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
             if (z == 0) {
                System.out.println("Zeit abgelaufen");
               }       
        
             i = z;
        
    
         }
    }
}
