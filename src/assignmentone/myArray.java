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
public class myArray<Student extends Comparable<Student>> {
    public Student[] arr;
    int currentIndex;
    
    
    public myArray() {
        this.arr = (Student[])new Comparable[5];
        currentIndex=0;
    }
    
    
    public myArray(int size) {
        this.arr = (Student[])new Comparable[size];
        currentIndex=0;
    }

    

    @Override
    public String toString() {
      String str=" ";
      for(int i=0;i<=currentIndex;i++){
      str+="      "+arr[i];
      }
      return str;
    }
    
    public void InsertInOrder(Student stu){
      if(currentIndex==arr.length-1){
    Student arr1[]= (Student[])new Comparable[arr.length*2];
       for(int i=0; i<currentIndex+1; i++){
        arr1[i]=arr[i];}
        arr=arr1;
        arr[currentIndex]=stu;currentIndex++;  
      }
        
      if(currentIndex==0){arr[currentIndex]=stu;currentIndex++;}
        
   
        
   else
     {int temp=0;
        for(int i=0; i<=currentIndex; i++){
            if(stu.compareTo(arr[i])>0 && arr[i]!=null){
            temp++;}
            else{break;}
            }
            for(int j=currentIndex;j>temp;j--){
            arr[j]=arr[j-1];
            }arr[temp]=stu;currentIndex++;
        }
    }
     //else{arr[currentIndex]=stu;currentIndex++;  }
        
 }

   

