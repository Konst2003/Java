import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame
{
    public Picture(String title)
    {
        super(title);
    }
    public static void main(String[] args)
    {
        JPanel[] pnl = new JPanel[2];
        String cwd = System.getProperty("C:/Users/Сергей/Pictures/сеновал.jpg");
        Picture frame = new Picture("Показываем картинку");
        frame.setLayout(new GridLayout(3,4));
        ImageIcon icon = new ImageIcon("C:\\Users\\Сергей\\Pictures\\сеновал.jpg");
        pnl[0] = new JPanel();
        pnl[0].add(new JLabel(icon), BorderLayout.SOUTH);
        pnl[1] = new JPanel();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Сергей\\Pictures\\JY57.gif");
       // imageIcon.setImageObserver(pnl[1]);
        pnl[1].add(new JLabel(imageIcon), BorderLayout.CENTER);
        frame.add(pnl[0]);
        frame.add(pnl[1]);
        frame.setSize(3000, 3000);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
