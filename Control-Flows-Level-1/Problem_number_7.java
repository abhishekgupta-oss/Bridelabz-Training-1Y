import java.util.Scanner;
class Problem_number_7{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter date");
		int date=sc.nextInt();
		
		if (month > 6 && month < 3  ){
			if(date >=20){
				System.out.println("spring season");
			}
		} 
		else{
			System.out.println("not a spring season");
		}
	}
}