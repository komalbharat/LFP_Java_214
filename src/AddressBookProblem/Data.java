package AddressBookProblem;

public class Data {
    private  int id;
    private String userName; /*Instance variables*/
    private String address;
    private String city;
    private String zip;
    private String state;
    private String contactNumber;
    private String email;

    public Data(){} /*Default Constructor*/

    /*Parameterized Constructor*/
    public Data(int id,String userName, String address, String city,
                String zip, String state,
                String contactNumber, String email)
    {
        this.id =id;
        this.userName = userName; /*this keyword refers to current instance itself*/
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state =state;
        this.contactNumber = contactNumber;
        this.email = email;

    }
    public int getId(){  /* Getting the value of contactNumber */
        /*@return the value of contactNumber */
        return id;
    }
    public void setId(int id){ /*Set the value of contactNumber*/
        this.id =id;
    }
    public String getuserName(){  /* Getting the value of contactNumber */
        /*@return the value of contactNumber */
        return userName;
    }
    public void setUserName(String userName){ /*Set the value of contactNumber*/
        this.userName =userName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String userName){
        this.address =address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city =city;
    }
    public String getZip(){
        return zip;
    }
    public void setZip(String zip){
        this.zip =zip;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state =state;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;

    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email= email;
    }

    @Override public String toString(){
        return "Data{"+"id=" + id + "userName =" + userName +", address=" + address +
                ",city=" + city +"zip=" + zip + ", state =" + state +
                ", contactNumber=" + contactNumber + ", email =" + email +
                '}';}
    /*@ Override denotes that the child class method overrides the base class method*/
}

