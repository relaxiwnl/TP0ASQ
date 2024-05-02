public class Jeu {
    private Banque banque;
    private Boolean Status =false;
    public Jeu(Banque banque) {
        this.banque = banque;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if(!this.estOuvert()){
            throw new JeuFermeException();
        }
    }

    public void fermer() {
    this.Status=false;
    }

    public boolean estOuvert() {
        if(Status)
            return true;
        else return false;
    }


}
 class JeuFermeException extends Exception {
}