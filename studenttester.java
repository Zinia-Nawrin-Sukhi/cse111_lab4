public class studenttester //firstly eikhanei Student er S ta boro hater hobe and Tester er t boro hater hobe !! 
// emnei likhleo thikacei , r class name and j name dye save korba duita jaite same hoi !!
{
 public static void main(String[]args)
    {
        Student john=new Student();
        Student mike=new Student();
        Student carel=new Student();
        john.setName("john");
        john.setId("12");
        john.setAdress("gulsan");
        john.setCgpa(4.00);
        System.out.println("Name:"+john.getName()); 
        System.out.println("Id:" +john.getId());
        System.out.println("Adress:"+john.getAdress()); 
        System.out.println("cgpa: "+john.getCgpa());
        
        // john jeivabe print korci oivabei onno gula korba !!
        mike.setName("mike");
        mike.setId("13");
        mike.setAdress("mohakhali");
        mike.setCgpa(2.30);
        
        System.out.println("Name:"+mike.getName()+" || " +"Id:" +mike.getId()+" || "+"Adress:"+mike.getAdress()+"|| cgpa: "+mike.getCgpa());
        carel.setName("carel");
        carel.setId("14");
        carel.setAdress("Mirpur");
        carel.setCgpa(3.50);
        
        System.out.println("Name:"+carel.getName()+"|| " +"Id:" +carel.getId()+"|| "+"Adress:"+carel.getAdress()+"|| cgpa: "+carel.getCgpa());
 }
}
        
        