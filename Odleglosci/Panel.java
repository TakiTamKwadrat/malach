import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener
{
  Ob e1;
  Ob e2;
  JButton button;
  JLabel wynik;

  public Panel(Ob e1, Ob e2)
  {
    super(false);
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    this.e1 = e1;
    this.e2 = e2;

    setPunktPanel();
    setProstaPanle();

    wynik = new JLabel();
    button = new JButton("Oblicz");
    button.addActionListener(this);
    add(wynik);
    add(button);
  }

  private void setPunktPanel()
  {
    JLabel tx = new JLabel("PUNKT:");
    JTextField x = new JTextField(5);
    JTextField y = new JTextField(5);

    add(tx);
    add(x);
    add(y);

  }

  private void setProstaPanle()
  {
    JLabel tx = new JLabel("PROSTA:");
    JTextField A = new JTextField(5);
    JTextField B = new JTextField(5);
    JTextField C = new JTextField(5);

    add(tx);
    add(A);
    add(B);
    add(C);
  }

  @Override
	public void actionPerformed(ActionEvent e)
  {
		System.out.print("XD");
	}
}
