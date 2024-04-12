package task11;

import java.util.Scanner;

public class PasswordValidation {
    String password;
    String confirm_Password;

    public void passwordValidation() throws Exception{
        if(password==confirm_Password){
            System.out.println("Login successful");
        }
        else 
        throw new Exception("Password is incorrect");
    }

    public static void main(String[] args) throws Exception{
        PasswordValidation obj=new PasswordValidation();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the password");
        obj.password=scanner.nextLine();

        System.out.println("Re-Enter the password");
        obj.confirm_Password=scanner.nextLine();

        try {
            obj.passwordValidation();
        } catch (Exception e) {
            System.out.println(e);
        }
scanner.close();
    }
}
