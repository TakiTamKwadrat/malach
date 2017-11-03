import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    int i = in.nextInt();
    double d = in.nextDouble();
    short s = in.nextShort();
    String str = in.next();//<- pobiera pojedyncze slowo
    //String str = in.nextLine(); <- moze pobierac cale zdanie ale potrzebna jest petla

    System.out.println("Int : " + i);
    System.out.println("Double : " + d);
    System.out.println("Short : " + s);
    System.out.println("String : " + str);
    //System.out.println("String : " + str);

    in.close();
  }

}
