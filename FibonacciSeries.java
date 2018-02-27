package com.self.practice;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
Scanner input =new Scanner(System.in);
System.out.println("Enter fibonacci series length till which you want see : ");
int n=Integer.parseInt(input.nextLine());
input.close();
//using long array and calling fibonacciUsingIteration method
/*long[] output=fibonacciUsingIteration(n);
System.out.println(Arrays.toString(output));*/
fiboUsingIteration(n);
	}
public static long[] fibonacciUsingIteration(int i){
		long[] fbSeries=new long[i];
		fbSeries[0]=1;fbSeries[1]=1;
		for(int j=2;j<i;j++){
			fbSeries[j]=fbSeries[j-1]+fbSeries[j-2];
		}
		return fbSeries;
		}
public static void fiboUsingIteration(int i){
	int fib0=1,fib1=1;
	System.out.print(fib0+"," +fib1 );
	for (int j=2;j<=i;j++){
		int fibo=fib0+fib1;
		fib0=fib1;
		fib1=fibo;
		System.out.print("," +fib1 );
	}
}
}