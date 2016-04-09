import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape
{
    private Ellipse2D.Double circle;     
    
    public Circle(Point2D.Double centerPoint, double radius, Color shapeColor)
    {
        super(centerPoint, radius, shapeColor);
        this.circle = new Ellipse2D.Double(centerPoint.getX() - radius, centerPoint.getY() - radius, radius*2, radius*2);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        this.circle = new Ellipse2D.Double(super.getCenter().getX() - super.getRadius(),super.getCenter().getY()-super.getRadius(), 2*super.getRadius(),2*super.getRadius());
        return this.circle.contains(point);    
    }
    
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        this.circle = new Ellipse2D.Double(super.getCenter().getX()-super.getRadius(),super.getCenter().getY()-super.getRadius(),2*super.getRadius(),2*super.getRadius());
        g2.setColor(super.getColor());
        g2.draw(this.circle);
        
        if (!filled)
        {
            g2.fill(this.circle);
        }
    }
}
        