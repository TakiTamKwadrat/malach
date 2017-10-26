public class Main
{
  public static void main(String[] args)
  {
    Zespolona z1 = new Zespolona(1,2);
    Zespolona z2 = new Zespolona(1,1);
    z1.wypisz();
    z1 = z1.pomnoz(z2);
    z1.wypisz();
    z2 = z1.dodaj(z2);
    z2.wypisz();

  }
}
