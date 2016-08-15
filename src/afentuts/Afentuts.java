package afentuts;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Afentuts {
    
    public static void main(String[] args) {
        
        Scene scene = new Scene();
        scene.setPreferredSize(new Dimension(640, 480));
        
        JFrame frame = new JFrame("Ma première fenêtre");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        frame.setContentPane(scene);
        frame.pack();
    }
    
}
