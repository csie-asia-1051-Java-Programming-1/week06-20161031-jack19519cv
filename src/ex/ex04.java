package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		int arr = scn.nextInt();
		
		square(arr);
		}
    public static void square(int arr) {
    	Scanner scn = new Scanner(System.in);
    	
    	int data[]=new int[arr];
    	
    	int sum=0;
    	for(int j=0;j<arr;j++){
    		
    		data[j]=scn.nextInt();
    		
    		
    	}
    	for(int i=0;i<arr;i++){
			
			data[i]=data[i]*data[i];
			System.out.print(data[i]+" ");
			
			
    	}
			
		}
    	}
    
	
   
    
