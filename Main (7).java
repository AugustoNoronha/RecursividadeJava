
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dividendo = sc.nextInt();
    int divisor = sc.nextInt();
    int resto = restoDivisao(dividendo, divisor);
    System.out.println(resto);
  }

  public static int restoDivisao(int dividendo, int divisor) {
    if (dividendo < divisor) {
      return dividendo;
    } else {
      return restoDivisao(dividendo - divisor, divisor);
    }
  }

}
