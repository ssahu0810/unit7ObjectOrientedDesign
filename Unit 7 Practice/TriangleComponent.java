import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Polygon;

public class TriangleComponent extends JComponent
{
    private static final int[] xPoints= new int[3];
    private static final int[] yPoints=new int[3];
    private Polygon triangle1;
    private int tracker = 0;

    public TriangleComponent()
    {
        triangle1 = new Polygon(xPoints,yPoints,1);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(triangle1);
    }
    
    public Point1Component(Graphics g, int x, int y)
    {
        Rectangle point1 = new Rectangle(x, y, 1, 1);
    }
    
    public Point2Component(Graphics g, int x, int y)
    {
        Rectangle point2 = new Rectangle(x, y, 1, 1);
    }
    
    public Point3Component(Graphics g, int x, int y)
    {
        Rectangle point3 = new Rectangle(x, y, 1, 1);
    }
            
    public void addPoint()
    {
        if (tracker = 1)
        {
            g2.draw(point1);
        }
        else if (tracker = 2)
        {
            g2.draw(point1);
            g2.draw(point2);
        }
        else if (tracker = 3)
        {
            g2.draw(point1);
            g2.draw(point2);
            g2.draw(point3);
        }
            
    }
        

}
