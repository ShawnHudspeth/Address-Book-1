package com.AddressBook.TTS;

import java.util.Scanner;

public class Main {

    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private int telephonenumber;
    private String emailaddress;
    public Main(String firstname, String lastname,
                            String street, String city, int telephonenumber, String emailaddress) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.city = city;
        this.telephonenumber = telephonenumber;
        this.emailaddress = emailaddress;
    }
    public Main() {
        // TODO Auto-generated constructor stub
    }
    public String getFirstname() {
        return firstname;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastname() {
        return lastname;
    }



    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public String getStreet() {
        return street;
    }



    public void setStreet(String street) {
        this.street = street;
    }



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public int getTelephonenumber() {
        return telephonenumber;
    }



    public void setTelephonenumber(int telephonenumber) {
        this.telephonenumber = telephonenumber;
    }



    public String getEmailaddress() {
        return emailaddress;
    }



    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String fullName() {
        return this.firstname + " " + this.lastname;
    }

    public String fullAddress() {
        return this.street + " st. " + this.city + " city";
    }

    public void displayAddress(){
        System.out.println("Name               : " + fullName());
        System.out.println("Address            : " + fullAddress());
        System.out.println("Telephone Number   : " + this.telephonenumber);
        System.out.println("Email Address      : " + this.emailaddress + "@gmail.com"+"\n");
    }



    public static void main(String[] args) {
	// write your code here
            System.out.println("1.Add a new contact to your address book.");
            System.out.println("2.Delete a contact from your address book.");
            System.out.println("3.Print out the number of contacts you have.");
            System.out.println("4.Print out information of all of your contacts.");
            System.out.println("5.Quit.");
            System.out.println("Enter your menu choice:");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}

