import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame
{
  public Ramka()
  {
    super("Odleglosci");
    //setSize(750,512);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel c = new JPanel();
    c.setLayout( new FlowLayout());
    c.add(new Panel(new Punkt(),new Punkt()));
    c.add(new Panel(new Punkt(),new Punkt()));
    c.add(new Panel(new Punkt(),new Punkt()));
    add(c);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
