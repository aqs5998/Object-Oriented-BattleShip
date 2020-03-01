public class Ship{
    
    private String name;
    public int x;
    public int y;
    public char dir;
    public int size;

    public void createShip(String name, int x, int y, char dir, int size){
        this.name = name;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.size = size;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }
    
    public void setX(int e){
        this.x = e;
    }

    public void setY(int e){
        this.y = e;
    }

    public void setDir(int e){
        this.x = e;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setDir(char dir){
        this.dir = dir;
    }
    
    public char getDir(){
        return this.length;
    }
}