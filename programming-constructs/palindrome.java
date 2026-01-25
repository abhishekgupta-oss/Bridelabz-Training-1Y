import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		int temp=number;
		int temp2=0;
		while(temp!=0){
			temp2=temp%10;
			temp=temp/10;
		}
		System.out.println(temp2);
	}
}