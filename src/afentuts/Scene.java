package afentuts;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Scene extends JPanel {
    
    private BufferedImage image, image2;
    private Font font;
    
    public Scene()
    {
        super();
        
        try {
            URL url = this.getClass().getResource("/images/panda-1.png");
            this.image = ImageIO.read(url);
            url = this.getClass().getResource("/images/panda-2.png");
            this.image2 = ImageIO.read(url);
            url = this.getClass().getResource("/fonts/CantoraOne-Regular.ttf");
            this.font = Font.createFont(Font.TRUETYPE_FONT, url.openStream());
            this.font = this.font.deriveFont(Font.PLAIN, 36.0f);
        }
        catch(IOException | FontFormatException e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setColor(new Color(209, 238, 245));
        g.fillRect(0, 0, 640, 480);
        
        g.drawImage(this.image, 50, 100, null);
        g.drawImage(this.image2, 240, 140, null);
        
        g.setColor(Color.BLACK);
        g.setFont(this.font);
        g.drawString("Salut les pandas !!!", 250, 340);
    }
}
