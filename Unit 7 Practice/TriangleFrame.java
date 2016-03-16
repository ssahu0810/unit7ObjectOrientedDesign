import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;
    
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.addPoint();
            