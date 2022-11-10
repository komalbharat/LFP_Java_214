package AddressBookProblem;

//import java.util.BookRecordList;

import java.util.Scanner;
import java.util.LinkedList;/*Linked List is a part of the Collection framework*/

public class AddressBookManagement {
    LinkedList<Data> list;
    public AddressBookManagement()
    {
        list = new LinkedList<>();
    }
    public void  add( Data data){ /*This method Inserts the specified element at the specified position in this list.*/
        if(!find(data.getId())){
            list.add(data);
        }
        else {
            System.out.printf("\"Record already exists in the Record list\"");
        }
    }
    public boolean find(int id) /*use boolean to check condition is true or false*/
    {
        for (Data l:list){
            if (l.getId()==id){ /* id check with id and print*/
                System.out.printf(" This is Username " +l);
                return true;
            }
        }
        return false;
    }
    /* Method Number 3 Delete*/

    public void delete(int DATAid)
    {
        Data dataDel = null;
        for (Data ll:list) {  /*We create empty LinkedList with ll name*/
            if (ll.getId() == DATAid){ /*If recordDel is null, then show error message,*/

                dataDel = ll;
            }
        }
        if (dataDel == null){
            System.out.printf("Invalid Username");
        }
        else {
            list.remove(dataDel);
            System.out.printf("\"Successfully removed record from the AddressBook\"");
        }
    }

    public void update(int dIdNo, Scanner input) {
    }

    public void dispaly() {
    }
}

