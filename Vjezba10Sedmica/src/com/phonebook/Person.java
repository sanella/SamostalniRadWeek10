package com.phonebook;

import java.util.LinkedList;

/**
 *  
 * @author Sanela Grcic
 *
 */

public class Person {

	private int maxNumbersPerPerson = 3;
	private String name;
	private LinkedList<Integer> numbers = new LinkedList<Integer>();

	/**
	 * KONSTRUKTOR
	 * 
	 * @param name
	 *            - ime osobe
	 * @param number
	 *            - broj osobe
	 */
	public Person(String name, int number) {
		this.name = name;
		this.numbers.add(number);
	}

	/**
	 * 
	 * @param number
	 *            dodaje broj na Person ukoliko nemamo vec maxNumbersPerPerson =
	 *            3;
	 */
	public void addNumber(int number) {
		if (numbers.size() == maxNumbersPerPerson) {
			throw new IllegalStateException("Max 3 numbers per person");
		}
		this.numbers.add(number);
	}

	/**
	 * @param idx
	 *            - brise broj sa odredjenog indexa
	 */
	public void removeNumber(int idx) {
		if (idx < 0 || idx > maxNumbersPerPerson) {
			throw new IllegalStateException("Invalid index: " + idx
					+ ". Valid choice is: 0, 1 and 2");
		}
		numbers.remove(idx);
	}

	/**
	 * @return lista brojeva koje sadrzi Person
	 */
	public LinkedList<Integer> getNumbers() {
		return numbers;
	}

	@Override
	public String toString() {
		return "Contact: " + name + " Numbers: " + "[" + numbers + "]";
	}

}