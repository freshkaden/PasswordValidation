import java.util.Scanner;

public class main{
    public static boolean checkPassword (String pw){
        //System.out.println("\n Passowrd Checker: \n 1. Must be 8-16 chars \n 2. Must have three out of four categories satisfied: \n - lower case \n - upper case \n - numbers \n - special symbols ~!@$%^&*()-+=_ \n Enter password to check: ");


        // checks for requirement of 8-16 characters
        if (pw.length() < 8 || pw.length() > 16) {
            return false;

        }

        // keeps track of how many categories are met, since 3 is the requirement
        int count = 0;

        // checks for lower case characters in password after converted to character array
        for (char c : pw.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count = count + 1;
                break;
            }
        }

        // if category is met, the count is incremented

        
        // checks for upper case characters in password after converted to character array
        for (char c : pw.toCharArray()) {
            if (Character.isUpperCase(c)){
                count = count + 1;
                break;
            }
        }

        // checks for at least one number/digit in password
        for (char c : pw.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count + 1;
                break;
            }
        }

        // last category, certain special characters
        String symbols = "!@#$%^&*()-+=";


        // checks if the characters of passowrds match any of the characters in the string of symbols
        for (char c : pw.toCharArray()) {
            if (symbols.contains(String.valueOf(c))){
                count = count + 1;
                break;
            }
        }





        // if there are 3 catergories met, then the password is acceptable
        if (count >= 3){
            return true;
        }

        else {
            return false;
        }




    }

    public static void main(String[] args){
        System.out.println("\n Passowrd Checker: \n 1. Must be 8-16 chars \n 2. Must have three out of four categories satisfied: \n - lower case \n - upper case \n - numbers \n - special symbols ~!@$%^&*()-+=_ \n Enter password to check: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine(); 

        if (checkPassword(password)){
            System.out.println("Your password meets the requirements.");
        }
        else {
            System.out.println("Invalid password. Check requirements.");
        }
    }
}