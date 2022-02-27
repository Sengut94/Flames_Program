package org.flames;

import java.util.Scanner;

public class Flames {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name");
	String name1 = s.nextLine();
	String n1=name1.toLowerCase();
	String na1 = n1.replaceAll(" ", "");
	
	System.out.println("Enter your partner name");
	String name2 = s.nextLine();
	String n2 = name2.toLowerCase();
	String na2 = n2.replaceAll(" ", "");
	
	StringBuffer str1 = new StringBuffer(na1);
	StringBuffer str2 = new StringBuffer(na2);
	StringBuffer delStr1 = new StringBuffer();
	StringBuffer delStr2 = new StringBuffer();
	for (int i = 0; i < str1.length(); i++) {
		for (int j = 0; j < str2.length(); j++) {
			if (str1.charAt(i)==str2.charAt(j)) {
				
				delStr1 = str1.deleteCharAt(i);
				delStr2 = str2.deleteCharAt(j);
				break;
			}
		}
	}
	int l1 = delStr1.length();
	int l2 = delStr2.length();
	int tot=l1+l2;
	
		
	if (tot==1) {
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in SISTER!!!");
	} else if(tot==2||tot==4||tot==7||tot==9||tot==20||tot==22||tot==24||tot==25){
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in ENEMY!!!");
	} else if(tot==6||tot==11||tot==15||tot==26){
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in MARRIAGE!!!");
	} else if(tot==8||tot==12||tot==13||tot==17) {
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in AFFECTION!!!");
	} else if(tot==10||tot==19) {
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in LOVE!!!");
	} else{
		System.out.println("The relationship between "+name1 +"\tand\t" +name2 +"\twill end in FRIEND!!!");
	}
}
}