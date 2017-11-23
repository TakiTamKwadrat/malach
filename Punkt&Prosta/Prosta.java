public class Prosta
{
  private double A;
  private double B;
  private double C;

  public Prosta()
  {
    A = 1.0;
    B = 1.0;
    C = 0.0;
  }

  public Prosta(double a,double b,double c)
  {
    A = a;
    B = b;
    C = c;
  }

  public double getA()
  {
    return A;
  }

  public double getB()
  {
    return B;
  }

  public double getC()
  {
    return C;
  }

  public void wypisz()
  {
    System.out.print(A + "X");
    System.out.print((B>=0 ? " + " : " - ") + Math.abs(B) + "Y");
    System.out.print((C>=0 ? " + " : " - ") + Math.abs(C) + " = 0\n");
  }

  public double odleglosc(Punkt p)
  {
    return Math.abs(A*p.getX()+B*p.getY()+C)/Math.sqrt(A*A+B*B);
  }

}
