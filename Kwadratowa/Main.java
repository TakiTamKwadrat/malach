class Main
{
  public static void main(String[] args)
  {
    Kwadratowa f = new Kwadratowa(1,-1,-2);
    f.wypisz();
    System.out.println(f.delta());
    f.setPostacIloczynowa();
    f.wypisz();
  }
}
