package spaceinvaders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painel extends JPanel implements Runnable{
    
    public double x;
    public double y;
    public double ySpeed;
    public double xSpeed;
    public int width;
    public int heigth;
    
    public Painel(){
        x = 400;
        y = 170;
        this.ySpeed = 10;
        this.xSpeed = 10;
        width = 120;
        heigth = 60;
        this.setBackground(Color.black); //image icon swing para colocar imagem
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect((int) x, (int) y, width, heigth);
    }
    
    void update(){
        x += xSpeed;
        y += ySpeed;
        if(x>=(600-width) || x<=0){
            xSpeed *= -1;
        }
        if(y<=0 || y>=(600-heigth)){
            ySpeed *= -1;
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        Painel panel = new Painel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        Thread t = new Thread(panel);
        t.start();
    }

    @Override
    public void run() {
        while(true){
            update();
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
