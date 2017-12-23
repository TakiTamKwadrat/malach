public class Punkt extends Ob
{
  private double X;
  private double Y;

  public Punkt()
  {
      X = 0.0;
      Y = 0.0;
  }

  public Punkt(double x,double y)
  {
    X = x;
    Y = y;
  }

  public double getX()
  {
    return X;
  }

  public double getY()
  {
      return Y;
  }

  public void wypisz()
  {
      System.out.println("("+X+","+Y+")");
  }

  public double odleglosc(Punkt p)
  {
    return Math.sqrt(Math.pow(X-p.getX(),2)+Math.pow(Y-p.getY(),2));
  }
}
