import javax.swing. *;
import java.awt. *;
import java.awt.event.*;
 class OBERFLAECHE extends SPIEL
 
{
    OBERFLAECHE Scoreboard;
    Frame frame;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    SPIEL timer;
    
    OBERFLAECHE()
    {
        frame = new Frame(); 
        frame.setSize (1000, 500); 
        frame.setVisible (true); 
        frame.setTitle("Quizspiel");
        frame.setLayout(null);
        frame.add(b1);
        
        b1 = new Button();
        b1.setSize(120, 50);
        b1.setLocation(50, 150);
        b1.setVisible (true);
        b1.setLabel("Antwort1"); 
        b1.setEnabled(true);
        b1.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              { timer.runterzaehlen(25);}   });
                                                          
    }

    
    
    
    
    
}
