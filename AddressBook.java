import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

//create a method to add a a contact that's passed as para
	public void addContact(Contact c) {
		friends[numfriends] = c;
		numFriends++;
	}
	
