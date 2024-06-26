// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    NumberCounting();
  }

  public static int NuberCounting(int number, int soma) {

    if(number == 0) {
      return soma;
    }else {
      soma += number%10;
      return NuberCounting(number/10,soma);
    }




  }

  public static void  NumberCounting() {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(NuberCounting(number, 0));
  }

}