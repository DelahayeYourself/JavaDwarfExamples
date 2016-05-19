package blinkerapp.views;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author sam
 */
public class BlinkPanel extends JPanel {

    final static int MARGIN = 4;
    
    private Color myColor = Color.PINK;
    
    @Override
    public void paint(Graphics g){
        int width = this.getSize().width - 2 * MARGIN;
        int height = this.getSize().height - 2 * MARGIN;
        g.setColor(myColor);
        g.fillRect(MARGIN, MARGIN, width, height);
    }

    public void changeMyColor(Color newColor) {
        myColor = newColor;
        this.repaint();
    }
}
