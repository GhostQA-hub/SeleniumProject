package com.seleniumproject.com.seleniumproject;

public class GreatestnumberinArray {

	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,3,4,6,8};  
		  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		//System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}}  
