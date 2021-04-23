public class Student{
String name;
public static int numberofStudents;
public Student(){
  name="Default name";
}
public Student(String n){
name=n;
}
public String getName(){
  numberofStudents++;
  return name;
}



  
}
