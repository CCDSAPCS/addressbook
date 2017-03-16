| Part 1 |   Build out the address class |
| --------  |  ---------------------------- |
| <ul><li>* [ ] </li></ul> |  From class you should already have a stub of a file with the following structure |
| <ul><li>* [ ] </li></ul> |   import statements |
| <ul><li>* [ ] </li></ul> |  class header  |
| <ul><li>* [ ] </li></ul> |  field declarations for friends and numFriends  |

| Also                     |   To Do: |
| --------  |  ---------------------------- |
| <ul><li>* [ ] </li></ul> | Constructor for AddressBook of 10 friends |
| <ul><li>* [ ] </li></ul> |   Add contact method |
| <ul><li>* [ ] </li></ul> |  printContacts Method  |
| <ul><li>* [ ] </li></ul> |    |

|                      |   Now - the following steps will help you build out the rest of the address class |
| ----  |  ---------------------------- |
| <ul><li>* [ ] 1</li></ul> | create a method numContacts to return number of friends currently in the address book as this is an accessor method, it should return an int |
| <ul><li>* [ ] 2</li></ul> |   create a method haveContact.  It should return a non-negative integer if a contact with name s exists, corresponding to which the place in the array 'friends' in the Contact is stored.  Method shouldaccept a string s and return an integer after searches through the array of friends. HINT:  Use the getName method, otherwise, return -1 |
| <ul><li>* [ ] 3</li></ul> | write a method Delete contact that accepts a string s and finds the contact position in the friends array using the haveContact method.  If the contact is there, haveContact will return the position, otherwise return -1.  swap the last contact in the friends array into the dound position, and shorten numfriends by one.  |
| <ul><li>* [ ] </li></ul> |  create a main method to create a new instance of a scanner, call a menu method that prints out a list of "menu" options, and based on the choice, add contact, delete contact, print num of contact, print all contacts, or quit.  |
| <ul><li>* [ ] </li></ul> |  immediately following the call to menu method, take an int variable as the users choice, thenuse ifs or select case to manage the user choice  |
| <ul><li>* [ ] </li></ul> |  if new contact, prompt for and save: name, age, phone num (watch format), and birthday, (month, and then year)  |
| <ul><li>* [ ] </li></ul> |  menu method can be pub stat void menu and just a series of println formatted niceley.  |
| <ul><li>* [ ] </li></ul> |    |
