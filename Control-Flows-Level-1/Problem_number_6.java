import java.util.Scanner;
class Problem_number_6{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		if(number >0 ){
			System.out.println("positive number");
		}
		else if (number < 0){
			System.out.println("negative number");
		}
		else{
			System.out.println("zero number");
		}
	}
}