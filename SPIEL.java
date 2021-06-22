import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class SPIEL extends TIMER
{
    OBERFLAECHE oberflaeche;   
    int Level;
    FRAGE1 frage1;
    FRAGE2 frage2;
    FRAGE3 frage3;
    FRAGE4 frage4;
    FRAGE5 frage5;
    FRAGE6 frage6;
    FRAGE7 frage7;
    FRAGE8 frage8;
    FRAGE9 frage9;
    FRAGE10 frage10;
    
    
    
   SPIEL()
   {
        oberflaeche = new OBERFLAECHE();
        Level = 1;
        frage1 = new FRAGE1();      
        frage2 = new FRAGE2();
        frage3 = new FRAGE3();
        frage4 = new FRAGE4();
        frage5 = new FRAGE5();
        frage6 = new FRAGE6();
        frage7 = new FRAGE7();
        frage8 = new FRAGE8();
        frage9 = new FRAGE9();
        frage10 = new FRAGE10();
        spielen();    
           
        
      
     
      
   }
   
    void spielen() {
                
      if (Level == 1) {
          
          oberflaeche.fragen.setText(frage1.Frage);        
          oberflaeche.ansa.setText("A: " +frage1.Antf1);
          oberflaeche.ansb.setText("B: " +frage1.Antf2);
          oberflaeche.ansc.setText("C: " +frage1.Antf3);
          oberflaeche.ansd.setText("D: " +frage1.Antt);
          oberflaeche.line6.setText("Level 1 <----");
          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
                
               if (frage1.RichtigeAntwort == "A" ) {
                Level = 2;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 2;
                   spielen();
                   
                }
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage1.RichtigeAntwort == "B" ) {
                Level = 2;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);    
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 2;
                   spielen();
                }
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage1.RichtigeAntwort == "C" ) {
                Level = 2;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 2;
                   spielen();
                }
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               if (frage1.RichtigeAntwort == "D" ) {
                Level = 2;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 2;
                   spielen();
                }
            }
        });
      }
      
      if (Level == 2) {
          
          oberflaeche.fragen.setText(frage2.Frage);        
          oberflaeche.ansa.setText("A: " +frage2.Antf1);
          oberflaeche.ansb.setText("B: " +frage2.Antt);
          oberflaeche.ansc.setText("C: " +frage2.Antf2);
          oberflaeche.ansd.setText("D: " +frage2.Antf3);
          oberflaeche.line5.setText("Level 2 <----");
          oberflaeche.line6.setText("Level 1 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage2.RichtigeAntwort == "A" ) {
                Level = 3;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 3;
                   spielen();
                }
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage2.RichtigeAntwort == "B" ) {
                Level = 3;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 3;
                   spielen();
                }
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               
               if (frage2.RichtigeAntwort == "C" ) {
                Level = 3;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);   
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 3;
                   spielen();
                }
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               if (frage2.RichtigeAntwort == "D" ) {
                Level = 3;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 3;
                   spielen();
                }              
            }
        });
      }
      
      if (Level == 3) {
          
          oberflaeche.fragen.setText(frage3.Frage);        
          oberflaeche.ansa.setText("A: " + frage3.Antf1);
          oberflaeche.ansb.setText("B: " +frage3.Antf2);
          oberflaeche.ansc.setText("C: " +frage3.Antt);
          oberflaeche.ansd.setText("D: " +frage3.Antf3);
          oberflaeche.line4.setText("Level 3 <----");
          oberflaeche.line5.setText("Level 2 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage3.RichtigeAntwort == "A" ) {
                Level = 4;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);    
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 4;
                   spielen();
                }
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage3.RichtigeAntwort == "B" ) {
                Level = 4;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 4;
                   spielen();
                }
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage3.RichtigeAntwort == "C" ) {
                Level = 4;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);     
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 4;
                   spielen();
                }
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage3.RichtigeAntwort == "D" ) {
                Level = 4;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);   
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 4;
                   spielen();
                }
            }
        });
      }
      
      if (Level == 4) {
          
          oberflaeche.fragen.setText(frage4.Frage);        
          oberflaeche.ansa.setText("A: " + frage4.Antf1);
          oberflaeche.ansb.setText("B: " +frage4.Antf2);
          oberflaeche.ansc.setText("C: " +frage4.Antt);
          oberflaeche.ansd.setText("D: " +frage4.Antf3);
          oberflaeche.line3.setText("Level 4 <----");
          oberflaeche.line4.setText("Level 3 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage4.RichtigeAntwort == "A" ) {
                Level = 5;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED); 
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 5;
                   spielen();
                }
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
              
                if (frage4.RichtigeAntwort == "B" ) {
                Level = 5;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED); 
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 5;
                   spielen();
                }
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
              
                if (frage4.RichtigeAntwort == "C" ) {
                Level = 5;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);    
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 5;
                   spielen();
                }
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                if (frage4.RichtigeAntwort == "D" ) {
                Level = 5;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 5;
                   spielen();
                }
            }
        });
      }
      
      if (Level == 5) {
          
          oberflaeche.fragen.setText(frage5.Frage);        
          oberflaeche.ansa.setText("A: " + frage5.Antf1);
          oberflaeche.ansb.setText("B: " +frage5.Antf2);
          oberflaeche.ansc.setText("C: " +frage5.Antt);
          oberflaeche.ansd.setText("D: " +frage5.Antf3);
          oberflaeche.line2.setText("Level 5 <----");
          oberflaeche.line3.setText("Level 4 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage5.RichtigeAntwort == "A" ) {
                Level = 6;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 6;
                   spielen();
                }
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
              
               if (frage5.RichtigeAntwort == "B" ) {
                Level = 6;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 6;
                   spielen();
                }
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
              
               if (frage5.RichtigeAntwort == "C" ) {
                Level = 6;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);  
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 6;
                   spielen();
                }
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               
               if (frage5.RichtigeAntwort == "D" ) {
                Level = 6;
               spielen();
               oberflaeche.fenster.setBackground(Color.GREEN);
               
               //oberflaeche.fenster.setBackground(oberflaeche.color);
              }
              else {
                   oberflaeche.fenster.setBackground(Color.RED);    
                   
                   //oberflaeche.fenster.setBackground(oberflaeche.color);
                   Level = 6;
                   spielen();
                }
            }
        });
      }
    }
   
   
     
    
    void antwortpruefen() {
        
        
    }
    
    // void fragen() {
        
        // switch (Level){
         
          // case 1:
          // oberflaeche.fragen.setText(frage1.Frage);        
          // oberflaeche.ansa.setText("A: " +frage1.Antf1);
          // oberflaeche.ansb.setText("B: " +frage1.Antf2);
          // oberflaeche.ansc.setText("C: " +frage1.Antf3);
          // oberflaeche.ansd.setText("D: " +frage1.Antt);
          // //getText(oberflaeche.ansd).frageRichtig = true;
          // aktuelleFrageRichtig = oberflaeche.ansd.getText();
          // System.out.println(aktuelleFrageRichtig);
          // Level = 2;
          // break;
          
          
          // case 2:
          // oberflaeche.fragen.setText(frage2.Frage);        
          // oberflaeche.ansa.setText("A: " +frage2.Antf1);
          // oberflaeche.ansb.setText("B: " +frage2.Antt);
          // oberflaeche.ansc.setText("C: " +frage2.Antf2);
          // oberflaeche.ansd.setText("D: " +frage2.Antf3);
          // Level = 3;
          // break;
          
          // case 3:
          // oberflaeche.fragen.setText(frage3.Frage);        
          // oberflaeche.ansa.setText("A: " + frage3.Antf1);
          // oberflaeche.ansb.setText("B: " +frage3.Antf2);
          // oberflaeche.ansc.setText("C: " +frage3.Antt);
          // oberflaeche.ansd.setText("D: " +frage3.Antf3);
          // Level = 4;
          // break;
          
          // case 4: 
          // oberflaeche.fragen.setText(frage4.Frage);        
          // oberflaeche.ansa.setText("A: " + frage4.Antf1);
          // oberflaeche.ansb.setText("B: " +frage4.Antf2);
          // oberflaeche.ansc.setText("C: " +frage4.Antt);
          // oberflaeche.ansd.setText("D: " +frage4.Antf3);
          // Level = 5; 
          // break;
          
          // case 5: 
          // oberflaeche.fragen.setText(frage5.Frage);        
          // oberflaeche.ansa.setText("A: " + frage5.Antf1);
          // oberflaeche.ansb.setText("B: " +frage5.Antf2);
          // oberflaeche.ansc.setText("C: " +frage5.Antt);
          // oberflaeche.ansd.setText("D: " +frage5.Antf3);
          // //Level = 6;
          // break;
          
          
        // }
        
    // }
    
    
}
