public class Player{
private String name = "Default";
private int number = 0;  
private String team = "Default"; 
public String Name;
public String Team;
public int Number; 
public Player(){
}

public String setName(){
  return Name;
}


public String setTeam(){
  return Team;
}

public int setNumber(){
  return Number;
}
public Player(String v){
 v=Name; 
}
public Player(String q,int r){
 q=Name;
 r=Number;
}
public Player(String s,int t,String x){
 s=Name;
 t=Number;
 x=Team;
}



public void detail(){
 System.out.println(Name+"*is*no"+Number+"*for*"+Team); 
}
}
