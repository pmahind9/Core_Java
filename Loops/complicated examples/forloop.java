/*
write a java program to input first and last number and
*/

 import java.util.Scanner;
class Forloop{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("ENter your firsr & Last number");
int first=sc.nextInt();
int last=sc.nextInt();

for(int i=first;i<=last;i++){
if(i%2==0){
System.out.println(i);
}
}
}}
