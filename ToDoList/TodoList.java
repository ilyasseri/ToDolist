import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TodoList {
    public static void main(String[] args){
        Collection<Tache> mesTaches = new ArrayList<Tache>();
        
        //Je créé les taches individuellement
        Tache reveille = new Tache("reveille", "Dure", "terminé","plein d'alarme pour le reveille");
        Tache  douche= new Tache("douche", "ça fait du bien", "en cours","fait");
        Tache dejeuner = new Tache("Dej", "Delicieux", "dans 30min","pas encore pret");
        Tache Travail = new Tache("Boulot","à l'aise","tas de choses a faire","pas encore");

        //Je l'ai mets dans le tableau
        mesTaches.add(reveille);
        mesTaches.add(douche);
        mesTaches.add(dejeuner);
        mesTaches.add(Travail);
        
        //J'ajoute les taches dans Tache
        Iterator<Tache> it = mesTaches.iterator();
        
        //Je boucle tant que j'ai element
        while(it.hasNext()){
            Tache myElement = it.next();
            mesTaches.add(myElement);
        
            //J'affiche mes taches
     myElement.getTheList();
        }
        
    }

}
