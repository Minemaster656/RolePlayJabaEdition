public class Player {
    double money;
    String name;
    double xp=0;
    boolean doesExists=true;
    int id;
    public Player(String name, int id, double money){
        this.name=name;
        this.money=money;
        this.id=id;
    }
    public void PrintDiscord(){
        System.out.println(this.name+"#"+this.id);
    }
}
