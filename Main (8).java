import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String entrada = sc.nextLine();
    while (!entrada.equals("#")) {
      if (palindromo(entrada)) {
        System.out.println("SIM");
      } else {
        System.out.println("NAO");
      }
      entrada = sc.nextLine();
    }
  }

  public static boolean palindromo(String entrada) {
    return palindromo(entrada, 0, entrada.length() - 1);
  }

  public static boolean palindromo(String entrada, int inicio, int fim) {
    if (inicio >= fim) {
      return true;
    }
    if (entrada.charAt(inicio) != entrada.charAt(fim)) {
      return false;
    }
    return palindromo(entrada, inicio + 1, fim - 1);
  }
}
