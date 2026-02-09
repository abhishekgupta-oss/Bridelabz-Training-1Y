class FizzBuzz{
	public static void main(String args[]){
		int number=20;
		if(number<0){
			System.out.print("invalid");
			return;
		}
		int result[]=new int[number];
		for(int i=0; i<number; i++){
			if(i%3==0 && i%5==0){
			System.out.println("FizzBuzz");
			}
			else if (i%5==0){
				System.out.println("Buzz");
			}
			else if (i%3==0){
				System.out.println("Fizz");
			}
			else{
				System.out.println(i);
			}
		}
	}
}