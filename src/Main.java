public class Main {
    public static void main(String[] args) {
        Livres l1=new Livres(5201,"水浒传","施耐庵",88.88);
        Livres l2=new Livres(5202,"三国演义","罗贯中",99.99);
        Livres l3=new Livres(5203,"红楼梦", "曹雪芹", 77.77);
        Livres l4=new Livres(5204, "西游记", "吴承恩", 66.66);
        l1.Afficher();
        l2.reduirePrix(58);
        l3.reduirePrixProc(50);
        l1.Afficher();
        l2.Afficher();
        l3.Afficher();
        l4.Afficher();
    }
}