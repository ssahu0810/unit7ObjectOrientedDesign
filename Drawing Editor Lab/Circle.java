import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape
{
    private Ellipse2D circle;
    
    public Circle(Point2D.Double centerPoint, int radius, Color shapeColor)
    {
        super(radius, centerPoint, circle);
        this.circle = new Ellipse2D(centerPoint.getX() - radius, centerPoint.getY() - radius, radius*2, radius*2);
    }
    
    public boolean isInside()
    {
        
    