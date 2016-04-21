import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ControlPanel extends JPanel
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private DrawingPanel canvas1;
    private JPanel colorPanel;
    
    /**
     * ControlPanel Constructor
     *
     * @param canvas the canvas on which stuff is drawn on
     */
    public ControlPanel(DrawingPanel canvas)
    {
        canvas1 = canvas;
        colorPanel = new JPanel();
        //colorPanel.setBackground(canvas.getColor());
        add(colorPanel);
        
        
        button1 = new JButton("Pick Color");
        button2 = new JButton("Add Circle");
        button3 = new JButton("Add Square");

        this.add(button1);
        this.add(button2);
        this.add(button3);
        
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);

    }

    public class ClickListener implements ActionListener
    {
        /**
         * chooses which buttons do what
         *
         * @param mouse clicking event 
         */
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == button1)
            {
                canvas1.pickColor();
                colorPanel.setBackground(canvas1.getColor());
            }
            else if (event.getSource() == button2)
            {
                canvas1.addCircle();
            }
            else if (event.getSource() == button3)
            {
                canvas1.addSquare();
            }
        }
    }
    ClickListener listener = new ClickListener();
}
