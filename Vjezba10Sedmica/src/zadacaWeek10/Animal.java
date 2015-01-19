package zadacaWeek10;

public class Animal {
	
	//atributi
	private String type;
	private String name;
	
	//konstruktor koji prima samo tip
	public Animal(String tip){
		this.type = tip;
		this.name = "NN";
	}
	
	//konstruktor koji prima tip i ime
	public Animal(String tip, String ime){
		this.type = tip;
		this.name = ime;
	}
	
	//geteri i seteri
	public String getTip() {
		return type;
	}
	/**
	 * 
	 * @param tip - unesi tip, tip moze biti macka ili pas, ako nije baci Exception
	 */
	public void setTip(String tip) {
		if (tip!="pas" || tip!="macka"){
			throw new IllegalArgumentException("Buy cat or a dog!!");
		}
		this.type = tip;
	}

	public String getIme() {
		return name;
	}

	public void setIme(String ime) {
		this.name = ime;
	}
	
	/**
	 * Metoda za ispis - toString
	 */
	public String toString(){
		return type + " " + name;
	}
}
