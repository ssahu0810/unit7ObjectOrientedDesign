import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{
    private Point2D.Double centerPoint;
    public double radius;
    private Color shapeColor;
    
    /**
     * Constructor for Shape class
     *
     * @param centerPoint origin point of shape
     * @param radius relative size of object
     * @param shapeColor color of shape
     */
    public Shape(Point2D.Double centerPoint, double radius, Color shapeColor)
    {
        this.centerPoint = centerPoint;
        this.radius = radius;
        this.shapeColor = shapeColor;        
    }
    
    
    /**
     * moves shape to a new point
     *
     * @param x new x position
     * @param y new y position
     */
    public void move(double x, double y)
    {
        this.centerPoint.setLocation(x,y);
    }
    
    /**
     * returns center
     *
     * @return center point
     */
    public Point2D.Double getCenter()
    {
        return this.centerPoint;
    }
    
    /**
     * returns radius
     *
     * @return radius
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * sets new shape radius
     *
     * @param r radius 
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    /**
     * returns color
     *
     * @return color of shape
     */
    public Color getColor()
    {
        return this.shapeColor;
    }
    
    /**
     * determines whether shape is or is not inside object
     *
     * @param point mouse point
     * @return true or false
     */
    abstract boolean isInside(Point2D.Double point);
    
    /**
     * determines whether mouse is or is not near the border
     *
     * @param point mouse point
     * @return true or false
     */
    abstract boolean isOnBorder(Point2D.Double point);
    
    /**
     * Method draw
     *
     * @param g2 graphics object
     * @param filled if the object should be filled or not
     */
    abstract void draw(Graphics2D g2, boolean filled);
    
}