package myJava;

import java.util.Scanner;

public class TEMP {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature of your water : ");
		
		int temp=sc.nextInt();
		
		if(temp>60) {
			System.out.println("Water is warm");
		}else if(temp<10){
			System.out.println("Water cold");
		}else if(temp<60) {
			System.out.println("water is normal");
		}else if(temp>90) {
			System.out.println("Water is too hot");
		}else if(temp>=100) {
			System.out.println("water is over Hot");
		}
	}

}
