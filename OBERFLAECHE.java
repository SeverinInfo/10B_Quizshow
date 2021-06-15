import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class OBERFLAECHE 
 
{
    Frame fenster;
    Frame EinstellungenFrame;
    
    TIMER stoppuhr;
    
    Label fragen;
    
    Label line1;
    Label line2;
    Label line3;
    Label line4;
    Label line5;
    Label line6;
    
    Label timer;
    
    Label ansa;
    Label ansb;
    Label ansc;
    Label ansd;
    
    Button buta;
    Button butb;
    Button butc;
    Button butd;
        
    Button blau;
    Button gelb;
    Button schwarz;
    Button weiß;
    
    Button Vollbild;
    Button Verkleinert;    
    
    Button Einstellungen;
    Button end;
    Button start;  
    
    
    
    Color color;
    
    OBERFLAECHE()
    {
        
        fenster = new Frame(); 
        EinstellungenFrame = new Frame();
        
        stoppuhr = new TIMER();
        
        line1 = new Label();
        line2 = new Label();
        line3 = new Label();
        line4 = new Label();
        line5 = new Label();
        line6 = new Label();
        
        
        
        
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
        start = new Button();
        
        blau = new Button();
        gelb = new Button();
        schwarz = new Button();
        weiß = new Button();
        
        Vollbild = new Button();
        Verkleinert = new Button();
        // adden der Elemente zum Verkleinert
        
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
        fenster.add(start);
        
        fenster.add(line1);
        fenster.add(line2);
        fenster.add(line3);
        fenster.add(line4);
        fenster.add(line5);
        fenster.add(line6);
        
        
        
        
        
        
        
        // das fenster des Quiz
        fenster.setSize(1920,1080); 
        fenster.setVisible (true); 
        fenster.setTitle("Quizspiel");
        fenster.setLayout(null);
        fenster.setBackground(Color.WHITE);
        color = Color.WHITE;
        
        // das Verkleinert der Einstellung 
        EinstellungenFrame.setSize(500,700);
        EinstellungenFrame.setVisible (false); 
        EinstellungenFrame.setTitle("Einstellungen");
        EinstellungenFrame.setLayout(null);
        EinstellungenFrame.add(blau);
        EinstellungenFrame.add(gelb);
        EinstellungenFrame.add(schwarz);
        EinstellungenFrame.add(weiß);
        EinstellungenFrame.add(Vollbild);
        EinstellungenFrame.add(Verkleinert);
        
        
        line1.setSize(70,20);
        line1.setLocation(1700, 400);
        line1.setVisible(true);
        line1.setText("Level 6 ");       
        
        
        line2.setSize(70,20);
        line2.setLocation(1700, 420);
        line2.setVisible(true);
        line2.setText("Level 5 ");
        
        
        line3.setSize(70,20);
        line3.setLocation(1700, 440);
        line3.setVisible(true);
        line3.setText("Level 4 ");
        
        
        line4.setSize(70,20);
        line4.setLocation(1700, 460);
        line4.setVisible(true);
        line4.setText("Level 3 ");
        
        
        line5.setSize(70,20);
        line5.setLocation(1700, 480);
        line5.setVisible(true);
        line5.setText("Level 2 ");
        
        
        line6.setSize(70,20);
        line6.setLocation(1700, 500);
        line6.setVisible(true);
        line6.setText("Level 1 ");
        
        
        
        // das textfeld der Frage
        fragen.setSize(630, 50);
        fragen.setVisible(true);
        fragen.setLocation(645,700);
        fragen.setText("" );
        
        
        //Buttons der Farbeinstellung
        blau.setSize(80, 50);
        blau.setVisible(true);
        blau.setLocation(350, 50);
        blau.setEnabled(true);
        blau.setLabel("Blau");
        gelb.setSize(80, 50);
        gelb.setVisible(true);
        gelb.setLocation(350, 101);
        gelb.setEnabled(true);
        gelb.setLabel("Gelb");
        schwarz.setSize(80, 50);
        schwarz.setVisible(true);
        schwarz.setLocation(350, 152);
        schwarz.setEnabled(true);
        schwarz.setLabel("Schwarz");
        weiß.setSize(80, 50);
        weiß.setVisible(true);
        weiß.setLocation(350, 203);
        weiß.setEnabled(true);
        weiß.setLabel("weiß");
        
        Verkleinert.setSize(80, 50);
        Verkleinert.setVisible(true);
        Verkleinert.setLocation(150, 50);
        Verkleinert.setEnabled(true);
        Verkleinert.setLabel("Verkleinert");
        Vollbild.setSize(80, 50);
        Vollbild.setVisible(true);
        Vollbild.setLocation(150, 101);
        Vollbild.setEnabled(true);
        Vollbild.setLabel("Vollbild");
        
        
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
        
        
        //Label des timers
        timer.setSize(80,50);
        timer.setLocation(1000, 50);
        timer.setVisible(true);
        timer.setText("Zeit " + stoppuhr.nummer);
        
        
        
        //Button zu den Einstellungen
        Einstellungen.setSize(80,50);
        Einstellungen.setLocation(20, 30);
        Einstellungen.setVisible(true);
        Einstellungen.setLabel("Einstellungen");
        Einstellungen.setEnabled(true);
        
        //Button zum Beenden
        end.setSize(80,50);
        end.setLocation(20, 81);
        end.setVisible(true);
        end.setLabel("stop");
        end.setEnabled(true);
        
        start.setSize(80,50);
        start.setLocation(20, 132);
        start.setVisible(true);
        start.setLabel("start");
        start.setEnabled(true);
        
        //Button zum Beenden
        end.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(1);               
            }
        });
        
        start.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                stoppuhr.runterzaehlen();    
                // timer.setText("Zeit " + stoppuhr.nummer);
                // zeitabfragen();
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
        
        
        //Buttons zum Farbe ändern
        blau.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.BLUE);   
                color = Color.BLUE;
            }
        });
        gelb.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.YELLOW);                
                color = Color.YELLOW;
            }
        });
        schwarz.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.BLACK);                
                color = Color.BLACK;
            }
        });
        weiß.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setBackground(Color.WHITE);                
                color = Color.WHITE;
            }
        });
        Vollbild.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                fenster.setSize(1920,1080);  
                fragen.setLocation(645,700);
                ansa.setLocation(645, 760);
                ansb.setLocation(975, 760);
                ansc.setLocation(645, 820);
                ansd.setLocation(975, 820);
                
                buta.setLocation(605, 900);
                butb.setLocation(810, 900);
                butc.setLocation(1030, 900);
                butd.setLocation(1235, 900);
            }
        });
        Verkleinert.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                 fenster.setSize(960,1080);   
                 fragen.setLocation(185,700);
                 ansa.setLocation(185, 760);
                 ansb.setLocation(515, 760);
                 ansc.setLocation(185, 820);
                 ansd.setLocation(515, 820);
                
                 buta.setLocation(145, 900);
                 butb.setLocation(350, 900);
                 butc.setLocation(570, 900);
                 butd.setLocation(775, 900);
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

    // void zeitabfragen()
    // {
         // timer.setText("Zeit " + stoppuhr.nummer);
         // stoppuhr.nummer.getValue( );
    // }
}
     
    
     
      
    
    
    



