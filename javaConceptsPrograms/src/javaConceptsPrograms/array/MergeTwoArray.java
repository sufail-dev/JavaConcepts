package javaConceptsPrograms.array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArray[]= {10,45,7,42,49};
		int secondArray[]= {34,51,52,9};
		int thirdArrayLength=firstArray.length+secondArray.length;
		int thirdArray[]=new int[thirdArrayLength];
		//Adding firstArray Elements into thirdArray
		for(int i=0;i<firstArray.length;i++) {
			thirdArray[i]=firstArray[i];
		}
		for(int j=0,i=firstArray.length;i<thirdArrayLength;i++,j++) {
			thirdArray[i]=secondArray[j];
		}
		//print third array
		
		System.out.println("third arra= "+Arrays.toString(thirdArray));
		
	}

}
