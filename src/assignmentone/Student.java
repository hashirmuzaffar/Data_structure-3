/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentone;

/**
 *
 * @author 22816
 */
public class Student implements Comparable<Student>{
    String name;
    int age;
    int id;
   
    
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

   

    @Override
    public String toString() {
        return "," + name + "," + age + "," + id ;
    }

    @Override
    public int compareTo(Student o) {
       return (this.age-o.age);
    }
   
    
}
