package danielczykjakub_projekt;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;


public class RoadStripe extends JComponent {
    
    private int yPosition;
    private final Timer timer;
    
    public RoadStripe(int x, int y) {
        setSize(5, 100);
        yPosition = y;
        setLocation(x, y);
        timer = new Timer(1, (e) -> {
            yPosition++;
            setLocation(getLocation().x, yPosition);
            repaint();
        });
    }
    
    public void startTimer() {
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.white);
        g.fillRect(0, 0, getSize().width, getSize().height);
    }
       
}
