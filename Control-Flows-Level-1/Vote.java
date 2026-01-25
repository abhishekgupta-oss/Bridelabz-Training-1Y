import java.util.Scanner;
class Vote{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter_age: ");
		int enter_age=sc.nextInt();
		if(enter_age >=18){
			System.out.println(" can vote");
		}else{
			System.out.println("not an adult");}
	}
}