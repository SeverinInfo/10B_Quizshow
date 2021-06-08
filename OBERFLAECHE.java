import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class OBERFLAECHE 
 
{
    Frame fenster;
    Frame EinstellungenFrame;
    
    Label fragen;
    Button buta;
    Button butb;
    Button butc;
    Button butd;
    Label ansa;
    Label ansb;
    Label ansc;
    Label ansd;
    
    Button blau;
    Button gelb;
    Button schwarz;
    Button weiß;
    
    Label timer;
    Button Einstellungen;
    Button end;
    
    
    
    
    
    OBERFLAECHE()
    {
        
        fenster = new Frame(); 
        EinstellungenFrame = new Frame();
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
        Einstellungen = new Button();
        end = new Button();
        
        blau = new Button();
        gelb = new Button();
        schwarz = new Button();
        weiß = new Button();
        
        
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
        fenster.add(Einstellungen);
        fenster.add(end);
        
        
        fenster.setBackground(Color.WHITE);
        
        
        
        
        
        // das fenster des Quiz
        fenster.setSize(1920,1080); 
        fenster.setVisible (true); 
        fenster.setTitle("Quizspiel");
        fenster.setLayout(null);
        
        EinstellungenFrame.setSize(500,700);
        EinstellungenFrame.setVisible (false); 
        EinstellungenFrame.setTitle("Einstellungen");
        EinstellungenFrame.setLayout(null);
        EinstellungenFrame.add(blau);
        EinstellungenFrame.add(gelb);
        EinstellungenFrame.add(schwarz);
        EinstellungenFrame.add(weiß);
        
        // das textfeld der Frage
        fragen.setSize(630, 50);
        fragen.setVisible(true);
        fragen.setLocation(645,700);
        fragen.setText("" );
        
        blau.setSize(80, 50);
        blau.setVisible(true);
        blau.setLocation(210, 50);
        blau.setEnabled(true);
        blau.setLabel("Blau");
        gelb.setSize(80, 50);
        gelb.setVisible(true);
        gelb.setLocation(210, 200);
        gelb.setEnabled(true);
        gelb.setLabel("Gelb");
        schwarz.setSize(80, 50);
        schwarz.setVisible(true);
        schwarz.setLocation(210, 350);
        schwarz.setEnabled(true);
        schwarz.setLabel("Schwarz");
        weiß.setSize(80, 50);
        weiß.setVisible(true);
        weiß.setLocation(210, 500);
        weiß.setEnabled(true);
        weiß.setLabel("weiß");
        
        
        
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
        
        Einstellungen.setSize(80,50);
        Einstellungen.setLocation(890, 100);
        Einstellungen.setVisible(true);
        Einstellungen.setLabel("Einstellungen");
        Einstellungen.setEnabled(true);
        
        end.setSize(80,50);
        end.setLocation(890, 200);
        end.setVisible(true);
        end.setLabel("stop");
        end.setEnabled(true);
        
        
        //Button zum Beenden
        end.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(1);               
            }
        });
        
        //Button der Einstellungen
        Einstellungen.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                 EinstellungenFrame.setVisible(true);
                 
            }
        });
        
        
        //Button zum Farbe ändern
        blau.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.BLUE);                
            }
        });
        gelb.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.YELLOW);                
            }
        });
        schwarz.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.BLACK);                
            }
        });
        weiß.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.WHITE);                
            }
        });
        
        
        
        //Frame beenden
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });  
        
        //frame der Einstellungen
        EinstellungenFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                
                EinstellungenFrame.setVisible(false);
            }
        });
        
        
    }

    
}
     
    
     
      
    
    
    



