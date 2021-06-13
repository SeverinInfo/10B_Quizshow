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
    FRAGE4 frage4;
    FRAGE5 frage5;
    
     
   SPIEL()
   {
        //System.out.println(i);     // darstellung von i 
        oberflaeche = new OBERFLAECHE();
        Level = 1;
        frage1 = new FRAGE1();      
        frage2 = new FRAGE2();
        frage3 = new FRAGE3();
        frage4 = new FRAGE4();
        frage5 = new FRAGE5();
        spielen();    
           
      
      
     
      
   }
   
    void spielen() {
                
      if (Level == 1) {
          
          oberflaeche.fragen.setText(frage1.Frage);        
          oberflaeche.ansa.setText("A: " +frage1.Antf1);
          oberflaeche.ansb.setText("B: " +frage1.Antf2);
          oberflaeche.ansc.setText("C: " +frage1.Antf3);
          oberflaeche.ansd.setText("D: " +frage1.Antt);
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;  
               spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;   
               spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;
               spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 2;
               spielen();
            }
        });
      }
      
      if (Level == 2) {
          
          oberflaeche.fragen.setText(frage2.Frage);        
          oberflaeche.ansa.setText("A: " +frage2.Antf1);
          oberflaeche.ansb.setText("B: " +frage2.Antt);
          oberflaeche.ansc.setText("C: " +frage2.Antf2);
          oberflaeche.ansd.setText("D: " +frage2.Antf3);
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;  
               spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;  
               spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;
               spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 3;
               spielen();               
            }
        });
      }
      
      if (Level == 3) {
          
          oberflaeche.fragen.setText(frage3.Frage);        
          oberflaeche.ansa.setText("A: " + frage3.Antf1);
          oberflaeche.ansb.setText("B: " +frage3.Antf2);
          oberflaeche.ansc.setText("C: " +frage3.Antt);
          oberflaeche.ansd.setText("D: " +frage3.Antf3);
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;   
               spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;   
               spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4;   
               spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 4; 
               spielen();
            }
        });
      }
      
      if (Level == 4) {
          
          oberflaeche.fragen.setText(frage4.Frage);        
          oberflaeche.ansa.setText("A: " + frage4.Antf1);
          oberflaeche.ansb.setText("B: " +frage4.Antf2);
          oberflaeche.ansc.setText("C: " +frage4.Antt);
          oberflaeche.ansd.setText("D: " +frage4.Antf3);
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 5;   
               spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 5;   
               spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               Level = 5;   
               spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               Level = 5; 
               spielen();
            }
        });
      }
      
      if (Level == 5) {
          
          oberflaeche.fragen.setText(frage5.Frage);        
          oberflaeche.ansa.setText("A: " + frage5.Antf1);
          oberflaeche.ansb.setText("B: " +frage5.Antf2);
          oberflaeche.ansc.setText("C: " +frage5.Antt);
          oberflaeche.ansd.setText("D: " +frage5.Antf3);
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               //Level = 6;   
               spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               //Level = 6;   
               spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               //Level = 6;
               spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               //Level = 6; 
               spielen();
            }
        });
      }
    }
   
   
     
    
    void antwortpruefen() {
        
    }
    
    
    
    
}
