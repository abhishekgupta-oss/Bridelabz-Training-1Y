import java.util.Scanner;
class student{public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter Student:");
int student = sc.nextInt();
System.out.println("enter pen:");
int pen = sc.nextInt();
int rem=pen%student;
int que=pen/student;
System.out.println("remainder");
System.out.println(rem);
System.out.println("questant");
System.out.println(que);


}
}