import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

public class GAME extends TIMER
{
    FRAGEN[] fragen; 
    OBERFLAECHE oberflaeche;   
    int Level;
    int AnzahlPunkte;
    
    public GAME()
    {
        oberflaeche = new OBERFLAECHE();      
        
        
        fragen = new FRAGEN[11];        
        fragen[0] = new FRAGEN("Wofür steht die KGaA ?","Kaum Götter aßen Ameisen","Kommanditgesellschaft auf Aktien","Koordinationsgesellschaft ab Aristoteles","Kommandogesetz aus Australien", "B");        
        fragen[1] = new FRAGEN("Wann fiel die Berliener Mauer ?","9.11.1989","9/11 2001","9. Novmeber 1989","9.Mai 2005", "A");
        fragen[2] = new FRAGEN("In welcher Einheit wird elektrischer Wiederstand gemessen ?","Volt","Amper","Ohm","Watt", "C");
        fragen[3] = new FRAGEN("Wieviele Planeten hat unser Sonnensystem ?","13","7","5","8", "D");
        fragen[4] = new FRAGEN("Wie hoch ist die Mehrwertsteuer in Deutschland ?","7%","19%","16%","9%","B");
        fragen[5] = new FRAGEN("Was ist die Hauptstadt von der Slowakai","Sofia","Bratislava","Prag","München", "B");
        fragen[6] = new FRAGEN("In welchem Meer liegt Hawaii","Atlantischer Ozean","Pazifischer Ozean","Mittelmeer","Karibisches Meer", "B");
        fragen[7] = new FRAGEN("Was ist die näheste Schicht der Atmosphäre ?","Mesophäre","Troposphäre","Thermosphäre","Stratosphäre", "B");
        fragen[8] = new FRAGEN("Was ist das chemische Symbol für Blei ?","Pt","Bl","Ag", "Pb", "D");
        fragen[9] = new FRAGEN("Was ist das schwerste Element ?","Mg","Er","U","Ga", "C");
        
        Level = 0; 
        
        main();
    }
     
    //public static void main(String[] args) //fragen wie man static umgeht 
     void main()
     {
          oberflaeche.fragen.setText(fragen[Level].FrageText);        
          oberflaeche.ansa.setText("A: " + fragen[Level].AntwortAText);
          oberflaeche.ansb.setText("B: " + fragen[Level].AntwortBText);
          oberflaeche.ansc.setText("C: " + fragen[Level].AntwortCText);
          oberflaeche.ansd.setText("D: " + fragen[Level].AntwortDText);
            
          oberflaeche.buta.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {
               if (fragen[Level].RichtigeAntwort == "A" ) {             
                   //oberflaeche.SpielFrame.setBackground(Color.GREEN);
                   
                   oberflaeche.buta.setBackground(Color.GREEN);
                   oberflaeche.butb.setBackground(Color.RED);
                   oberflaeche.butc.setBackground(Color.RED);
                   oberflaeche.butd.setBackground(Color.RED);
                   AnzahlPunkte = AnzahlPunkte + 5;  
                   
              }
              else {
                   //oberflaeche.SpielFrame.setBackground(Color.RED);
                   AnzahlPunkte = AnzahlPunkte - 3;  
                   switch (fragen[Level].RichtigeAntwort) {
                       case "B":   oberflaeche.butb.setBackground(Color.GREEN);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "C":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.GREEN);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "D":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.GREEN);
                                   break;
                    }
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                delay(1000);
                buttonReset();
                nächstesLevel();
                
            }
         });
         
         oberflaeche.butb.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {              
               if (fragen[Level].RichtigeAntwort == "B" ) {                          
                   //oberflaeche.SpielFrame.setBackground(Color.GREEN);  
                   AnzahlPunkte = AnzahlPunkte + 5;
                   
                   oberflaeche.buta.setBackground(Color.RED);
                   oberflaeche.butb.setBackground(Color.GREEN);
                   oberflaeche.butc.setBackground(Color.RED);
                   oberflaeche.butd.setBackground(Color.RED);
              }
              else {
                   //oberflaeche.SpielFrame.setBackground(Color.RED);    
                   AnzahlPunkte = AnzahlPunkte - 3;  
                   switch (fragen[Level].RichtigeAntwort) {
                       case "A":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.GREEN);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "C":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.GREEN);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "D":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.GREEN);
                                   break;
                    }
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                delay(1000);
                buttonReset();
                nächstesLevel();
            }
         });
     
  
         oberflaeche.butc.addActionListener(new ActionListener() 
         {
            public void actionPerformed(ActionEvent e)
            {               
                if (fragen[Level].RichtigeAntwort == "C" ) {
                   //oberflaeche.SpielFrame.setBackground(Color.GREEN);    
                   AnzahlPunkte = AnzahlPunkte + 5;
                   oberflaeche.buta.setBackground(Color.RED);
                   oberflaeche.butb.setBackground(Color.RED);
                   oberflaeche.butc.setBackground(Color.GREEN);
                   oberflaeche.butd.setBackground(Color.RED);
              }
              else {
                   //oberflaeche.SpielFrame.setBackground(Color.RED);  
                   AnzahlPunkte = AnzahlPunkte - 3;  
                   switch (fragen[Level].RichtigeAntwort) {
                       case "A":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.GREEN);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "B":   oberflaeche.butb.setBackground(Color.GREEN);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "D":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.GREEN);
                                   break;
                    }
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                delay(1000);
                buttonReset();
                nächstesLevel();
            }
         });
         
         
         oberflaeche.butd.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {               
                if (fragen[Level].RichtigeAntwort == "D" ) { 
                   //oberflaeche.SpielFrame.setBackground(Color.GREEN);
                   AnzahlPunkte = AnzahlPunkte + 5; 
                   oberflaeche.buta.setBackground(Color.RED);
                   oberflaeche.butb.setBackground(Color.RED);
                   oberflaeche.butc.setBackground(Color.RED);
                   oberflaeche.butd.setBackground(Color.GREEN);
              }
              else {
                   //oberflaeche.SpielFrame.setBackground(Color.RED);  
                   AnzahlPunkte = AnzahlPunkte - 3;
                   switch (fragen[Level].RichtigeAntwort) {
                       case "A":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.GREEN);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "B":   oberflaeche.butb.setBackground(Color.GREEN);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.RED);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                       case "C":   oberflaeche.butb.setBackground(Color.RED);
                                   oberflaeche.buta.setBackground(Color.RED);
                                   oberflaeche.butc.setBackground(Color.GREEN);
                                   oberflaeche.butd.setBackground(Color.RED);
                                   break;
                    }
                }
                oberflaeche.Score.setText("Punkte: " + AnzahlPunkte);
                delay(1000);
                buttonReset();
                nächstesLevel();
            }
        }); 
             
        
  }
  
  void nächstesLevel() 
  {
            
    Level ++;   
            
            switch (Level) {
                
                 case 0:   oberflaeche.line10.setText("Level 1 <----");  //Level 1
                           break;                      
                 case 1:   oberflaeche.line9.setText("Level 2 <----");   //Level 2
                           oberflaeche.line10.setText("Level 1 ");  
                           break;
                 case 2:   oberflaeche.line8.setText("Level 3 <----");   //Level 3
                           oberflaeche.line9.setText("Level 2 ");
                           break;
                 case 3:   oberflaeche.line7.setText("Level 4 <----");   //Level 4
                           oberflaeche.line8.setText("Level 3 ");
                           break;
                 case 4:   oberflaeche.line6.setText("Level 5 <----");   //Level 5
                           oberflaeche.line7.setText("Level 4 ");
                           break;
                 case 5:   oberflaeche.line5.setText("Level 6 <----");   //Level 6
                           oberflaeche.line6.setText("Level 5 ");
                           break;
                 case 6:   oberflaeche.line4.setText("Level 7 <----");   //Level 7
                           oberflaeche.line5.setText("Level 6 ");
                           break;
                 case 7:   oberflaeche.line3.setText("Level 8 <----");    //Level 8
                           oberflaeche.line4.setText("Level 7 "); 
                           break;
                 case 8:   oberflaeche.line2.setText("Level 9 <----");    //Level 9
                           oberflaeche.line3.setText("Level 8 ");   
                           break;
                 case 9:   oberflaeche.line1.setText("Level 10 <----");   //Level 10
                           oberflaeche.line2.setText("Level 9 ");
                           break;
                 case 10:  oberflaeche.EndFrame.setVisible(true);         //Endscreen
                           oberflaeche.SpielFrame.setVisible(false);
                           oberflaeche.gameOverLabel.setText("Well PLayed! You got " + AnzahlPunkte + " Points!");            
                 default:  
              }
              
            if (Level != 10) {  
            oberflaeche.fragen.setText(fragen[Level].FrageText);        
            oberflaeche.ansa.setText("A: " + fragen[Level ].AntwortAText);
            oberflaeche.ansb.setText("B: " + fragen[Level ].AntwortBText);
            oberflaeche.ansc.setText("C: " + fragen[Level ].AntwortCText);
            oberflaeche.ansd.setText("D: " + fragen[Level ].AntwortDText); 
        }
   }
            
  void buttonReset() {
      oberflaeche.buta.setBackground(null);
      oberflaeche.butb.setBackground(null);
      oberflaeche.butc.setBackground(null);
      oberflaeche.butd.setBackground(null);
    }
            
            
            
  
}
