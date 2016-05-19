package gostop.views;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author sam
 */
public class LedPanel extends JPanel {

    private Color myColor = Color.PINK;
    private boolean fill = false;

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    @Override
    public void paint(Graphics g) {
        if (this.fill) {
            g.setColor(myColor);
            g.fillOval(0, 0, this.getSize().width, this.getSize().height);
        }else{
            g.clearRect(0, 0, this.getSize().width, this.getSize().height);
        }
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, this.getSize().width, this.getSize().height);
    }
    
    public void toggle(){
        this.fill = !fill;
        this.repaint();
    }
}
