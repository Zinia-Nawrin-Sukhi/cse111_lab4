public class Scope{
  public int x = 10;
  public int y = 40;
  public void m1(){
int x = 30;
    x = x + 100 + this.y;
System.out.println(x);
System.out.println(y);
    y = y + this.y;
  }
  public void m2(){
int y = 200;
    y = y + this.y;
System.out.println(x);
System.out.println(y);    
    x = this.x + 20 + this.y;
  }
}
