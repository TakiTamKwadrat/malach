public class Main
{
  public static void main(String[] args)
  {
    Ulamek u = new Ulamek(10,5);
    Ulamek w = new Ulamek(7,13);
    w.wypisz();
    System.out.println();
    u.wypisz();
    System.out.println();
    u = u.pomnoz(7);
    u.wypisz();
    System.out.println();
    u = u.podziel(w);
    u = u.dodaj(w);
    u.wypisz();
  }
}
