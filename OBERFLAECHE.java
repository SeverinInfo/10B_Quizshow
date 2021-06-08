import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class OBERFLAECHE 
 
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
    
    
    Label timer;
    Button start;
    Button stop;
    
    
    
    
    
    OBERFLAECHE()
    {
        
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
        
        timer = new Label();
        start = new Button();
        stop = new Button();
        
        
        fenster.add(buta);
        fenster.add(butb);
        fenster.add(butc);
        fenster.add(butd);
        fenster.add(fragen);
        fenster.add(ansa);
        fenster.add(ansb);
        fenster.add(ansc);
        fenster.add(ansd);
        
        fenster.add(timer);
        fenster.add(start);
        fenster.add(stop);
        
        
        fenster.setBackground(Color.YELLOW);
        
        // das fenster des Quiz
        fenster.setSize(1920,1080); 
        fenster.setVisible (true); 
        fenster.setTitle("Quizspiel");
        fenster.setLayout(null);
        
        
        // das textfeld der Frage
        fragen.setSize(630, 50);
        fragen.setVisible(true);
        fragen.setLocation(645,700);
        fragen.setText("" );
        
        
        // die Textfelder der Antworten
        ansa.setSize(300, 50);
        ansa.setVisible(true);
        ansa.setLocation(645, 760);
        ansa.setText("A:  "  );
        
        ansb.setSize(300, 50);
        ansb.setVisible(true);
        ansb.setLocation(975, 760);
        ansb.setText("B:  " );
        
        ansc.setSize(300, 50);
        ansc.setVisible(true);
        ansc.setLocation(645, 820);
        ansc.setText("C:  " );
        
        ansd.setSize(300, 50);
        ansd.setVisible(true);
        ansd.setLocation(975, 820);
        ansd.setText("D:  " );
        
        
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
        
        timer.setSize(80,50);
        timer.setLocation(1000, 50);
        timer.setVisible(true);
        timer.setText("Zeit " );
        
        start.setSize(80,50);
        start.setLocation(890, 50);
        start.setVisible(true);
        start.setLabel("start");
        start.setEnabled(true);
        
        stop.setSize(80,50);
        stop.setLocation(890, 200);
        stop.setVisible(true);
        stop.setLabel("stop");
        stop.setEnabled(true);
        
        
        
        start.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                //runterzaehlen(25);
                //timer.setText("Zeit: " );       
                
                
                
                
                
                
            }
        });
        
        stop.addActionListener(new ActionListener() //nur kurzzeitig als Test, sonst geht das automatisch
        {
            public void actionPerformed(ActionEvent e)
            {
                //return runterzaehlen();
                //timer.setText("Zeit: " );
            }
        });
       
        
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });                      
    }

    
}
     
    
     
      
    
    
    



