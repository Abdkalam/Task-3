package org.real;

import java.util.LinkedHashSet;
import java.util.Set;

public class Project1 {
	
	public static void main(String[] args) {
		
	int a=1235;
	int n=a;
	int rem=0, res=1 ,fact=1;
//	while (a>0) {
//	
//	rem=a%10;
//	
//	res=res*10+rem;
//	
//	a=a/10;
//}
//System.out.println(res);
//if (n==res) {
//	
//	
//	System.out.println("palinrom");
//} else {
//	System.out.println("not palinrom");
//
//}

//	for(int i=a; i>0; i=i/10)
//	{
//		rem=i%10;
//		res=res*rem;
//	}

	
	for(int i=1; i<=5; i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
	
	}
}
