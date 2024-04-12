package task11;

import java.util.Scanner;

public class DivisionOfTwoNum {
    int num1, num2, result;

    public void divideTwoNum(){
       result=num1/num2;
       System.out.println("Division of two numbers is "+result);
    }

    public static void main(String[] args) {
        DivisionOfTwoNum obj=new DivisionOfTwoNum();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for num1");
        obj.num1=scan.nextInt();
                
        System.out.println("Enter the value for num2");
        obj.num2=scan.nextInt();
        try {
            obj.divideTwoNum();
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
       
        scan.close();
    }
}
