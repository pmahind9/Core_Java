/*
4.Write a program to print the odd numbers between 1 and 50 using a do-while loop.
*/

class Odd{
public static void main(String[] args){

int num1=1;
int num2=50;

do{
if (num1%2==1)
System.out.println(num1);
num1++;
}while(num1<num2);
}
}
