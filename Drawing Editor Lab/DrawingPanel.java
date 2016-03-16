import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import javax.swing.JDialog;
import javax.swing.JColorChooser;

public class DrawingPanel extends JPanel
{
    private Shape thing ;
    private ArrayList<Shape> shapes;
    private JColorChooser colorChooser;
    private JDialog title;
    private Color currentColor;
    
    public DrawingPanel()
    {
        shapes = new ArrayList<Shape>();
        addMouseListener(new ClickListener());
        addMouseMotionListener(new MotionListener());
        setBackground(Color.WHITE);
        this.colorChooser = new JColorChooser();
        this.title = JColorChooser.createDialog(new JFrame(), "Drawing Editor", true, this.colorChooser, new okListener(), new cancelListener());
        
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;         
    }
        
    
        
    public Color getColor()
    {
        return this.currentColor;
    }
    
    //public Shape getPreferredSize()
    //{
    //}
    
    public void addCircle()
    {
    }
    
    public void addSquare()
    {
    }
    
    //public void paintComponent(Graphics g)
    //{
    //}
    
    //public void mouseClicked(MouseEvent event)
    //{
    //    Point2D.Double clickPosition = new Point2D.Double(event.getX(),event.getY());
    //}
    
    public class ClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
        }
        
        public void mouseReleased(MouseEvent event)
        {
        }
        
        public void mousePressed(MouseEvent event)
        {
            
        }
        
        public void mouseEntered(MouseEvent event)
        {
        }
        
        public void mouseExited(MouseEvent event)
        {
        }
        
    }
    
    public class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
        }
        
        public void mouseMoved(MouseEvent event)
        {
        }
    }
    
    
    public class okListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            currentColor = colorChooser.getColor();
        }
    
    }
    
    public class cancelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            title.setVisible(false);
        }
    
    }
    
    public void pickColor()
    {
        title.setVisible(true);
    }
    
    
    
}
