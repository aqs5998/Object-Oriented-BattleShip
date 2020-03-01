import java.util.ArrayList;
import Ship.java;
import Torpedo.java;

public class Player{

    public String name;
    public int turnsRemaining;
    public int points;
    public Grid g;
    public Torpedo t = new Torpedo(1,2);
    public ArrayList<Ship> s1 = new ArrayList<Ship>();
    public ArrayList<Torpedo> t1 = new ArrayList<Torpedo>();
    

    Player(String name){
        this.name = name;   
    }

    public void addShip(Ship s){
        if(s1.size() >= 6){
           System.out.println("Already at the limit of ships");
        }
        else  s1.add(s);
    }

    public void addTor(Torpedo t){
        if(t1.size() > 30){
           System.out.println("Already at the limit of Torpedos");
        }
        else  t1.add(t);
    }
    



    public Grid createGrid(){
        if(g != NULL){
            System.out.println("Grid already exists!");
        }
        else return g;
    }

    public void setName(String e){
        this.name = e;
    }

    public Grid getGrid(Player p){ // Gets grid for a player
        Grid g = p.Grid;
        return this.g;
    }

    public String getName(){
        return this.name;
    }
}