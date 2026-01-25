import java.util.Scanner;
class Natural_number{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		int sum=number*(number+1)/2;
		if(number >0&& number !=0){
			System.out.println("natural number");
			System.out.println(sum);
		}
		else{
			System.out.println("not a natural nuber");
		}
		 
	}
}