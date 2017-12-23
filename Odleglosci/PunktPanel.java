import javax.swing.*;

class PunktPanel extends JPanel
{
  private JLabel text;
  private JTextField fieldX;
  private JTextField fieldY;

  public PunktPanel()
  {
    super(new FlowLayout(),false);
    text = new JLabel("PUNKT : ");
    fieldY = new JTextField(20);
    fieldX = new JTextField(20);
    addAll();
  }

  public String getX()
  {
    return fieldX.getText();
  }

  private void addAll()
  {
    add(text);
    add(fieldX);
    add(fieldY);
  }
}
