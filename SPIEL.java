import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class SPIEL extends TIMER
{
    OBERFLAECHE oberflaeche;   
    int Level;
    int AnzahlPunkte;
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
        AnzahlPunkte = 0;
        Level = 1;
        spielen();
    }
   
    void spielen() {
        
       switch (Level) {
       case 1: 
       
       
          oberflaeche.fragen.setText(frage1.Frage);        
          oberflaeche.ansa.setText("A: " +frage1.Antf1);
          oberflaeche.ansb.setText("B: " +frage1.Antf2);
          oberflaeche.ansc.setText("C: " +frage1.Antf3);
          oberflaeche.ansd.setText("D: " +frage1.Antt);
          oberflaeche.line10.setText("Level 1 <----");          
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               if (frage1.RichtigeAntwort == "A" ) {             
               oberflaeche.SpielFrame.setBackground(Color.GREEN);              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 2;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage1.RichtigeAntwort == "B" ) {                          
               oberflaeche.SpielFrame.setBackground(Color.GREEN);             
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 2;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
                if (frage1.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 2; 
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
                if (frage1.RichtigeAntwort == "D" ) { 
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;                              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);                                      
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 2; 
                spielen();
            }
        });   
        Level = 2;
        break;
        
        
      case 2:
                  
          oberflaeche.fragen.setText(frage2.Frage);        
          oberflaeche.ansa.setText("A: " +frage2.Antf1);
          oberflaeche.ansb.setText("B: " +frage2.Antt);
          oberflaeche.ansc.setText("C: " +frage2.Antf2);
          oberflaeche.ansd.setText("D: " +frage2.Antf3);
          oberflaeche.line9.setText("Level 2 <----");
          oberflaeche.line10.setText("Level 1 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               if (frage2.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);        
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 3;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage2.RichtigeAntwort == "B" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 3;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
              if (frage2.RichtigeAntwort == "C" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);                
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);   
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 3;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               if (frage2.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;               
                }   
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 3;
                spielen();
            }
        });
        break;
       
      case 3:
                 
          oberflaeche.fragen.setText(frage3.Frage);        
          oberflaeche.ansa.setText("A: " + frage3.Antf1);
          oberflaeche.ansb.setText("B: " +frage3.Antf2);
          oberflaeche.ansc.setText("C: " +frage3.Antt);
          oberflaeche.ansd.setText("D: " +frage3.Antf3);
          oberflaeche.line8.setText("Level 3 <----");
          oberflaeche.line9.setText("Level 2 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage3.RichtigeAntwort == "A" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 4;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               if (frage3.RichtigeAntwort == "B" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 4;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage3.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);              
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 4;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
               if (frage3.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);   
                   //AnzahlPunkte = AnzahlPunkte - 3;                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 4; 
                spielen();
            }
        });
        break;
       
    
      case 4:
                 
          oberflaeche.fragen.setText(frage4.Frage);        
          oberflaeche.ansa.setText("A: " + frage4.Antf1);
          oberflaeche.ansb.setText("B: " +frage4.Antf2);
          oberflaeche.ansc.setText("C: " +frage4.Antt);
          oberflaeche.ansd.setText("D: " +frage4.Antf3);
          oberflaeche.line7.setText("Level 4 <----");
          oberflaeche.line8.setText("Level 3 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage4.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED); 
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 5; 
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
                if (frage4.RichtigeAntwort == "B" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED); 
                   //AnzahlPunkte = AnzahlPunkte - 3;               
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 5; 
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
                if (frage4.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 5; 
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                if (frage4.RichtigeAntwort == "D" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;             
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 5;
                spielen();
            }
        });
        break;
       
      case 5:
                 
          oberflaeche.fragen.setText(frage5.Frage);        
          oberflaeche.ansa.setText("A: " + frage5.Antf1);
          oberflaeche.ansb.setText("B: " +frage5.Antf2);
          oberflaeche.ansc.setText("C: " +frage5.Antt);
          oberflaeche.ansd.setText("D: " +frage5.Antf3);
          oberflaeche.line6.setText("Level 5 <----");
          oberflaeche.line7.setText("Level 4 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               if (frage5.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                                       
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 6; 
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage5.RichtigeAntwort == "B" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;              
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 6; 
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage5.RichtigeAntwort == "C" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
               }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);             
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 6; 
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage5.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 6;
                spielen();
            }
        });
       break;
       
      case 6:
                 
          oberflaeche.fragen.setText(frage6.Frage);        
          oberflaeche.ansa.setText("A: " + frage6.Antf1);
          oberflaeche.ansb.setText("B: " +frage6.Antf2);
          oberflaeche.ansc.setText("C: " +frage6.Antf3);
          oberflaeche.ansd.setText("D: " +frage6.Antt);
          oberflaeche.line5.setText("Level 6 <----");
          oberflaeche.line6.setText("Level 5 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage6.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 7;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage6.RichtigeAntwort == "B" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 7;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage6.RichtigeAntwort == "C" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 7;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage6.RichtigeAntwort == "D" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;            
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 7;
                spielen();
            }
        });       
        break;
       
      case 7:
                 
          oberflaeche.fragen.setText(frage7.Frage);        
          oberflaeche.ansa.setText("A: " + frage7.Antt);
          oberflaeche.ansb.setText("B: " +frage7.Antf2);
          oberflaeche.ansc.setText("C: " +frage7.Antf1);
          oberflaeche.ansd.setText("D: " +frage7.Antf3);
          oberflaeche.line4.setText("Level 7 <----");
          oberflaeche.line5.setText("Level 6 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage7.RichtigeAntwort == "A" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);             
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 8; 
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage7.RichtigeAntwort == "B" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;             
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 8;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage7.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;               
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 8;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage7.RichtigeAntwort == "D" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                  
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 8;
                spielen();
            }
        });
       break;
       
      case 8:
       
          oberflaeche.fragen.setText(frage8.Frage);        
          oberflaeche.ansa.setText("A: " + frage8.Antf1);
          oberflaeche.ansb.setText("B: " +frage8.Antf2);
          oberflaeche.ansc.setText("C: " +frage8.Antt);
          oberflaeche.ansd.setText("D: " +frage8.Antf3);
          oberflaeche.line3.setText("Level 8 <----");
          oberflaeche.line4.setText("Level 7 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage8.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 9;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage8.RichtigeAntwort == "B" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                 
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 9;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage8.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);                
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 9;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage8.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);         
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                    
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 9;
                spielen();
            }
        });   
        break;
       
     case 9:
               
          oberflaeche.fragen.setText(frage9.Frage);        
          oberflaeche.ansa.setText("A: " + frage9.Antf2);
          oberflaeche.ansb.setText("B: " +frage9.Antt);
          oberflaeche.ansc.setText("C: " +frage9.Antf1);
          oberflaeche.ansd.setText("D: " +frage9.Antf3);
          oberflaeche.line2.setText("Level 9 <----");
          oberflaeche.line3.setText("Level 8 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage9.RichtigeAntwort == "A" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);             
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 10; 
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage9.RichtigeAntwort == "B" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);              
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 10; 
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage9.RichtigeAntwort == "C" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;              
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 10; 
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage9.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;               
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 10; 
                spielen();
            }
        });
       break;
       
     case 10:
                 
          oberflaeche.fragen.setText(frage10.Frage);        
          oberflaeche.ansa.setText("A: " + frage10.Antt);
          oberflaeche.ansb.setText("B: " +frage10.Antf2);
          oberflaeche.ansc.setText("C: " +frage10.Antf1);
          oberflaeche.ansd.setText("D: " +frage10.Antf3);
          oberflaeche.line1.setText("Level 10 <----");
          oberflaeche.line2.setText("Level 9 ");
          
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage10.RichtigeAntwort == "A" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);
               //AnzahlPunkte = AnzahlPunkte + 5;
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);               
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);     
                Level = 11;
                spielen();
            }
         });         
        oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage10.RichtigeAntwort == "B" ) {
                oberflaeche.SpielFrame.setBackground(Color.GREEN);              
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                   
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);   
                Level = 11;
                spielen();
            }
         });        
        oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (frage10.RichtigeAntwort == "C" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);  
                   //AnzahlPunkte = AnzahlPunkte - 3;                 
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 11;
                spielen();
            }
         });        
        oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
               if (frage10.RichtigeAntwort == "D" ) {
               oberflaeche.SpielFrame.setBackground(Color.GREEN);               
              }
              else {
                   oberflaeche.SpielFrame.setBackground(Color.RED);    
                   //AnzahlPunkte = AnzahlPunkte - 3;                                       
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                Level = 11;
                spielen();
            }
        });    
        break;
       
       
     case 11:
     
         oberflaeche.EndFrame.setVisible(true);
         oberflaeche.SpielFrame.setVisible(false);
       
     default: 
      
    }
    }
   
    void nextLevel() {
        
        Level = Level + 1; 
    }
    
    
    
    
    
    
}
