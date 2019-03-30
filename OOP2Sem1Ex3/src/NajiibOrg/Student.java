package NajiibOrg;
import java.util.Scanner;

	public class Student {
		Scanner s = new Scanner(System.in);
		private String name,regNo;
		private int year;
		private String [] Courses = {"BIT-1201","BIT-1202","BIT-1203","BIT-1204","BIT-1205","BIT-1206","BIT-1207",};
		int num = Courses.length;
		private double sum;
		int [] csemarks = new int[num];
	
		public Student() {
			//this is a default constructor
			System.out.println("Enter Student Name: ");
			this.name = s.nextLine(); 
			System.out.println("Enter Student Registration ID: ");
			this.regNo =s.nextLine();
			System.out.println("Enter Student Year Of Birth: ");
			while(true) {
				int yr = s.nextInt();
				if(yr>1980 && yr<2005) {
					this.year = yr;
					break;
				}else
					System.out.println("Year Not Applicable");
			}
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRegNo() {
			return regNo;
		}
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		 public void setCsemarks(){
		        for(int i=0;i<num;i++){
		            System.out.print("Enter "+name+"'s marks in "+Courses[i]+": ");
		            int marks=s.nextInt();
		            if(marks>=0 && marks<=100){
		                csemarks[i]=marks;
		                sum+=csemarks[i];
		            }else{
		                System.out.println("An Error on the marks, below or above the RANGE. (between 0 and 100)");
		                i--;
		            }
		        }
		    }
		public double getAverage() {
			double avg = Math.round(sum/num);
			return avg;
		}
		public void resultsPrint() {
			System.out.println("\nCourses\t\tMarks");
			for(int i=0;i<num;i++) {
				System.out.println(Courses[i]+"\t"+csemarks[i]);
			}
			System.out.println("The average marks for "+name+" = "+ getAverage());
		}
	}
