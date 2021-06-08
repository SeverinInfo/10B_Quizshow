import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class SPIEL
{
    OBERFLAECHE oberflaeche;
    int i;
    int z;
    int Level;
    FRAGE1 frage1;
    FRAGE2 frage2;
    FRAGE3 frage3;
    
    // String F1;
     // String F1at;
     // String F1af1;
     // String F1af2;
     // String F1af3;    
     
    // String F2;
     // String F2at;
     // String F2af1;
     // String F2af2;
     // String F2af3;
     
    // String F3;
     // String F3at;
     // String F3af1;
     // String F3af2;
     // String F3af3;
     
    // //String F4;
     // String F4at;
     // String F4af1;
     // String F4af2;
     // String F4af3;
     
    // //String F5;
     // String F5at;
     // String F5af1;
     // String F5af2;
     // String F5af3;
    
     
   SPIEL()
   {
        //System.out.println(i);     // darstellung von i 
        oberflaeche = new OBERFLAECHE();
        Level = 1;
        frage1 = new FRAGE1();      
        frage2 = new FRAGE2();
        frage3 = new FRAGE3();
        System.out.println(Level);
        spielen();    
      
      
      
      
     // F1 = "Wofür steht die KGaA?";
      // F1at = "Kommanditgesellschaft auf Aktien";
      // F1af1 = "Kaum Götter aßen Ameisen";
      // F1af2 = "Koordinationsgesellschaft ab Aristoteles";
      // F1af3 = "Kommandogesetz aus Australien";    
     
     // F2 = "Wann fiel die Berliener Mauer?";
      // F2at = "9.11.1989";
      // F2af1 = "9/11 2001";
      // F2af2 = "9. Novmeber 1989";
      // F2af3 = "9.Mai 2005";
     
     // //F3 = "In welcher Einheit wird elektrischer Wiederstand gemessen?";
      // F3at = "Volt";
      // F3af1 = "Amper";
      // F3af2 = "Ohm";
      // F3af3 = "Watt";
     
     // //F4 = "Wieviele Planeten hat unser Sonnensystem?";
      // F4at = "8";
      // F4af1  = "13";
      // F4af2 = "7";
      // F4af3 = "5";
     
     // //F5 = "Wie hoch ist die Mehrwertsteuer in Deutschland?";
      // F5at = "7%";
      // F5af1 = "16%";
      // F5af2 = "19%";
      // F5af3 = "9%";
      
   }
   
    void spielen() {
                
      if (Level == 1) {
          
          oberflaeche.fragen.setText(frage1.Frage);        
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;               
            }
         });
         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;             
            }
         });
        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;              
            }
         });
        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;          
            }
        });
      }
      
      if (Level == 2) {
          
          oberflaeche.fragen.setText(frage2.Frage);        
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;               
            }
         });
         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;             
            }
         });
        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;              
            }
         });
        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;          
            }
        });
      }
      
      if (Level == 3) {
          
          oberflaeche.fragen.setText(frage3.Frage);        
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;               
            }
         });
         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;             
            }
         });
        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;              
            }
         });
        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;          
            }
        });
      }
    }
   
   
     // void runterzaehlen (int nummer)           //methode, die von 25 bsi 0 sekunden runterzählt 
    // {
        
        // for (z = nummer; z >= 0; z--)
         // {             
             
             // try
                 // {
                    // Thread.sleep(1000);
                 // }
                // catch(InterruptedException e)
                 // {
                    // e.printStackTrace();
                 // }
                 
             // System.out.println(i);
             // if (z == 0) {
                // System.out.println("Zeit abgelaufen");
               // }       
        
             // i = z;
        
             
         // }
    // }
    
    void antwortpruefen() {
        
    }
    
    
    
    
}
