import java.util.ArrayList;

public class Adventurer implements Contract{
    String name;
    int HP;
    String location;
    ArrayList<String> items;
    int size;
    public Adventurer(String name, int HP, String location, ArrayList<String> items, int size){
        this.name = name;
        this.HP = 100;
        this.location = "Home";
        this.items = items;
        this.size = 100;
        items.add("Healing potion");
        items.add("Teleporter");}

    public void grab(String item){
        System.out.println("You have grabbed " + item + "!");
        items.add(item);
        System.out.println("Your inventory currently contains:");
        for (int i = 0; i < items.size(); i++){
            String item_list = "" + items.get(i);
            System.out.println(item_list);}}

    public String drop(String item){
        System.out.println("You have dropped " + item + "!");
        items.remove(item);
        System.out.println("Your inventory currently contains:") ;
        for (int i = 0; i < items.size(); i++){
            String item_list = "" + items.get(i);
            System.out.println(item_list);}
        return item + "has been dropped!";}

    public void examine(String item){
        System.out.println("You closely inspect " + item + ".");
        System.out.println("At first it seems to be nothing special, just an ordinary " + item+ ", but then you notice....");
        if ( item == "glowing pebble"){
            System.out.println("It appears to be a bluish, oval gemstone rather than a pebble");
            System.out.println("Something appears to be stuck inside the almost translucent gemstone... it's moving rather erratically.");
            System.out.println("It seems to be a little human, with wings..... a fairy! ZZZZZAP!");
            System.out.println("You fall to the ground as an electric shock penetrates every fibre of your being, rattling your very soul");
            System.out.println("You scream, but what comes out isn't your voice at all. In a low, raspy tone you say:");
            System.out.println("Go to my gravestone. Avenge me. Avenge the lotus. Recover the Ultimate Pumpkin.");
            System.out.println("You get up with a sense of purpose. You know where the graveyard is. You must take a left, then a right.");
        }
        else if (item == "mannequin head"){
            System.out.println("The head's eyes sparkle, it looks at you, the eyes boring into your skull.");
            System.out.println("A spark of lightning exploded from it's eyes. ZZZZZAP!");
            System.out.println("You fall to the ground as an electric shock penetrates every fibre of your being, rattling your very soul");
            System.out.println("You scream, but what comes out isn't your voice at all. In a low, raspy tone you say:");
            System.out.println("Go to my gravestone. Avenge me. Avenge the lotus. Recover the Ultimate Pumpkin.");
            System.out.println("You get up with a sense of purpose. You know where the graveyard is. You must take a right, then a left.");
        }

    }   
    public void use(String item){
        if(item.equals("Healing potion")){
            this.HP += 10;} 
        else if (item.equals("Teleporter")){
            this.location = "Graveyard";
            System.out.println("You are in " + this.location );
        }

    }
    public boolean walk(String direction){
        boolean move_right = true;
        if(direction.equals("left")){
            move_right = false;}
        else if (direction.equals("right")){
            move_right = true;}
        return move_right;
        }

    public boolean fly(int x, int y){
        boolean move_right = true;
        boolean move_up = true;
        if(y>0){
            move_up = true;}
        if(x<=0){
            move_right = false;}
        if(x>0){
            move_right = true;}
        if(y<=0){
            move_up = false;}
        else{
            this.HP = 0;
            System.out.println("You entered the wrong input. You're dead.");}
        return move_right;

        }
    
    public Number shrink(){
        this.size = this.size / 2;
        return size;
    }
    public Number grow(){
        this.size = this.size * 2;
        return size;
    }
    public void rest(){
        this.HP += 10;
    }
    public void undo(){
        //restores you to your original size
        this.size = 100;
    }
    public static void main(String[] args){
        Adventurer a = new Adventurer("Bob", 100, "Home", new ArrayList<String>(), 100);
        a.grab("glowing pebble");
        a.grab("mannequin head");
        a.examine("glowing pebble");
        a.examine("mannequin head");
        a.drop("glowing pebble");
        a.drop("mannequin head");
        a.use("Healing potion");
        a.use("Teleporter");
        a.walk("left");
        a.walk("right");
        a.fly(1,1);
        a.fly(-1,-1);
        a.fly(1,-1);
        a.fly(-1,1);
        a.shrink();
        a.grow();
        a.rest();
        a.undo();
        System.out.println("Your HP is:" + a.HP);
        

    }}

    

