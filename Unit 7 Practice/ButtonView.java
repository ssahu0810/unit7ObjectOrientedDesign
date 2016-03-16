import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonView
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JButton button2;

    public ButtonView()
    {
        frame = new JFrame();
        panel = new JPanel();

        JLabel label = new JLabel();
        panel.add(label);

        JButton button = new JButton("A");
        panel.add(button);

        JButton button2 = new JButton("B");
        panel.add(button2);

        frame.add(panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonView view = new ButtonView();
    }
}

public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        label.setText("Button " + event.getActionCommand() + " was clicked!");
    }
}
