public class Prosta extends Ob
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

  public double odleglosc(Prosta k)
  {
    if(k.getA() == A && k.getB() == B)
      return Math.abs(C-k.getC())/Math.sqrt(A*A+B*B);
    else
      return -1;
  }

  public boolean czyRownolegle(Prosta k)
  {
    return (A*k.getB()-B*k.getA() == 0);
  }

  public boolean czyProstopadle(Prosta k)
  {
    return (A*k.getA() - B*k.getB() == 0);
  }


}
