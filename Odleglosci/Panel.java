import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel implements ActionListener
{
  JButton button;
  JTextField wynik;
  ObPanel firstPanel;
  ObPanel secondPanel;
  JPanel wynikPanel;

  public Panel(Ob e1, Ob e2)
  {
    super(false);
    //setLayout(new GridLayout(4, 1,10,10));
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

    firstPanel = new ObPanel(e1);
    secondPanel = new ObPanel(e2);

    firstPanel.setPreferredSize(new Dimension(220,100) );
    secondPanel.setPreferredSize(new Dimension(220,100) );

    setWynikPanel();
    addAll();
  }

  private void setWynikPanel()
  {
    wynik = new JTextField();
    wynik.setEditable(false);
    wynik.setPreferredSize(new Dimension(180,30) );
    button = new JButton("");
    button.setPreferredSize(new Dimension(40,30) );
    button.addActionListener(this);

    wynikPanel = new JPanel(false);
    wynikPanel.setLayout(new FlowLayout());
    wynikPanel.setBorder(new TitledBorder("Wynik"));
    wynikPanel.add(button);
    wynikPanel.add(wynik);
  }

  private void addAll()
  {
    add(firstPanel);
    add(secondPanel);
    add(wynikPanel);
  }

  @Override
	public void actionPerformed(ActionEvent e)
  {
    wynik.setText("");
    Ob e1 = firstPanel.getOb();
    Ob e2 = secondPanel.getOb();
    if(e1 == null || e2 == null)
      System.out.println("Brak Wartosci");
    else
    {
      double[] ar1 = firstPanel.getArr();
      double[] ar2 = secondPanel.getArr();
      if(e1 instanceof Prosta && e2 instanceof Punkt)
      {
        Prosta k = new Prosta(ar1[0],ar1[1],ar1[2]);
        Punkt p = new Punkt(ar2[0],ar2[1]);
        wynik.setText(String.valueOf(k.odleglosc(p)));
      }
      else if(e1 instanceof Prosta && e2 instanceof Prosta)
      {
        Prosta k = new Prosta(ar1[0],ar1[1],ar1[2]);
        Prosta l = new Prosta(ar2[0],ar2[1],ar2[2]);
        wynik.setText(String.valueOf(k.odleglosc(l)));
      }
      else if(e1 instanceof Punkt && e2 instanceof Punkt)
      {
        Punkt A = new Punkt(ar1[0],ar1[1]);
        Punkt B = new Punkt(ar2[0],ar2[1]);
        wynik.setText(String.valueOf(A.odleglosc(B)));
      }
    }
	}
}
