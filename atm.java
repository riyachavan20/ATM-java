package com.java.atm;

import java.util.*;

public class Atm {

public static void main(String[] args) {

int bal=5000;

basic();

Scanner sc=new Scanner(System.in);

String basicinfo=sc.next();

if (basicinfo.equals("my_bal"))

{

System.out.println(bal);

}

else if (basicinfo.equals("withdraw"))

{

withdraw();

}

else if (basicinfo.equals("deposit"))

{

deposit();

}

}

public static void basic()

{

System.out.println("what do you want to do?");

}

public static void withdraw()

{

int bal=5000;

System.out.println("what money you want to withdraw?");

Scanner sc=new Scanner(System.in);

int wmoney=sc.nextInt();

bal=bal-wmoney;

System.out.println("You have successfully withdrawed your money and your updated balance is:");

System.out.println(bal);
System.out.println("how else can I help you?");
String receipt=sc.next();
if(receipt.equals("receipt"))
{
	System.out.println("Here is your receipt:");
	System.out.println("**SBI bank**");
	System.out.println("your balance was 5000 and after withdrawing money it is:");
	System.out.println(bal);
}

}

public static void deposit()

{

int bal=5000;

System.out.println("what money you want to deposit?");

Scanner sc=new Scanner(System.in);

int dmoney=sc.nextInt();

bal=bal+dmoney;

System.out.println("You have successfully deposited your money and your updated balance is:");

System.out.println(bal);
System.out.println("how else can I help you?");
String receipt=sc.next();
if(receipt.equals("receipt"))
{
	System.out.println("Here is your receipt:");
	System.out.println("your balance was 5000 and after depositing money it is:");
	System.out.println(bal);
}
}
}