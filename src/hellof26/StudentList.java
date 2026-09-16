/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellof26;

/**
 * I am doing changes after first commit
 * @author pannu
 */
public class StudentList{
    public static void main(String[] args){
        Student[] studentList = new Student[3];
        
        Student s1 = new Student("1","Ronak");
        studentList[0]=s1;
        studentList[1]=new Student("2","Alice");
        studentList[2]=new Student("3","Bob");
       
        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getsName());
        }
        
        
    }
    
    
}
