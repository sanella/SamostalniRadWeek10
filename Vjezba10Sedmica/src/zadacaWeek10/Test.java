/**
 * 4) Skloniste za pse I macke radi isklucivo na "prvi dosao, prvi usvojen" principu. Osoba koja zeli da usvoju 

zivotinju ima pravo da bira koji vrstu zivotinje hoce (psa ili macku) u tom slucaju ce dobiti zivotinju tog 

tipa koja je prva dosla u skloniste. Ako osoba koja usvaja zivotinju ne navede koji vrstu zivotinje koju 

hoce da usvoju dobice zivotinju koja je najduze u sklonistu. Napisite strukturu podataka koja ce pomoci 

pri odrzavanju ovog sistema, potrebno je da implementirate metode: enqueue, dequeueAny, 

dequeueCat, dequeueDog.
 */

package zadacaWeek10;

public class Test {

	public static void main(String[] args) {
		Shelter skloniste = new Shelter();
		Animal a1 = new Animal("pas", "Pujdo");
		Animal a2 = new Animal("macka", "Frki");
		Animal a3 = new Animal("pas", "Brundu");
		Animal a4 = new Animal("macka", "Cicko");
		Animal a5 = new Animal("pas");
		skloniste.enqueue(a1);
		skloniste.enqueue(a2);
		skloniste.enqueue(a3);
		skloniste.enqueue(a4);
		skloniste.enqueue(a5);
		System.out.println(skloniste.toString());
		skloniste.dequeueCat();
		System.out.println(skloniste.toString());
		skloniste.dequeueDog();
		System.out.println(skloniste.toString());
	}

}