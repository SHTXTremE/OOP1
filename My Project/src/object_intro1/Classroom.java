package object_intro1;

public class Classroom {
	
	private int grade;
	private String homeRoomTeacher;
	private String studentList [];
	private int numStudents;
	
	public Classroom(){
		grade=0;
		homeRoomTeacher = "";
		String studentList [] = new String[10];
		numStudents = 0;
	}
	
	public String getStudent(int n){
		return studentList[n-1];
	}
	
	public boolean addStudent(String studentName){
		int i = -1;
		do{
			i++;
			if(studentList[i].equals("")){
				studentList[i] = studentName;
				return true;
			}
			else{
				return false;
			}
		}while(!studentList[i].equals("")&&i<9);
	}
	
	public boolean changeStudent(int n,String studentName){
		if(n>0&&n<=10){
			studentList[n-1] = studentName;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean removeStudent(String studentName){
		boolean a=true;
		for(int i = 0 ; i<10 ; i++){
			if(studentList[i].equals(studentName)){
				studentList[i] = "";
				for(int j=i;j<10;j++)
				{
					studentList[j] = studentList[j+1];
				}
				a=true;
				break;
			}
			else
				a=false;
		}
		return a;
	}
	
//	public boolean removeStudent(int n){
//		
//	}
//	
//	public String toString(){
//		
//	}
	
	public static void main(String [] args){
		Classroom room1 = new Classroom();
		room1.addStudent("Shoot");
		System.out.println(room1.getStudent(1));
	}
}
