package AddressBookProblem;
import java.util.Scanner;

    public class UC1 {
        public static void main(String[] args) {
            AddressBookManagement bookManagement  /*Creating bookManagement Object*/
                    = new AddressBookManagement();

            Data data = new Data();
            data.setUserName("komal");
            data.setAddress("Aurangabad");
            data.setCity("Pune");
            data.setZip("9087");
            data.setState("MH");
            data.setContactNumber("908823230");
            data.setEmail("gharmode@gmail.com");

            //bookManagement.add(data); /*Calling add() record method to*/
            Scanner input = new Scanner(System.in); /*Creating Scanner Object to read input*/
            System.out.printf("Welcome AddressBook" + "\n");
            System.out.printf(data +"This the first UC of Address Book" + "\n");
            //int option = 0; /*Creating option integer variable*/

        }
    }
