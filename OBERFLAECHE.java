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
    
    
    OBERFLAECHE()
    {
        frame = new Frame(); 
        frame.setSize (640, 480); 
        frame.setVisible (true); 
        
        b1 = new Button();
        b1.setVisible (true);
        b1.setLabel("Antwort1");
          b1.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              { ;}
          });
    }

    
    
    
    
    
}
