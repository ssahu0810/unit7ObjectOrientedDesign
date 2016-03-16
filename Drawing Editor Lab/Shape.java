import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{
    private Point2D.Double centerPoint;
    private int radius;
    private Color shapeColor;
    
    private Shape(Point2D.Double centerPoint, int radius, Color shapeColor)
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
    
    public int getRadius()
    {
        return this.radius;
    }
    
    public Color getColor()
    {
        return this.shapeColor;
    }
    
    abstract boolean isInsideBorder(Point2D.Double point);
    
    abstract void draw(Graphics2D g2);
}