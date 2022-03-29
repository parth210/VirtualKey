package virtualKeyRepo;

import java.util.Scanner;

public class Input {
	private Scanner input = new Scanner(System.in);

    int inputForScreen(){
        boolean notint=true ;
        int checkint =0;
        while(notint)
        {
            try
            {
                notint = false;
                System.out.println("Please select one of the option mentioned above-");
                System.out.print("Option : ");
                String s = input.next();
                checkint = Integer.parseInt(s);

            }
            catch(Exception ex)
            {
                notint   = true;
                checkint = 0;

                System.out.println("\n->Alphabet, Special Characters, Words are not allowed.\n");
            }
        }
        return checkint;
    }
}
