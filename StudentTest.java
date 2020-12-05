import javax.swing.JOptionPane;

public class StudentTest {
	public static void main(String[] args) {
		String numberOfStudentsString = JOptionPane.showInputDialog("please enter number of students of the class ");
		int numberOfStudents = Integer.parseInt(numberOfStudentsString);
		
		Student [] classStudent = new Student [numberOfStudents];
		
		for (int i = 0; i < classStudent.length; i++) {
			String studentName = JOptionPane.showInputDialog("please enter student number" +(i+1)+"name:  ");
			String studentEmail = JOptionPane.showInputDialog("please enter student number" +(i+1)+"email:  ");
			String studentPhone = JOptionPane.showInputDialog("please enter student number" +(i+1)+"phone:  ");
			String studentFaculty = JOptionPane.showInputDialog("please enter car number" +(i+1)+"faculty:  ");
			
			Student student = new Student (studentName,studentEmail,studentPhone, studentFaculty);
			
			
			
			String numberOfSubjectsString = JOptionPane.showInputDialog("please enter number of subjects ");
			int numberOfSubjects = Integer.parseInt(numberOfSubjectsString);
			Subject [] subjectGrades = new Subject [numberOfSubjects];
			for (int j = 0; j < subjectGrades.length; j++) {
				String subjectName = JOptionPane.showInputDialog("please enter subject   "+(j+1)+" name");
				String subjectMarkString = JOptionPane.showInputDialog("please enter subject   "+(j+1)+" mark");
				int subjectMark = Integer.parseInt(subjectMarkString);
				Subject sub = new Subject(subjectName,subjectMark);
				subjectGrades [j] = sub;
				
				
			}
			
			student.setSubjectGrades(subjectGrades);
			classStudent[i]= student;
		}
		String result = "";
		String subjectGrageExceed75 ="";
		for (int i = 0; i < classStudent.length; i++) {
			
			result += "student number" +(i+1)+ "name is"+classStudent[i].getName()+"\n";
			result += "student number" +(i+1)+ "email is"+classStudent[i].getEmail()+"\n";
			result += "student number" +(i+1)+ "phone is"+classStudent[i].getPhone()+"\n";
			result += "student number" +(i+1)+ "faculty is"+classStudent[i].getFaculty()+"\n";
			
			
			if (classStudent[i].getSubjectGrades()!=null){
				result += "               student number" +(i+1)+ "subject \n";
				for (int j = 0; j < classStudent[i].getSubjectGrades().length; j++) {
					result += "               student number" + classStudent[i].getSubjectGrades()[j].getName()+ "subject \n"+"           Mark" + classStudent[i].getSubjectGrades()[j].getMark();
					
	if	(classStudent[i].getSubjectGrades()[j].getMark() > 75)	{
		subjectGrageExceed75 += "student"+classStudent[i].getName()+" mark is "+classStudent[i].getSubjectGrades()[j].getMark();
	}
					
				}
			}
			
			result += "\n------------------------------------\n";
			
			
		}
		
		result += "\n _______________________________________\n"+ subjectGrageExceed75 ;
		
		
		JOptionPane.showMessageDialog(null, result);
	}
}
