import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    /**
     * DrawingEditor Constructor
     *
     */
    public DrawingEditor()
    {
        this.setTitle("Drawing Editor");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        
        
    
    }
    
    /**
     * Method main
     * does everythng
     * 
     * @param args lol idk what this does
     */
    public static void main(String[] args)
    {
        JFrame frame = new DrawingEditor();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}