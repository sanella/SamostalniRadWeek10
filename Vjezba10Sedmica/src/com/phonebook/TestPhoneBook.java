package com.phonebook;

/**
 * 
 * @author Sanela Grcic
 *
 */
public class TestPhoneBook {

	public static void main(String[] args) {

		PhoneBook contacts = new PhoneBook(); 

		
		

		System.out.println("Press number 1 to enter Contacts and 0 to exit");
		int choice = TextIO.getInt();
		
		if (choice == 1) {
			
			do {
					System.out.println("Contacts options: \n"
							+ "	1. Add contact:\n"
							+ "	2. Remove contact:\n"
							+ "	3. Add number to existing:\n"
							+ "	4. Contacts list\n"
							+ "	5. Exit\n");
		

					int choice2 = TextIO.getInt();				
					if (choice2 == 1){											
						System.out.println("Enter name: ");
						String name = TextIO.getWord();
						System.out.println("Enter number ");
						int number = TextIO.getlnInt();
						contacts.addContact(name, number);
				
					}
					else if (choice2 == 2){								
						System.out.println("Remove contact: \n\n Select by name:  ");
						contacts.listContact();
						String remove = TextIO.getWord();
						contacts.removeContact(remove);

					}
					else if (choice2 == 3){								
						System.out.println("Select contact by name:\n");
						contacts.listContact();
						String cont = TextIO.getWord();
						contacts.contactInfo(cont);
						System.out.println("Enter new number: ");
						int newNum = TextIO.getInt();
						contacts.addNumber(cont, newNum);
						
					}
					else if (choice2 == 4){								
						System.out.println("Contacts:\n");
						contacts.printPhonebook();
						
					}
					else if (choice2 == 5){								
						System.out.println("Good Bye");
						return;
						
					}
					
			} while (true); 

		}else {
		System.out.println("Bye bye bye, baby, bye, mozda i zvijezde gube sjaj ");
		return;
		}
		
	}//end of main method

}//end of class Test
