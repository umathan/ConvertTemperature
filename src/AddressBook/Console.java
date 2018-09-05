package AddressBook;

import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void println(){
        System.out.println();
    }
    
    public static void print(String s){
        System.out.println(s);
        }
    
    public static String getString(String prompt){
        System.out.println(prompt);
        String s = sc.nextLine();
        return s;
    }
    
    public static String getRequiredString(String prompt){
        String s = "";
        while(true){
            System.out.println(prompt);
            s = sc.nextLine();
            if (s.equals("")){
                System.out.println("Error. Please enter your input");
            }else{
                break;
            }
        }
            return s;
    }
    
    public static String getChoice(String prompt, String s1, String s2){
        String s = "";
        while (true){
            s = getRequiredString(prompt);
            if((!s.equalsIgnoreCase(s1))
                && !s.equalsIgnoreCase(s2)){
            System.out.println("Error. Please enter either " + s1 + " or" + s2);
        }else{
                break;
        }
       }
          return s;
    }
    
    
    public static String getChoice(String prompt, String s1, String s2, String s3){
        String s = "";
        boolean isValid = false;
            while (isValid == false){
                s = getRequiredString(prompt);
                if(!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2) &&
                        !s.equalsIgnoreCase(s3)){
                    System.out.println("Error!. Please enter " +
                    s1 + " or " + s2 + "or " + s3 + " and Try Again." );
                }else
                    isValid = true;
          
            }
            return s;
        }
    public static int getInt(String prompt){
        int i = 0;
        while (true){
            System.out.println(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Error! Invalid integer");
            }
          }
            return i;
        
  }
    
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        while (true) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min);
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max);
            } else {
                break;
            }
        }
        return i;
    }
    
     public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }

    
    
public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        while (true) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min);
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max);
            } else {
                break;
            }
        }
        return d;
    }

}
