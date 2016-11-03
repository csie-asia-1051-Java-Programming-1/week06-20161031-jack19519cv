package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1  = scn.nextInt();
		int type =scn.nextInt();
		System.out.println(fun(v1,type));
	}
	public static double fun(double v1,double type){
		Scanner scn = new Scanner(System.in);
		double	C =1;
		if(type==1){
				C = (v1-32)*5/9;
		}
		if(type==2){
				C = v1*9/5+32;
		}
		if(type!=1 && type!=2){
			System.out.println("¿ù»~");
		}
		return C;
	}
	}