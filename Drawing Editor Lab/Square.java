import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class Square extends Shape
{
    
    private Rectangle2D.Double square;
    
    public Square(Point2D.Double center, double radius, Color shapeColor)
    {
        super(center, radius, shapeColor);
        this.square = new Rectangle2D.Double(center.getX() - radius, center.getY() - radius,2*radius,2*radius);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        this.square = new Rectangle2D.Double(super.getCenter().getX() - super.getRadius(), super.getCenter().getY() - super.getRadius(),2*super.getRadius(),2*super.getRadius());
        if (this.square.contains(point))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    public void draw(Graphics2D g2, boolean filled)
    {
        this.square = new Rectangle2D.Double(super.getCenter().getX()-super.getRadius(), super.getCenter().getY() - super.getRadius(),2*super.getRadius(),2*super.getRadius());
        
        g2.setColor(super.getColor());
        g2.draw(this.square);
        
        if (!filled)
        {
            g2.fill(this.square);
        }
        
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        this.square = new Rectangle2D.Double(super.getCenter().getX() - super.getRadius(), super.getCenter().getY() - super.getRadius(), 2*super.getRadius(), 2*super.getRadius());
        
        Rectangle2D square2 = new Rectangle2D.Double(super.getCenter().getX() - super.getRadius(), super.getCenter().getY() - super.getRadius(), 1.85*super.getRadius(), 1.85*super.getRadius());
        
        if (this.square.contains(point) && !square2.contains(point))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
        