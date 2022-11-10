package AddressBookProblem;

import java.util.Scanner;

public class BookRecordList {
    public static void main(String[] args) {
        AddressBookManagement bookManagement  /*Creating bookManagement Object*/
                = new AddressBookManagement();

        Data data = new Data(); /*Created object (data) here to store Data */
        data.setId(9);
        data.setUserName(" komal ");
        data.setAddress(" Aurangabad ");
        data.setCity(" Pune ");
        data.setZip(" 9087 ");
        data.setState(" MH ");
        data.setContactNumber(" 908823230 ");
        data.setEmail(" gharmode@gmail.com ");

        bookManagement.add(data); /*Calling add() record method to*/
        Scanner input = new Scanner(System.in); /*Creating Scanner Object to read input*/
        System.out.printf(" Welcome AddressBook " + "\n"); /*Display massage*/
        System.out.printf(data + " This the first UC of Address Book " + "\n");

        int option = 0; /*Creating option integer variable*/
        /* Do While Loop*/

        do {
            MyAddressBook(); /* This is Function Name */
            option = input.nextInt(); /*option will take input as integer*/
            switch (option) {
                /* UC1 Edit*/
                case 1:
                    System.out.printf(" what is your ID " +"\n");
                    int id = input.nextInt();

                    System.out.printf(" What is your Name ? " +"\n");
                    String userName = input.nextLine();

                    System.out.printf(" Please Fill the your address "+"\n");
                    String address = input.nextLine();

                    System.out.printf(" Fill your City Name "+"\n");
                    String city = input.nextLine();

                    System.out.printf(" Fill your Zip "+"\n");
                    String zip = input.nextLine();

                    System.out.printf(" Fill your State "+"\n");
                    String state = input.nextLine();

                    System.out.printf(" Fill your Contact Number "+"\n");
                    String contactNumber = input.nextLine();

                    System.out.printf(" Fill your EmailID "+"\n");
                    String email = input.nextLine();

                    data = new Data(id,userName, address, city, zip, state, contactNumber, email);
                    bookManagement.add(data);
                    System.out.printf(data.toString());
                    break;

                case 2:
                    System.out.printf(" Which Id You want to Delete "+"\n");

                    int dId = input.nextInt();

                    bookManagement.delete(dId);

                    break;

                //case3
                case 3:
                    System.out.printf(" Which Id You want to Update "+"\n");
                    int dIdNo = input.nextInt();
                    bookManagement.update(dIdNo, input);

                    break;

                case 4:
                    System.out.printf(" What is the id "+"\n");
                    int searchId = input.nextInt();
                    if (!bookManagement.find(searchId)){
                        System.out.printf(" Student id does not exist "+"\n");;
                    }

                case 5:
                    bookManagement.dispaly();
                    break;

                case 6:
                    System.out.printf(" Thank You "+"\n");
                    System.exit(0);
                    break;
                default:
                    System.out.printf(" Invalid Input "+"\n");
                    break;
            }
        }
        while (option!= 6);
    }

    private static void MyAddressBook() { /*call function*/
        System.out.println("Address Book Menu");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("6: Exit program");
        System.out.print("Enter your selection : ");
    }
}
