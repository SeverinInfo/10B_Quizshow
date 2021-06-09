import javax.swing.*;     
import java.awt. *;
import java.awt.event.*;

public class JFRAMEEXAMPLE extends JComponent
{
    
    
    public JFRAMEEXAMPLE() {
        
    }
    
    public static void main(String[] arg) {
        JFrame frame = new JFrame("Testing out Jframe");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(new JFRAMEEXAMPLE());
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.RED);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(50,50,50,50);
    }
}