import javafx.scene.layout.GridPane;
import Player.java;

public class BattleShipGame {

    public static void main(final String[] args) {
        Grid g1 = new Grid();
        g1.showGrid();
        String name1 = new String("Alex");
        Player player1 = new Player(name1);
        //Player p1 = Player("Alex");
        //Player p2 = Player("John");
        //Torpedo t1 = Torpedo(1, 2);
        //ArrayList<Player> playerList = new ArrayList<Player>();
        //ArrayList<Ship> shipList = new ArrayList<Ship>();
        //ArrayList<Torpedo> torpedoList = new ArrayList<Torpedo>();
        
        for(int i = 0;i<6;i++){
            Ship s = new Ship();
            player1.addShip(s);
        }

        for(int i = 0;i<30;i++){
            Torpedo t = new Torpedo(i, i);
            player1.addTor(t);
        }


        //p1.addTorpedo(p);
        
        //playerList.add(p1);
        //playerList.add(p2);
        //torpedoList.add(t1);
    }
}