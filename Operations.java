package virtualKeyRepo;

import java.io.IOException;


public class Operations {
	 OperationMenu operations =new OperationMenu();
	    private int choice;
	    void functioning() throws IOException {
	        do {

	            //selecting options from operations window
	            operations.displayAvailableOperations();

	            //choosing one option
	            choice = operations.receivedInputOperations();

	            //functions based on choices

	            if (choice==1){
	                AddFile addfile=new AddFile();
	                addfile.Addfile();

	            }else if(choice==2) {
	                Delete deleteFiles = new Delete();
	                deleteFiles.deletefile();

	            }else if(choice==3){
	                Search searchFile =new Search();
	                searchFile.searchfile();

	            }else {
	                System.out.println("\nIn main window\n");
	                break;
	            }

	        }while (true);

	    }
}
