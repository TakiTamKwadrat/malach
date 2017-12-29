import javax.swing.*;
import java.awt.*;

import javax.swing.border.TitledBorder;

public class ObPanel extends JPanel
{
  private JTextField[] fields;
  private int size;
  private Ob Type;

  public ObPanel(Ob Type)
  {
    super(false);
    this.Type = Type;
    setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

    if(Type instanceof Punkt)
    {
      setBorder(new TitledBorder("Punkt"));
      size = 2;
    }
    else if(Type instanceof Prosta)
    {
      setBorder(new TitledBorder("Prosta"));
      size = 3;
    }
    fields = new JTextField[size];
    for(int i=0;i<size;i++)
      fields[i] = new JTextField(20);

    addAll();
  }

  private void addAll()
  {
    for(int i=0;i<size;i++)
      add(fields[i]);
  }

  public Ob getOb()
  {
    for(int i=0;i<size;i++)
    {
      if(fields[i].getText().equals(""))
        return null;
    }
    return Type;
  }

  public double[] getArr()
  {
    double[] arr = new double[size];
    for(int i=0;i<size;i++)
      arr[i] = Double.parseDouble(fields[i].getText());
    return arr;
  }
}
