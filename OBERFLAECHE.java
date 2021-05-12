import java.awt. *;
import java.awt.event.*;
 class OBERFLAECHE extends SPIEL
 
{
    Frame fenster;
    Label fragen;
    Button buta;
    Button butb;
    Button butc;
    Button butd;    
    Label ansa;
    Label ansb;
    Label ansc;
    Label ansd;
    
    int i;
    Label timerAnzeige;
    
    OBERFLAECHE()
    {
        i = 25;
        fenster = new Frame(); 
        fragen = new Label();
        ansa = new Label();
        ansb = new Label();
        ansc = new Label();
        ansd = new Label();
        buta = new Button();
        butb = new Button();
        butc = new Button();
        butd = new Button();
        timerAnzeige = new Label();
        
        fenster.add(buta);
        fenster.add(butb);
        fenster.add(butc);
        fenster.add(butd);
        fenster.add(fragen);
        fenster.add(ansa);
        fenster.add(ansb);
        fenster.add(ansc);
        fenster.add(ansd);
        fenster.add(timerAnzeige);
        
        
        
        // das fenster des Quiz
        fenster.setSize(1920,1080); 
        fenster.setVisible (true); 
        fenster.setTitle("Quizspiel");
        fenster.setLayout(null);
        
        
        // das textfeld der Frage
        fragen.setSize(630, 50);
        fragen.setVisible(true);
        fragen.setLocation(645,700);
        fragen.setText("Frage");
        
        
        // die Textfelder der Antworten
        ansa.setSize(300, 50);
        ansa.setVisible(true);
        ansa.setLocation(645, 760);
        ansa.setText("A:");
        
        ansb.setSize(300, 50);
        ansb.setVisible(true);
        ansb.setLocation(975, 760);
        ansb.setText("B:");
        
        ansc.setSize(300, 50);
        ansc.setVisible(true);
        ansc.setLocation(645, 820);
        ansc.setText("C:");
        
        ansd.setSize(300, 50);
        ansd.setVisible(true);
        ansd.setLocation(975, 820);
        ansd.setText("D:");
        
        
        // die Buttons der Antwortmöglichkeiten
        buta.setSize(80, 50);
        buta.setLocation(605, 900);
        buta.setVisible (true);
        buta.setLabel("A"); 
        buta.setEnabled(true);
        
        butb.setSize(80, 50);
        butb.setLocation(810, 900);
        butb.setVisible (true);
        butb.setLabel("B"); 
        butb.setEnabled(true);
        
        butc.setSize(80, 50);
        butc.setLocation(1030, 900);
        butc.setVisible (true);
        butc.setLabel("C"); 
        butc.setEnabled(true);
        
        butd.setSize(80, 50);
        butd.setLocation(1235, 900);
        butd.setVisible (true);
        butd.setLabel("D"); 
        butd.setEnabled(true);
        
       
        //timer 
        timerAnzeige.setVisible(true);
        //timerAnzeige.setText(i);
        timerAnzeige.setLocation(1800, 100);
        timerAnzeige.setSize(80, 50);
        
        
        
        
        
        
        
                                                          
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
                 
             //timerAnzeige.setText(i);    
             //System.out.println(i);
             if (i == 0) {
                timerAnzeige.setText("Zeit abgelaufen");
               }       
        
        
        
    
        }
    }
    
    
    
    
}
