import java.util.Scanner;
class Assignment{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		System.out.println("enter a+ " +(a+=5));
		System.out.println("enter a- " +(a-=5));
		System.out.println("enter a* " +(a*=5));
		System.out.println("enter a/ " +(a/=5));
		
	}
}
		