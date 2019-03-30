package NajiibOrg;
import java.util.Scanner;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = 1;
		Student [] studentsList = new Student[m];
		int i = 0;
		while(true) {
			if(i>=m) 
			break;
			studentsList[i] = new Student();
			studentsList[i].setCsemarks();
			i++;
		}
		System.out.println();
		System.out.println("Following Student(s) is/are Registered");
		for(int num=0;num<m;num++){
            System.out.println((num+1)+": "+studentsList[num].getName());
        }
		  while(true){
	            System.out.println("Enter a number from 1 to "+m+" to view the corresponding student's results information or type '0' to stop the program.");
	            int number = s.nextInt();
	            if(number>0 && number<=m) {
	                int index = number-1; //because the list counts from 0.
	                studentsList[index].resultsPrint();
	                studentsList[index].resultsPrint();
	            
	            }else 
	            	if(number==0) {
		                break;
	            }
		  }
	}
}
