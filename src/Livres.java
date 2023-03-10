public class Livres {
    private int id;
    private String nom;
    private String auteur;
    private double prix;
    public Livres(int id, String nom, String auteur, double prix){
        this.id=id;
        this.nom=nom;
        this.auteur=auteur;
        this.prix=prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void Afficher(){
        System.out.println("id: "+id+"nom: "+nom+"auteur: "+auteur+"prix: "+prix);
    }//询问，这个afficher和String toString方法有什么区别？
    public double reduirePrix(double reduction){
        prix-=prix*reduction/100;
        return prix;
    }
    public void reduirePrixProc(double reduction){
        prix-=prix*reduction/100;
    }
}
