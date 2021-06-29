import javax.swing.*;
import java.awt. *;
import java.awt.event.*;

 class OBERFLAECHE 
 
{
    Frame SpielFrame;
    Frame EinstellungenFrame;
    Frame StartFrame;
    Frame EndFrame;
    TIMER stoppuhr;
    
    Label fragen;
    
    Label line1;
    Label line2;
    Label line3;
    Label line4;
    Label line5;
    Label line6;
    Label line7;
    Label line8;
    Label line9;
    Label line10;
    Label Score;
    
    Label Information;
    Label gameOverLabel;
    
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
    
    Button EinstellungenButton;
    Button EinstellungenButtonStart;
    Button end;
    Button startPlaying; 
    Button gameOverButton;
    
    
    Color color;
    
    OBERFLAECHE()
    {
        
        SpielFrame = new Frame(); 
        EinstellungenFrame = new Frame();
        StartFrame = new Frame();
        EndFrame = new Frame();
        stoppuhr = new TIMER();
        
        line1 = new Label();
        line2 = new Label();
        line3 = new Label();
        line4 = new Label();
        line5 = new Label();
        line6 = new Label();
        line7 = new Label();
        line8 = new Label();
        line9 = new Label();
        line10 = new Label();
        Score = new Label();
        
        Information = new Label();
        gameOverLabel = new Label();
        
        fragen = new Label();
        ansa = new Label();
        ansb = new Label();
        ansc = new Label();
        ansd = new Label();
        buta = new Button();
        butb = new Button();
        butc = new Button();
        butd = new Button();
        
        
        startPlaying = new Button();
        EinstellungenButton = new Button();
        EinstellungenButtonStart = new Button();
        end = new Button();
        gameOverButton = new Button();
        
        blau = new Button();
        gelb = new Button();
        schwarz = new Button();
        weiß = new Button();
        
        Vollbild = new Button();
        Verkleinert = new Button();
        // adden der Elemente zum Verkleinert
        
        SpielFrame.add(buta);
        SpielFrame.add(butb);
        SpielFrame.add(butc);
        SpielFrame.add(butd);
        SpielFrame.add(fragen);
        SpielFrame.add(ansa);
        SpielFrame.add(ansb);
        SpielFrame.add(ansc);
        SpielFrame.add(ansd);        
        SpielFrame.add(EinstellungenButton);
        SpielFrame.add(end);        
        SpielFrame.add(line1);
        SpielFrame.add(line2);
        SpielFrame.add(line3);
        SpielFrame.add(line4);
        SpielFrame.add(line5);
        SpielFrame.add(line6);
        SpielFrame.add(line7);
        SpielFrame.add(line8);
        SpielFrame.add(line9);
        SpielFrame.add(line10);
        SpielFrame.add(Score);      
        
        // das SpielFrame des Quiz
        SpielFrame.setSize(1920,1080); 
        SpielFrame.setVisible (false); 
        SpielFrame.setTitle("Quizspiel");
        SpielFrame.setLayout(null);
        SpielFrame.setBackground(Color.WHITE);
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
        
        StartFrame.setSize(500, 500);
        StartFrame.setVisible (true); 
        StartFrame.setTitle("Start");
        StartFrame.setLayout(null);
        StartFrame.add(startPlaying);
        StartFrame.add(Information);
        StartFrame.add(EinstellungenButtonStart);
        
        EndFrame.setSize(500, 500);
        EndFrame.setVisible (false); 
        EndFrame.setTitle("Ende");
        EndFrame.setLayout(null);
        EndFrame.add(gameOverLabel);
        EndFrame.add(gameOverButton);
        
        startPlaying.setSize(80, 50);
        startPlaying.setVisible(true);
        startPlaying.setLocation(210, 180);
        startPlaying.setEnabled(true);
        startPlaying.setLabel("Spielen");
        
        EinstellungenButtonStart.setSize(80, 50);
        EinstellungenButtonStart.setVisible(true);
        EinstellungenButtonStart.setLocation(210, 240);
        EinstellungenButtonStart.setEnabled(true);
        EinstellungenButtonStart.setLabel("Einstellungen");
        
        Information.setSize(400,10);
        Information.setLocation(100, 350);
        Information.setVisible(true);
        Information.setText("Informatikprojekt von : Cedric, Noah, Severin, Flora");
        
        gameOverLabel.setSize(80,50);
        gameOverLabel.setLocation(210, 200);
        gameOverLabel.setVisible(true);
        gameOverLabel.setText("Well Played!");
        
        gameOverButton.setSize(80, 50);
        gameOverButton.setVisible(true);
        gameOverButton.setLocation(210, 300);
        gameOverButton.setEnabled(true);
        gameOverButton.setLabel("Beenden");
        
        
        //Die labels der Levelanzeige
        line1.setSize(70,20);
        line1.setLocation(1700, 400);
        line1.setVisible(true);
        line1.setText("Level 10 ");        
        line2.setSize(70,20);
        line2.setLocation(1700, 420);
        line2.setVisible(true);
        line2.setText("Level 9 ");   
        line3.setSize(70,20);
        line3.setLocation(1700, 440);
        line3.setVisible(true);
        line3.setText("Level 8 ");      
        line4.setSize(70,20);
        line4.setLocation(1700, 460);
        line4.setVisible(true);
        line4.setText("Level 7 ");        
        line5.setSize(70,20);
        line5.setLocation(1700, 480);
        line5.setVisible(true);
        line5.setText("Level 6 ");       
        line6.setSize(70,20);
        line6.setLocation(1700, 500);
        line6.setVisible(true);
        line6.setText("Level 5 ");   
        line7.setSize(70,20);
        line7.setLocation(1700, 520);
        line7.setVisible(true);
        line7.setText("Level 4 ");        
        line8.setSize(70,20);
        line8.setLocation(1700, 540);
        line8.setVisible(true);
        line8.setText("Level 3 ");        
        line9.setSize(70,20);
        line9.setLocation(1700, 560);
        line9.setVisible(true);
        line9.setText("Level 2 ");        
        line10.setSize(70,20);
        line10.setLocation(1700, 580);
        line10.setVisible(true);
        line10.setText("Level 1 ");      
        Score.setSize(70,20);
        Score.setLocation(1700, 600);
        Score.setVisible(true);
        Score.setText("Punkte: ");
        
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
        
        
        
        
        
        
        //Button zu den Einstellungen
        EinstellungenButton.setSize(80,50);
        EinstellungenButton.setLocation(20, 50);
        EinstellungenButton.setVisible(true);
        EinstellungenButton.setLabel("Einstellungen");
        EinstellungenButton.setEnabled(true);
        
        //Button zum Beenden
        end.setSize(80,50);
        end.setLocation(20, 101);
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
        
        
        startPlaying.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                 StartFrame.setVisible(false);
                 SpielFrame.setVisible(true);
                 EinstellungenFrame.setVisible(false);
            }
        });
        
        gameOverButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(1);               
            }
        });
        
        //Button der Einstellungen
        EinstellungenButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                 EinstellungenFrame.setVisible(true);
                 
            }
        });
        
        EinstellungenButtonStart.addActionListener(new ActionListener() 
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
                SpielFrame.setBackground(Color.BLUE);   
                color = Color.BLUE;
            }
        });
        gelb.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                SpielFrame.setBackground(Color.YELLOW);                
                color = Color.YELLOW;
            }
        });
        schwarz.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                SpielFrame.setBackground(Color.BLACK);                
                color = Color.BLACK;
            }
        });
        weiß.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                SpielFrame.setBackground(Color.WHITE);                
                color = Color.WHITE;
            }
        });
        Vollbild.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                SpielFrame.setSize(1920,1080);  
                fragen.setLocation(645,700);
                ansa.setLocation(645, 760);
                ansb.setLocation(975, 760);
                ansc.setLocation(645, 820);
                ansd.setLocation(975, 820);
                
                buta.setLocation(605, 900);
                butb.setLocation(810, 900);
                butc.setLocation(1030, 900);
                butd.setLocation(1235, 900);
                
                 line1.setLocation(1700, 400);
                 line2.setLocation(1700, 420);
                 line3.setLocation(1700, 440);
                 line4.setLocation(1700, 460);
                 line5.setLocation(1700, 480);
                 line6.setLocation(1700, 500);
                 line7.setLocation(1700, 520);
                 line8.setLocation(1700, 540);
                 line9.setLocation(1700, 560);
                 line10.setLocation(1700, 580);
                 Score.setLocation(1700, 600);
            }
        });
        Verkleinert.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                  SpielFrame.setSize(960,1080);   
                 fragen.setLocation(185,700);
                 ansa.setLocation(185, 760);
                 ansb.setLocation(515, 760);
                 ansc.setLocation(185, 820);
                 ansd.setLocation(515, 820);
                
                 buta.setLocation(145, 900);
                 butb.setLocation(350, 900);
                 butc.setLocation(570, 900);
                 butd.setLocation(775, 900);
                 
                 line1.setLocation(820, 400);
                 line2.setLocation(820, 420);
                 line3.setLocation(820, 440);
                 line4.setLocation(820, 460);
                 line5.setLocation(820, 480);
                 line6.setLocation(820, 500);
                 line7.setLocation(820, 520);
                 line8.setLocation(820, 540);
                 line9.setLocation(820, 560);
                 line10.setLocation(820, 580);
                 Score.setLocation(820, 600);
            }
        });
        
        //SpielFrame beenden
        SpielFrame.addWindowListener(new WindowAdapter()
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
        
        StartFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
        
        EndFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }

    
}
     
    
     
      
    
    
    



