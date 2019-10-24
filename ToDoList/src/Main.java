import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Tache{
public Main(String nom, String Description, String Etat, String Historique) {
		super(nom, Description, Etat, Historique);
		// TODO Auto-generated constructor stub
	}

private static int count;
private static Scanner input;

public static void main(String[] args) {

    input = new Scanner(System.in);

    final int MAX = 10;

    String[] list = new String[MAX];
    int choice = 0;

    while (choice != 3) {

        System.out.println();
        System.out.println("Tapez 1 pour ajouter une nouvelle chose à votre liste de choses à faire.");
        System.out.println("Tapez 2 pour afficher la liste des tâches.");
        System.out.println("Tapez 3 pour quitter le programme.");
        System.out.print("Choisissez une option: ");
        choice = input.nextInt();
        setCount(0);

        if (choice == 1) {
            System.out.println("Continuez à appuyer sur Entrée après, si vous voulez arrêter, tapez 'stop'.");
            for (int i=0;i<MAX;i++) {
                list[i] = input.nextLine();
                if (list[i].equals("stop")) break;
                setCount(getCount() + 1);
            }
        }

        if (choice == 2) {
            for (int index = 0;index < list.length; index++) {
                System.out.println(list[index]);                    
            }               
        }

    }

}

public static int getCount() {
	return count;
}


public static void setCount(int count) {
	Main.count = count;
}
public String setHistorique() {
	return setHistorique();
}
public ArrayList<Tache> getTheList() {
	return theList;
}
public void setTheList(ArrayList<Tache> theList) {
	Main.theList = theList;


}
}