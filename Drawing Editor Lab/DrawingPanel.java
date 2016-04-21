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
import java.awt.geom.Point2D;

public class DrawingPanel extends JPanel
{
    private Shape thing ;
    private ArrayList<Shape> shapes;
    private JColorChooser colorChooser;
    private JDialog title;
    private Color currentColor;
    private Dimension size;
    private int active;

    /**
     * DrawingPanel Constructor
     *
     */
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        addMouseListener(new ClickListener());
        addMouseMotionListener(new MotionListener());
        setBackground(Color.WHITE);
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        this.size = new Dimension(400,400);

        this.colorChooser = new JColorChooser();
        this.title = JColorChooser.createDialog(frame, "Drawing Editor", true, this.colorChooser, new OkListener(), new CancelListener());
        setFocusable(true);

    }

    /**
     * takes care of multiple shapes and stuff
     *
     * @param g Graphics object
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if(!(this.shapes.isEmpty()))
        {
            for (int i=shapes.size()-1;i>=0;i--)
            {
                this.shapes.get(i).draw(g2,(active==i));
            }
        }
    }

        
    /**
     * returns color
     *
     * @return color
     */
    public Color getColor()
    {
        return this.currentColor;
    }

    /**
     * Adds a circle onto the canvas
     *
     */
    public void addCircle()
    {
        Circle circle = new Circle(new Point2D.Double(size.getWidth()/2, size.getHeight()/2),50,getColor());
        this.shapes.add(circle);
        this.active = shapes.indexOf(circle);
        repaint();
    }

    /**
     * Adds a square onto the canvas
     *
     */
    public void addSquare()
    {
        Square square = new Square(new Point2D.Double(size.getWidth()/2,size.getHeight()/2),50,getColor());
        this.shapes.add(square);
        this.active = shapes.indexOf(square);
        repaint();
    }

    /**
     * lol idk what this does
     *
     * @return dimension
     */
    public Dimension getPreferredSize()
    {
        return this.size;
    }

    public class ClickListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        /**
         * registers when the mouse presses a shape
         *
         * @param event the clicking event
         */
        public void mousePressed(MouseEvent event)
        {
            requestFocusInWindow();
            Point2D.Double point = new Point2D.Double(event.getX(),event.getY());

            for (int i = shapes.size()-1;i>=0;i--)
            {
                if (shapes.get(i).isInside(point))
                {
                    active = i;
                }
            }
            
            repaint();
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
        /**
         * moves shapes when the mouse is dragged
         *
         * @param event dragging event
         */
        public void mouseDragged(MouseEvent event)
        {
            requestFocusInWindow();
            Point2D.Double point = new Point2D.Double(event.getX(),event.getY());
            shapes.get(active).move(event.getX(),event.getY());
            
            repaint();
        }

        public void mouseMoved(MouseEvent event)
        {
        }
    }

    public class OkListener implements ActionListener
    {
        /**
         * finalises color selection
         *
         * @param event mouse clicking event
         */
        public void actionPerformed(ActionEvent event)
        {
            currentColor = colorChooser.getColor();
        }

    }

    public class CancelListener implements ActionListener
    {
        /**
         * cancels color choosing process
         *
         * @param event mouse clicking event
         */
        public void actionPerformed(ActionEvent event)
        {
            title.setVisible(false);
        }

    }

    /**
     * picks color
     *
     */
    public void pickColor()
    {
        title.setVisible(true);
    }

    
}
