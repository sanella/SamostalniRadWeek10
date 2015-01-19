package com.phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Sanela Grcic
 *
 */

public class PhoneBook {

	private static HashMap<String, Person> phoneBook;
	private static Set<String> contacts;

	/**
	 * Konstruktor
	 */
	public PhoneBook() {
		phoneBook = new HashMap<String, Person>();
		contacts = phoneBook.keySet();
	}

	/**
	 * f-ja za dodavanje kontakata u phonebook
	 * 
	 * @param name
	 *            - ime kontakta - key
	 * @param number
	 *            - broj kontakta
	 */
	public void addContact(String name, int number) {

		phoneBook.put(name, new Person(name, number));
	}

	/**
	 * F-ja za dodavanje brojeva za kontakte koji vec postoje
	 * 
	 * @param name
	 *            - key
	 * @param num
	 *            - broj telefona
	 */
	public void addNumber(String name, int num) {

		phoneBook.get(name).addNumber(num);
	}

	/**
	 * brise postojeci kontakt iz phonebooka
	 * 
	 * @param name
	 *            - key
	 */
	public void removeContact(String name) {

		phoneBook.remove(name);
	}

	/**
	 * F-ja brise broj telefona osobe
	 * 
	 * @param name
	 *            - ime osobe - key
	 * @param idx
	 *            -
	 */
	public void removeNumber(String name, int idx) {

		phoneBook.get(name).removeNumber(idx);
	}

	/**
	 * F-ja za printanje phonebooka
	 */
	public void printPhonebook() {
		Iterator<String> contactsIterator = contacts.iterator();

		while (contactsIterator.hasNext()) {

			String contact = contactsIterator.next();
			Iterator<Integer> numberIterator = phoneBook.get(contact)
					.getNumbers().iterator();
			System.out.println("Name: " + contact);

			while (numberIterator.hasNext()) {
				System.out.print("\tPhone number: " + numberIterator.next()
						+ "\n");
			}
			System.out.println();
		}
	}

	/**
	 * Printa jednu osobu iz phpnebooka
	 * 
	 * @param name
	 *            - key, osobe koju cemo printati
	 */
	public void contactInfo(String name) {

		System.out.println(phoneBook.get(name));
	}

	public void listContact() {
		Iterator<String> contactsIterator = contacts.iterator();

		while (contactsIterator.hasNext()) {
			String contact = contactsIterator.next();
			System.out.println("Name: " + contact);

		}
	}

}