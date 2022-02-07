package javaConceptsPrograms.array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,7,31,65};
		//we can copy by using assignment operator
		int newArray[]=arr;
		//displaying arrays
		System.out.println("arr[] elements = "+Arrays.toString(arr));
		System.out.println("newArray[] elements = "+Arrays.toString(newArray));
	}

}
