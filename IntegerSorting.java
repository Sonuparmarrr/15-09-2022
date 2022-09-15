package exercise.test3;

import java.util.Scanner;

public class IntegerSorting {
	public static void main(String[]args) {

	Scanner scanner=new Scanner(System.in);
	int num[]=new int[5];
	
	System.out.println("Enter "+num.length + " numbers"); 
	for(int i=0;i<num.length;i++) {
		num[i]=scanner.nextInt();
	}
	
		
	int flag=0;
	
	for(int i=0;i<num.length;i++)
	{
		
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]>num[j])
			{
				flag=num[i];
				num[i]=num[j];
				num[j]=flag;
		    }
       	}
	System.out.println(num[i]); //Result of sorted array
	}
	scanner.close();
}

}
	