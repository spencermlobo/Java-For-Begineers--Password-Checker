import java.util.Scanner;
public class PasswordChecker {   
  public static void isValid(String password) 
        throws InvalidPasswordException 
   {   
        if (!((password.length() == 8))) 
              { 
            throw new InvalidPasswordException(1); 
        }   
        if (password.contains(" ")) { 
            throw new InvalidPasswordException(2); 
        } 
        if (true) { 
            int count = 0;   
            for (int i = 0; i <= 9; i++) {   
                String str1 = Integer.toString(i);   
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                throw new InvalidPasswordException(3); 
            } 
        }  
        if (!(password.contains("@") || password.contains("#") 
              || password.contains("!") || password.contains("~") 
              || password.contains("$") || password.contains("%") 
              || password.contains("^") || password.contains("&") 
              || password.contains("*") || password.contains("(") 
              || password.contains(")") || password.contains("-") 
              || password.contains("+") || password.contains("/") 
              || password.contains(":") || password.contains(".") 
              || password.contains(", ") || password.contains("<") 
              || password.contains(">") || password.contains("?") 
              || password.contains("|"))) { 
            throw new InvalidPasswordException(4); 
        }             
        if (true) { 
            int count = 0;   
            for (int i = 90; i <= 122; i++) {   
                char c = (char)i; 
                String str1 = Character.toString(c);  
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                throw new InvalidPasswordException(5); 
            } 
        }   
  } 
  public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
                System.out.print("\fEnter Login id: ");
                String login_id = input.nextLine();
        System.out.print("Enter a Password ( Password should be 8 digit containing one digit and one special symbol.):  ");
                String password = input.nextLine();
          try { 
            System.out.println("\nPassword for Login id: " + login_id + " is....");                                                            
            isValid(password); 
            System.out.println("Login Successful."); 
        } 
        catch (InvalidPasswordException e) { 
            System.out.print(e.getMessage()); 
            System.out.println(e.printMessage()); 
        }           
    }
} 