public class Ulamek
{
  private int up;
  private int down;

  private int NWD(int a,int b)
  {
    while(b!=0)
    {
      int c = a%b;
      a = b;
      b = c;
    }
    return a;
  }

  private int NWW(int a,int b)
  {
    return a*b/NWD(a,b);
  }

  public Ulamek()
  {
    up = 1;
    down = 1;
  }

  public Ulamek(int u,int d)
  {
    up = u;
    down = d;
    uprosc();
  }

  public int getUp()
  {
    return up;
  }

  public int getDown()
  {
    return down;
  }

  public void setUp(int u)
  {
    up = u;
  }

  public void setDown(int d)
  {
    down = d;
  }

  public void uprosc() {
    int nwd = NWD(up,down);
    up/=nwd;
    down/=nwd;
  }

  public Ulamek odwroc(){
    return new Ulamek(down,up);
  }

  public Ulamek dodaj(int a)
  {
    return new Ulamek(up+down*a,down);
  }

  public Ulamek dodaj(Ulamek u)
  {
    int nww = NWW(down,u.getDown());
    Ulamek wynik = new Ulamek(1,nww);
    int x = nww/down;
    int x1 = nww/u.getDown();
    wynik.setUp(up * x + u.getUp() * x1);
    wynik.uprosc();
    return wynik;
  }

  public Ulamek pomnoz(int a)
  {
    return new Ulamek(up*a,down);
  }

  public Ulamek pomnoz(Ulamek u)
  {
    return new Ulamek(up*u.getUp(),down*u.getDown());
  }

  public Ulamek podziel(Ulamek u)
  {
    return pomnoz(u.odwroc());
  }

  public Ulamek podziel(int a){
    return new Ulamek(up,down*a);
  }

  public void wypisz()
  {
    int max;
    if(up>down){
      max = up;
    }
    else {
      max = down;
    }
    int len = String.valueOf(max).length();
    System.out.println(up);
    for(int i=0;i<len;i++)
      System.out.print("-");
    System.out.println();
    System.out.println(down);

  }

}
