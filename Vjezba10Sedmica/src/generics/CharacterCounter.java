package generics;

public class CharacterCounter {

	public static <T> int count(T[] var) {
		int counter = 0;
		for (T k : var) {
			counter++;
		}
		return counter;
	}

	
	
	public static int countWords(String[] array) {
		return 0;

	}

	public static void main(String[] args) {

		Newspaper np =new Newspaper();
		np.setAutor("Sanela");
		np.setName("Lalala");
		np.setPages(556);
		np.setText(new Integer[] {1, 2 , 3, 4, 5, 1 , 6});
		Integer[] sa = np.getText();
		System.out.println(count(sa));
		
		
		Book b = new Book();
		b.setAutor("Vladimir Arsenijevic");
		b.setName("Predator");
		b.setPages(555);
		b.setText(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 });

		
		
		System.out.println(count(b.getText()));

		System.out.println("--------------");

		MachineBook m = new MachineBook();
		m.setAutor("Vladimir Arsenijevic");
		m.setName("Predator");
		m.setPages(555);
		m.setText(new String[] { "1", "24", "13", "4", "5" });
		
		// System.out.println(count(m.getText()));
		System.out.println(count(m.getText()));
		System.out.println("--------------");
		Book[] books = new Book[]{new Book(), new Book(), new Book()};
		System.out.println(count(books));
		System.out.println("--------------");
		GenericClass<Integer> gc = new GenericClass<Integer>();
		gc.add(new Integer[]{12,22,33,44,55,66});
		System.out.println(count(gc.get()));
		
		GenericClass<Character> gv = new GenericClass<Character>();
		Character [] vedad = new Character[] {'V', 'E', 'D', 'A', 'D'};
		gv.add(vedad);
		System.out.println(count(gv.get()));
	}
}
