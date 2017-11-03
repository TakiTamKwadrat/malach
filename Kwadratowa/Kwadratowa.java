class Kwadratowa
{
    private enum postac
    {
      ogolna,kanoniczna,iloczynowa
    }

    private double a;
    private double b;
    private double c;
    postac postacFunkcji;

    public Kwadratowa()
    {
        a = 1.0;
        b = 0.0;
        c = 0.0;
        postacFunkcji = postac.ogolna;
    }
    public Kwadratowa(double A,double B,double C)
    {
      a = A;
      b = B;
      c = C;
      postacFunkcji = postac.ogolna;
    }

    public void setPostacOgolna(){
      postacFunkcji = postac.ogolna;
    }
    public void setPostacKanoniczna(){
      postacFunkcji = postac.kanoniczna;
    }
    public void setPostacIloczynowa(){
      postacFunkcji = postac.iloczynowa;
    }


    public double delta()
    {
      return Math.pow(b,2)-4*a*c;
    }

    public double getP()
    {
      return -1*b/(2*a);
    }
    public double getQ()
    {
      return -1*delta()/(4*a);
    }

    public int ilePierwiastkow()
    {
      double d = delta();
      if(d < 0)
        return 0;
      else
        return (d==0 ? 1 : 2);
    }

    private double getX0()
    {
        return getP();
    }
    private double getX1()
    {
      return (-1 * b - Math.sqrt(delta())) / (2*a);
    }
    private double getX2()
    {
      return (-1 * b + Math.sqrt(delta())) / (2*a);
    }

    public void wypisz()
    {
      System.out.print("y = ");
      if(postacFunkcji == postac.ogolna)
      {
        if(a!=0)
        {
          System.out.print(a==1 ? "" : a);
          System.out.print("x^2");
        }
        if(b!=0)
        {
          System.out.print(b==1 ? "" : b>0 ? " + " + b : " - " + Math.abs(b));
          System.out.print("x");
        }
        if(c!=0)
        {
          System.out.print(c > 0 ? " + " + c : " - " + Math.abs(c));
        }
      }
      else if(postacFunkcji == postac.kanoniczna)
      {
        if(a!=0)
        {
          System.out.print(a==1 ? "" : a);
        }
        System.out.print("(x");
        double p = getP();
        System.out.print(p==0 ? "" : p > 0 ? "-" + p : "+" + Math.abs(p));
        System.out.print(")^2");
        double q = getQ();
        System.out.print(q==0 ? "" : q > 0 ? "+" + q : q);

      }
      else if(postacFunkcji == postac.iloczynowa)
      {
        switch (ilePierwiastkow()) {
            case 2 :
              if(a!=0)
              {
                System.out.print(a==1 ? "" : a);
              }
              System.out.print("(x");
              double x1 = getX1();
              System.out.print(x1==0 ? "" : x1 > 0 ? "-" + x1 : "+" + Math.abs(x1));
              System.out.print(")(x");
              double x2 = getX2();
              System.out.print(x2==0 ? "" : x2 > 0 ? "-" + x2 : "+" + Math.abs(x2));
              System.out.print(")");
            break;
            case 1 :
              if(a!=0)
              {
                System.out.print(a==1 ? "" : a);
              }
              System.out.print("(x");
              double x = getX0();
              System.out.print(x==0 ? "" : x > 0 ? "-" + x : "+" + Math.abs(x));
              System.out.print(")^2");
            break;
            case 0 :
              System.out.println("Brak pierwiastkow");
            break;
        }
      }
      System.out.print("\n");
    }
    void wypiszPierwiastki()
    {
      switch(ilePierwiastkow()){
        case 0 :
          System.out.println("Brak pierwiastkow");
        break;
        case 1 :
          System.out.println("Jeden pierwiastek : x0 = " + getX0());
        break;
        case 2 :
          System.out.println("Dwa pierwiastki :");
          System.out.println("x1 = " + getX1());
          System.out.println("x2 = " + getX2());
        break;
      }
    }
}
