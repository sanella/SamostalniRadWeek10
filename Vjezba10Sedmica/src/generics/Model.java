package generics;

public class Model {
	protected String name;
	protected String autor;
	protected int pages;
	protected int numOfChars;
	protected Integer[] text;
	
	
	
	public Integer[] getText() {
		return text;
	}
	public void setText(Integer[] text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getNumOfChars() {
		return numOfChars;
	}
	public void setNumOfChars(int numOfChars) {
		this.numOfChars = numOfChars;
	}
}
