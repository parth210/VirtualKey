package virtualKeyRepo;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
        Welcome screen1= new Welcome();
        Menu options = new Menu();


        //initial screen2
        screen1.displayMessage();

        //Greeting message
        options.displayGreetings();
        do {

            //selecting options from interface window
            options.displayAvailableOptions();

            //choosing one option
            int op = options.receivedInput();

            //functions based on choices
            if (op==1){
                sortFiles displayAscending = new sortFiles();
                displayAscending.ascendingOrder();

            }else if(op==2){
                Operations screen2 = new Operations();
                screen2.functioning();
            }else {
                new close().endMessage();
                break;
            }
        }while (true);

    }
}
