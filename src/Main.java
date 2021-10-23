import com.animalKingdom.Animal;
import com.animalKingdom.bird.Eagle;
import com.animalKingdom.fish.Eel;
import com.animalKingdom.reptile.Crocodile;

public class Main {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		System.out.println(eagle.ShowInfo());
		
		Eel eel = new Eel();
		System.out.println(eel.ShowInfo());
		
		Crocodile crocodile = new Crocodile();
		System.out.println(crocodile.ShowInfo());
	}

}
