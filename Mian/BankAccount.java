public class BankAccount{
public static void main(String[]args)
{
 
   Bank acc1= new Bank();
    Bank acc2= new Bank();
     Bank acc3= new Bank();
     acc1.setName("x");
     acc1.setAddress("gulshan");
     acc1.setId("10");
     acc1.setBalance(100.0);
     System.out.println("Name:"+acc1.getName()+" || " +"Id:" +acc1.getId()+"|| "+"Address:"+acc1.getAddress()+"|| Balance: "+acc1.getBalance());
     acc2.setName("y");
     acc2.setAddress("banani");
     acc2.setId("11");
     acc2.setBalance(500.0);
     System.out.println("Name:"+acc2.getName()+" || " +"Id:" +acc2.getId()+"|| "+"Address:"+acc2.getAddress()+"|| Balance: "+acc2.getBalance());
     acc3.setName("z");
     acc3.setAddress("mohakhali");
     acc3.setId("13");
     acc3.setBalance(200.0);
     System.out.println("Name:"+acc3.getName()+" || " +"Id:" +acc3.getId()+"|| "+"Address:"+acc3.getAddress()+"|| Balance: "+acc3.getBalance());
     
     
}
}