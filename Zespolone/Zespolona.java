public class Zespolona
{
    private double a;
    private double b;

    public Zespolona()
    {
      a = 0.0;
      b = 0.0;
    }

    public Zespolona(double _a,double _b)
    {
      a = _a;
      b = _b;
    }

    public void setA(double _a)
    {
      a = _a;
    }

    public void setB(double _b)
    {
      b = _b;
    }

    public double getA()
    {
      return a;
    }

    public double getB()
    {
      return b;
    }

    public void wypisz()
    {
      System.out.println(a + " + " + b + "i");
    }

    public Zespolona dodaj(Zespolona z)
    {
      return new Zespolona(a+z.getA(),b+z.getB());
    }

    public Zespolona pomnoz(double w)
    {
      return new Zespolona(a*w,b*w);
    }

    public Zespolona pomnoz(Zespolona z)
    {
      return new Zespolona(a*z.getA()-b*getB(),b*z.getA()+a*getB());
    }
}
