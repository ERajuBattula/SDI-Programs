interface Intrfc
{
     int a = 70;
     int b = 30;
     void add();
     void sub();
    
}
public class AddSub implements Intrfc
{
     public void add()
     {
          System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
     }
     public void sub()
     {
          System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
     }

     
     public static void main(String[] args)
     {
          AddSub obj = new AddSub();
          obj.add();
          obj.sub();
     }
}

