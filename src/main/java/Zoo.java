import java.util.List;

public class Zoo {

    private int visiteurs;

    private List<Secteur> secteursAnimaux;

    private int nbvisiteurMaxParSecteur;

    public Zoo(int visiteurs,int nbrVisisteurMaxParSecteur){

        try {

            this.setVisiteurs(visiteurs);

        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setNbvisiteurMaxParSecteur(nbrVisisteurMaxParSecteur);
    }

    //********************************************************************************
    // *            MES GETTERS ET SETTERS                                           *
    //********************************************************************************

    public int getVisiteurs() {
        return visiteurs;
    }

    public void setVisiteurs(int visiteurs) throws Exception {

        if(visiteurs > this.nbvisiteurMaxParSecteur){
            throw new LimiteVisiteurException("!! Il y a trop de visiteurs merci !!!");
        }

        this.visiteurs = visiteurs;
    }

    public List<Secteur> getSecteursAnimaux() {
        return secteursAnimaux;
    }

    public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
        this.secteursAnimaux = secteursAnimaux;
    }

    public int getNbvisiteurMaxParSecteur() {
        return nbvisiteurMaxParSecteur;
    }

    public void setNbvisiteurMaxParSecteur(int nbvisiteurMaxParSecteur) {
        this.nbvisiteurMaxParSecteur = nbvisiteurMaxParSecteur;
    }

    //********************************************************************************
    // *            FIN GETTERS ET SETTERS                                           *
    //********************************************************************************

    public void ajouterSecteur(TypeAnimal typeAnimal){

    }

    public void nouveauVisiteur(){

    }

    public int getLimiteVisiteur(){

        return  0;
    }

    public void nouvelAnimal(Animal animal){

    }


}
