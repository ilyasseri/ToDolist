import java.util.ArrayList;

public class Tache {
	  public static ArrayList<Tache> theList;

	//declaration des attribus
public String nom;
public String Description;
public String Etat;
public String Historique;
//Création du constructeur
public Tache (String nom ,String Description,String Etat ,String Historique) {
    //Initialisation des variables
	this.nom =nom;
	this.Description = Description;
	this.Etat =Etat;
	this.Historique=Etat;
	
	}
//retourne le nom
public String getnom(){
    return getnom();
} 
//retourne la description
public String getDescription() {
	return getDescription();
}
//retourne l'etat
public String getEtat() {
	return getEtat();
}
//retourne l'historique 
public String getHistorique() {
	return getHistorique();
}
public String setnom() {
	return setnom();
}
public String setHistorique() {
	return setHistorique();
}
public ArrayList<Tache> getTheList() {
	return theList;
}
public void setTheList(ArrayList<Tache> theList) {
	Tache.theList = theList;


}}
