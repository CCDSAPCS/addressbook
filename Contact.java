public class Contact {

    private String name; // Stores name of Contact
    private int age;  // Stores age of Contact
    private int phonenumber; // Stores phone number of contact
    private int bday;  // Stores birthday in an int

    // Creates Contact object based on parameters.
    public Contact(String n, int a, int p, int month, int day) {
		name = n;
		age = a;
		phonenumber = p;
		bday = 100*month + day;
    }
