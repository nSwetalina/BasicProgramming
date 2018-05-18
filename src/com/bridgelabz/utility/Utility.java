package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc=new Scanner(System.in);
	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static int readInteger() {
		int number= sc.nextInt();
		return number;
	}
	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static String readNext() {
		String n= sc.next();
		return n;
	}
	/*
	 * leapYear method checks the year entered by user is leap year or not
	 */
	public static void leapYear(int year)
	{
		if(year!=0){
			//checks the condition for leap year
			if(year%400==0||(year%4==0 && year%100!=0))
				System.out.println(year+" is a leap year");
			else System.out.println(year+" is not a leap year");
		}
		else 
			System.out.println("enter a valid year ");
	}
	
	/*
	 * gamblerGame method checks the year entered by user is leap year or not
	 */
	public static void gamblerGame()
	{
		int noOfTimes=readInteger();
		System.out.println("Enter the Stake value");
		int mStake=readInteger();
		System.out.println("Enter the Goal value");
		int mGoal=readInteger();
		int mWin=0; int mLoss=0;
		
		for(int i=0;i<noOfTimes;i++)
		{
			//random function generates random number
		if(Math.random()<0.5)
		{
			mLoss++;
			mStake= mStake-1;
		}
		else {
			mWin++;
			mStake=mStake+1;
		}
		if(mStake==mGoal|| mStake==0)
		{
		break;
		}
		
		}
		System.out.println("Number of wins"+ mWin);
		double winPercent=(double)(mWin*100)/noOfTimes;
		System.out.println("Percentage of win"+winPercent);
		double lossPercent=(double)(mLoss*100)/noOfTimes;;
		System.out.println("Percentage of loss"+lossPercent);
		
	}
	/*
	 * twoDArray method checks the year entered by user is leap year or not
	 */
	
	public static void twoDArray() {
		System.out.println("Enter the number of rows");
		int m=readInteger();
		System.out.println("Enter the number of columns");
		int n=readInteger();
		int arr[][]=new int[m][n];
		System.out.println("Enter"+(m*n)+"inputs");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=readInteger();
			}
		}
		System.out.println("The two dimensional array is:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	/*
	 * addsToZero method checks the distinct integer that adds to zero
	 */
	
	public static void addsToZero()
	{
		int n=readInteger();
		int sum=0; int count=0;
		int ar[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=readInteger();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					sum= ar[i]+ar[j]+ar[k];
					if(sum==0) {
						count++;
						System.out.println(ar[i]+","+ar[j]+","+ar[k]);
					}
				}
			}
		}
		System.out.println("Distinct Triplets are: "+count);
	}
	/*
	 * calculateDistance method calculates the distance of co-ordinate from origin(0,0)
	 */
	
	
	public void calculateDistance(int firstInteger, int secondInteger) {
		double euclideanDistance = Math.sqrt((Math.pow(firstInteger,firstInteger)+
											Math.pow(secondInteger,secondInteger)));
		System.out.println("Calculated Euclidean Distance is: "+euclideanDistance);
		
	}
	
	
	
	
	
	
	
	
	
	public static void getCoupon()
	{
		int count=0;
		int couponNumber=readInteger();
		Random rn=new Random();
		rn.nextInt(9);
		
	}
	
}
