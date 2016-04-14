import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{
    private Point2D.Double centerPoint;
    public double radius;
    private Color shapeColor;
    
    public Shape(Point2D.Double centerPoint, double radius, Color shapeColor)
    {
        this.centerPoint = centerPoint;
        this.radius = radius;
        this.shapeColor = shapeColor;        
    }
    
    public void move(double x, double y)
    {
        this.centerPoint.setLocation(x,y);
    }
    
    public Point2D.Double getCenter()
    {
        return this.centerPoint;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    public Color getColor()
    {
        return this.shapeColor;
    }
    
    abstract boolean isInside(Point2D.Double point);
    
    abstract boolean isOnBorder(Point2D.Double point);
    
    abstract void draw(Graphics2D g2, boolean filled);
    
}