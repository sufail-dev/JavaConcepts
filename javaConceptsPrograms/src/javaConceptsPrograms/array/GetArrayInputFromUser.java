package javaConceptsPrograms.array;

import java.util.Scanner;

public class GetArrayInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		int arr[]=new int[5];
		//adding elements to array
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		//priniting all the array elements
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
				
			}
			
		

	}

}
