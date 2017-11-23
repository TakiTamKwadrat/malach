public class Main
{
    public static void main(String[] args)
    {
      Punkt A = new Punkt();
      Punkt B = new Punkt(3.0,4.0);
      A.wypisz();
      B.wypisz();
      System.out.println(A.odleglosc(B));

      Prosta k = new Prosta(0,1,3);
      k.wypisz();
      System.out.println(k.odleglosc(A));
    }
}
