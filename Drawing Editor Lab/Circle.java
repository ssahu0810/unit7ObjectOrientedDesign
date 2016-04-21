import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape
{
    private Ellipse2D.Double circle;     
    
    /**
     * Circle Constructor
     *
     * @param centerPoint center of shape
     * @param radius size of shape
     * @param shapeColor shape color
     */
    public Circle(Point2D.Double centerPoint, double radius, Color shapeColor)
    {
        super(centerPoint, radius, shapeColor);
        this.circle = new Ellipse2D.Double(centerPoint.getX() - radius, centerPoint.getY() - radius, radius*2, radius*2);
    }
    
    /**
     * determines if mouse is or is not inside shape
     *
     * @param point mouse point
     * @return true or false
     */
    public boolean isInside(Point2D.Double point)
    {
        this.circle = new Ellipse2D.Double(super.getCenter().getX() - super.getRadius(),
        super.getCenter().getY()-super.getRadius(),
        2*super.getRadius(),
        2*super.getRadius());
        
        return this.circle.contains(point);    
    }
    
    /**
     * set shape's radius
     *
     * @param r radius dimension
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    /**
     * draws stuff based on object properties and filled or not
     *
     * @param g2 graphics object
     * @param filled filled if the shape should be filled or not
     */
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
    
    /**
     * determines if the mouse point is or is not near the shape border
     *
     * @param point mouse point
     * @return true or false
     */
    public boolean isOnBorder(Point2D.Double point)
    {
        this.circle = new Ellipse2D.Double(super.getCenter().getX() - super.getRadius(),super.getCenter().getY()-super.getRadius(), 2*super.getRadius(),2*super.getRadius());
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(super.getCenter().getX() - super.getRadius(),super.getCenter().getY()-super.getRadius(), 1.85*super.getRadius(),1.85*super.getRadius());
        
        if (this.circle.contains(point) && !circle2.contains(point))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
        