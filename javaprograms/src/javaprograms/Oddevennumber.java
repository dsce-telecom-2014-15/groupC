package javaprograms;

import java.util.Scanner;

public class Oddevennumber {

	public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner se = new Scanner(System.in);
	int n = se.nextInt();System.out.println("odd number are");
	for(int i=1;i<=n;i++)
	{int y=i%2;
	if(y==1)// TODO Auto-generated method stub
	{
	System.out.println(i);}}System.out.println("even number are");
	for(int i=1;i<=n;i++)
	{int y=i%2;
	if(y==0)
		
	
	System.out.println(i);
	}
	se.close();
}}
