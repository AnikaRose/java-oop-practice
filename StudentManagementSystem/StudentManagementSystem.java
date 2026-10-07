package StudentManagementSystem;

/**
 *
 * @author anika
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int choice=0;
        while(choice != 5){
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            choice = scanner.nextInt();
            
            if(choice==1){
                System.out.println("Enter Student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Department: ");
                String department = scanner.nextLine();
                System.out.println("Enter Semester: ");
                String semester = scanner.nextLine();
                
                Student student = new Student(id, name, department, semester);
                students.add(student);
                System.out.println("Student added successfully!");
            }
            else if(choice==2){
                System.out.println("---Student List---");
                for(Student student: students){
                    System.out.println("ID: " + student.id);
                    System.out.println("Name: " + student.name);
                    System.out.println("Department: " + student.department);
                    System.out.println("Semester: " + student.semester);
                    System.out.println();
                }
            }
            else if(choice==3){
                System.out.println("Enter ID to search: ");
                int searchId = scanner.nextInt();
                
                boolean found = false;
                for(Student student : students){
                    if(student.id == searchId){
                        System.out.println("Student Found!");
                        System.out.println("ID: " + student.id);
                        System.out.println("Name: " + student.name);
                        System.out.println("Department: " + student.department);
                        System.out.println("Semester: " + student.semester);
                        System.out.println();
                        
                        found = true;
                        
                    }
                }
                
                if (!found){
                    System.out.println("No student found with ID: " + searchId);
                }
            }
            else if(choice==4){
                System.out.print("Enter ID to delete: ");
                int deleteId = scanner.nextInt();
                boolean found = false;

                for(int i=0; i < students.size(); i++){
                    Student student = students.get(i);
                    if( student.id == deleteId){
                        students.remove(i);
                        System.out.println("Student deleted successfully!");
                        found = true;
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("No student found with ID: " + deleteId);
                }
            }
            else if(choice==5){
                System.out.println("Thank you for using Student Management System");
            }
            else{
                System.out.println("Invalid option.");
            }
            
        }
    }
    
}
