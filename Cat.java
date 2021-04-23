public class Cat{ 
public String color="White"; 
public String action="Jumping";

public Cat(){
}
public Cat(String c){
 color=c; 
}
public Cat(String c,String a){
  color=c;
  action=a;
}
public void printCat(){
System.out.println( color+"is"+action);
}
public void changeColor(String v){
  color=v;
}

}












