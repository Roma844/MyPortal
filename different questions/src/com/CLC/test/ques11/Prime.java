package com.CLC.test.ques11;

public class Prime {
	int num,i,j;
	public Prime(int a) {
		// TODO Auto-generated constructor stub
		num=a;
	}
void check(){
int flag=0;



	for(i=2;i<num;i++){
		if(flag==0){
		if(num%i==0){
			System.out.println("number is not prime");
			flag=1;
			//System.exit(0);
		}
		
		/*else
			System.out.println("number is prime"+num);
		*/
		
		
	}
}
if(flag==0){
	System.out.println("number is prime");
}
}
public static void main(String[] args) {
	Prime p=new Prime(80);
	p.check();
}
}
