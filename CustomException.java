package task11;

import java.util.Scanner;

class InvalidAgeException extends Exception{
public InvalidAgeException(String msg){
    super(msg);
}
}

public class CustomException {

    int age;

    public void ageValidation()throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException("The age is below 18 and it is invalid");
        }
        else 
        System.out.println("The age is valid");
    }

    public static void main(String[] args) {
        CustomException obj=new CustomException();
        System.out.println("Enter the age");
        Scanner scan=new Scanner(System.in);
        obj.age=scan.nextInt();
        try{
            obj.ageValidation();
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
         
        scan.close();
    }
}
