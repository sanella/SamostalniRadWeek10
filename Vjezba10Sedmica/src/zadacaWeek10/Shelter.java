package zadacaWeek10;

public class Shelter {

	private Node head;
	private Node tail;
	
	//konstruktor
	public Shelter(){
		this.head = head;
		this.tail = tail;
	}
	/**
	 * Metoda za dodavanje zivotinja u queue
	 * @param animal - prima zivotinju 
	 */
	public void enqueue(Animal animal){
	
		Node newNode = new Node(animal);
		if (head == null){
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}
	
	/**
	 * Izbacivanje bilo koje zivotinje iz niza FIFO metod
	 * @return 
	 */
	public Animal dequeueAny(){
		if (head == null)		{
			throw new NullPointerException("The shelter is empty!");
		}
		if (head == tail){
			tail = null;
		}
		Node current = head;
		head = head.next;
		return current.value;
	}
	
	/**
	 * Metoda izbacujue prvog psa koji je usao u sklonoste po metodi FIFO
	 */
	public void dequeueDog()
	{
		String pas = "pas";
		if (head == null){
			throw new NullPointerException("the shelter is empty!");
		}
		if (head == tail)		{
			tail = null;
		}
		if (head.value.getTip().equals(pas)){
			head = head.next;
		}
		
		Node previous = head;
		Node current = head.next;
		while (current.value.getTip()!=pas){
			previous = current;
			current = current.next;
		}
		if (current.value.getTip().equals(pas))		{
			previous.next = current.next;
			current = current.next;

		}
	}

	/**
	 * Metoda izbacujue prvu macu koja je usla u sklonoste po metodi FIFO
	 */
	public void dequeueCat()
	{
		String macka = "macka";
		if (head == null)
		{
			throw new NullPointerException("the shelter is empty!");
		}
		if (head.value.getTip().equals(macka))
		{
			head = head.next;
		}
		Node previous = head;
		Node current = head.next;
		while (current.value.getTip()!=macka)
		{
			previous = current;
			current = current.next;
		}
		if(current.value.getTip().equals(macka))
		{
			previous.next = current.next;
			current.next = null;
		}
}
	/**
	 * metoda za ispis
	 */
	public String toString(){
		Node current = head;
		String str ="";
		while (current != null)
		{
			str += current.value.toString() + "\n";
			current = current.next;
		}
		return str;
	}
	
	private class Node
	{
		private Node next;
		private Animal value;
		
		public Node(Animal value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node(Animal value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}
	
}