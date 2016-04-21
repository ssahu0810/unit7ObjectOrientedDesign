import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class Square extends Shape
{
    
    private Rectangle2D.Double square;
    
    /**
     * Square Constructor
     *
     * @param center center of shape
     * @param radius size of shape
     * @param shapeColor shape color
     */
    public Square(Point2D.Double center, double radius, Color shapeColor)
    {
        super(center, radius, shapeColor);
        this.square = new Rectangle2D.Double(center.getX() - radius, center.getY() - radius,2*radius,2*radius);
    }
    
    /**
     * determines if mouse is or is not inside shape
     *
     * @param point mouse point
     * @return true or false
     */
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
     * @param filled if the shape should be filled or not
     */
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
    
    /**
     * determines if the mouse point is or is not near the shape border
     *
     * @param point mouse point
     * @return true or false
     */
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
        