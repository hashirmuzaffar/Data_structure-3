/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author BABAR
 */
public class runner {
    public static void main(String[] args){
    

    myArray<Student> arr = new myArray<Student>();
       

    Student s2 = new Student("warda",12,234);
    Student s3 = new Student("dua",9,234);
    
  
    arr.InsertInOrder(s2);
    arr.InsertInOrder(s3);
  
    System.out.print(arr);

    
    }
    
}
