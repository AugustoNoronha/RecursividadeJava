


import java.util.*;

public class NumberCounting {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCounting();
	}
	
	public static void NuberCounting(int number, int count) {
		
		if(number < 10) {
			System.out.println(count + 1);
		}else{
			int num = number/10;
			count++;
			NuberCounting(num + 1,count);
		}
		
		
		
				
	}
	
	public static void  NumberCounting() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		NuberCounting(number, 0);
	}

}
