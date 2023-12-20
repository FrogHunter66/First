package ru.mirea.lab8.Shapes;
import java.awt.*;
import java.util.*;
import javax.swing.*;
class GUI extends JFrame {
    GUI() {
        super("Shapes");
        setSize(1200,500);
        JPanel jp = new JPanel() {

            @Override
            public void paint(Graphics g) {
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(0,1000);
                    int y = random.nextInt(0,300);
                    int w = random.nextInt(10,500);
                    int h = random.nextInt(10,200);
                    int s = random.nextInt(0,3);
                    switch (s) {
                        case 0:
                            shape line = new line(x,y,x+w,y+h, shape.getrandomColor());
                            g.drawLine(x,y,line.getWidth(),line.getHeight());
                            g.setColor(line.getColor());
                            break;
                        case 1:
                            shape rectangle = new rect(x,y,w,h,shape.getrandomColor());
                            g.drawRect(x,y,w,h);
                            g.setColor(rectangle.getColor());
                            break;
                        case 2:
                            shape oval = new elipse(x,y,w,h,shape.getrandomColor());
                            g.drawOval(x,y,w,h);
                            g.setColor(oval.getColor());
                            break;
                    }
                }
            }
        };
        setLocationRelativeTo(null);
        add(jp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
// Graphics2D g2 = (Graphics2D)g.create(10,10,10,10);