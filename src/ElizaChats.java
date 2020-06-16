import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        String inputName = sc.nextLine();
        System.out.println("Nice to meet you, " +inputName + " , How has your day been?");
        String inputResponse = sc.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that " +inputResponse + " ?");
        String inputWhy = sc.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");

        System.out.println("\nHere are your responses: " +inputName + " " +inputResponse + " " +inputWhy);
    }
}
