import java.util.List;

public class Secteur {

    private TypeAnimal typeAnimauxDansSecteur;

    private List<Animal> animauxDansSecteur;

    //********************************************************************************
    // *            MES GETTERS ET SETTERS                                           *
    //********************************************************************************

    public TypeAnimal getTypeAnimauxDansSecteur() {
        return typeAnimauxDansSecteur;
    }

    public void setTypeAnimauxDansSecteur(TypeAnimal typeAnimauxDansSecteur) {
        this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
    }

    public List<Animal> getAnimauxDansSecteur() {
        return animauxDansSecteur;
    }

    public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
        this.animauxDansSecteur = animauxDansSecteur;
    }

    //********************************************************************************
    // *            Fin GETTERS ET SETTERS                                           *
    //********************************************************************************

    public void ajouterAnimal(Animal animal){

    }
    public int getNombreAnimaux(){

        return  0;
    }
    public Enum obtenirType(){

        return typeAnimauxDansSecteur;
    }
}
