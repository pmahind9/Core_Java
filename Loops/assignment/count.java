/*
Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3
*/

import java.util.Scanner;
class Ndigi{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("ENter Number");

int num=sc.nextInt();

int count=1;
int rem;

while(num!=0){

count++;

num/=10;

}

System.out.println("Count is:" +count);
}
}
