package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int m = scn.nextInt();
     C(n,m);
     
	}
	public static void C(int n, int m) {
		System.out.println(X(n)/(X(m)*X(n-m)));
		 
		 }
	public static int X(int v){
		 int a =1;
		 for(int i=1;i<=v;i++)
			 a*=i;
		 return a;
	}
	
}
