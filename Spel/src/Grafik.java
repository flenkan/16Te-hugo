import javax.swing.JFrame;
import java.awt.*;

public class Grafik extends JPanel{

    private int WIDTH = 100;
    private int HEIGHT = 100;
    private int d = 50; //diameter
    private int x=0;
    private int y = 0;
    
    private void moveball(){
    
    
    public void paint(Graphics g){ 
           Graphics2D g2d = (Graphics2D)g;
           g2d.fillOval(x, y, d, d);
         
         }
         
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       Grafik grafik = new Grafik();
       
        frame.setSize(700, 800); //x,y
        frame.setLocation(300,300);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("spel");
        frame.setResizable(false);
        frame.setVisible(true);

    }
    
    private int
   
}
