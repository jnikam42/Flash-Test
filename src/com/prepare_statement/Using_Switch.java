package com.prepare_statement;

import java.util.Scanner;

public class Using_Switch {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("1.Add record\n2.view record\n3.update record\n4.delete record\n5.exist");
		System.out.println("Select oprion");
		int x=sc.nextInt();
		Switch_set se=new Switch_set();
    switch(x)
    {
    case 1:
    	se.addrecord();
    	break;
    	
    case 2:
    	se.viewrecord();
    	break;
    	
    case 3:
    	se.updaterecord();
    	break;
    	
    case 4:
    	se.deleterecord();
    	break;
    case 5:
    	System.exit(0);
    }
		
	}
	}
}
