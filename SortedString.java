package exercise.test3;

import java.util.Scanner;

public class SortedString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name[]=new String[5];
		
		System.out.println("Enter "+name.length + " names");
		for(int i=0;i<name.length;i++) {
			name[i]=scanner.next();
		}
			
		for(int i=0;i<name.length;i++)			
			{
			for(int j=i+1;j<name.length;j++){
				if(name[i].compareTo(name[j])>0)	
				{
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		
		for(int i=0;i<name.length;i++)
		{  	
			System.out.println(name[i]); //Result of sorting String Array
		}
		
	scanner.close();	
	}
	}

