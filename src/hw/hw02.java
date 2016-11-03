package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入男(1)女(2)後輸入身高:");
		double v1  = scn.nextInt();
		double type =scn.nextInt();
		System.out.println(TALL(type, v1));
	}
	public static double TALL(double v1,double type){
		Scanner scn = new Scanner(System.in);
		double	C =1;
		if(type==1){
				C = (v1-170)*0.6+62 ;
		}else if(type==2){
				C = (v1-158)*0.5+52;
		}else{
			System.out.println("錯誤");
		}
		return C;
	}
}
