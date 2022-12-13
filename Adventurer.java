import java.util.Random;
import java.util.Scanner;
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

    public static void pumpkin(){
        System.out.println("              ___");
        System.out.println("           ___)__|_");
        System.out.println("      .-*'          '*-,");
        System.out.println("     /      /|   |\\     \\ ");
        System.out.println("    ;      /_|   |_\\     ;");
        System.out.println("    ;   |\\           /|  ;");
        System.out.println("    ;   | ''--...--'' |  ;");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("     ''*-.,_______,.-*'  ");  
    }

    public void grab(String item){
        System.out.println("You have grabbed " + item + "!");
        items.add(item);
        System.out.println("Your inventory currently contains:")
        for (int i = 0; i < items.size(); i++){
            String item_list = "" + items.get(i);
            System.out.println(item_list);}}

    public String drop(String item){
        System.out.println("You have dropped " + item + "!");
        items.remove(item);
        System.out.println("Your inventory currently contains:") 
        for (int i = 0; i < items.size(); i++){
            String item_list = "" + items.get(i);
            System.out.println(item_list);}}

    public void examine(String item){
        System.out.println("You closely inspect " + item + ".")
        System.out.println("At first it seems to be nothing special, just an ordinary " + item+ ", but then you notice....")
        if ( item == "glowing pebble"){
            System.out.println("It appears to be a bluish, oval gemstone rather than a pebble");
            System.out.println("Something appears to be stuck inside the almost translucent gemstone... it's moving rather erratically.");
            System.out.println("It seems to be a little human, with wings..... a fairy! ZZZZZAP!");
            System.out.println("You fall to the ground as an electric shock penetrates every fibre of your being, rattling your very soul");
            System.out.println("You scream, but what comes out isn't your voice at all. In a low, raspy tone you say:");
            System.out.println("Go to my gravestone. Avenge me. Avenge the lotus. Recover the Ultimate Pumpkin.");
            System.out.println("You get up with a sense of purpose. You know where the graveyard is. You must take a left, then a right.")
        }
        else if (item == "mannequin head"){
            System.out.println("The head's eyes sparkle, it looks at you, the eyes boring into your skull.");
            System.out.println("A spark of lightning exploded from it's eyes. ZZZZZAP!");
            System.out.println("You fall to the ground as an electric shock penetrates every fibre of your being, rattling your very soul");
            System.out.println("You scream, but what comes out isn't your voice at all. In a low, raspy tone you say:");
            System.out.println("Go to my gravestone. Avenge me. Avenge the lotus. Recover the Ultimate Pumpkin.");
            System.out.println("You get up with a sense of purpose. You know where the graveyard is. You must take a right, then a left.")
        }

    }   
    public void use(String item){
        if(item.equals("Healing potion")){
            this.HP += 10;} 
        else if (item.equals("Teleporter")){
            this.location = "Graveyard";
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
        if(x== 0 | y>0){
            move_right = false;

        }
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
    public void undo(){}
    public static void main(String[] args){
        System.out.println("Welcome to the Halloween Adventure Game! You must recover the Ultimate Halloween pumpkin:");
        pumpkin();
        System.out.println("You must recover the Ultimate Pumpkin and hoist it upon the shoulders of the Mighty Scarecrow at the Sacred Garden.");
        System.out.println("Only then will the Ravens of Death leave your town. Many have tried and failed. Now it's your turn.");
        System.out.println("Your only choices are to succeed..... or die.")
        System.out.println("What is your name, O Adventurer?");
        Scanner playerName = new Scanner(System.in);
        String nameInput = playerName.nextLine();
        Adventurer player = new Adventurer(player,100, "Home", [], 100 );
        System.out.println("Hello, " + player + "!");
        System.out.println("Your HP is");
        System.out.println("It's just barely twilight, the sky is painted in purples, blues and oranges. ");
        System.out.println("You can see the stars, glimmering several billion light years away. The horizon is still faintly visible.");
        System.out.println("Usually the stars ignite your love for the universe, but today there's sort of a dull sadness emanating from them.");
        System.out.println("You realise, with a start, that most of the stars you're looking at are dead. They died long ago.");
        System.out.println("You sigh, hoisting your burlap sack over your shoulder. You don't want to, but you must set out on your quest.");
        System.out.println("You must recover the Ultimate Halloween Pumpkin. Only then will peace come to your town.");
        System.out.println("Halloween decorations line the porches of the houses around you.");
        System.out.println("A shiver goes down your spine as you see the fake gravestones line you neighbor Derek's porch.");
        System.out.println("It's twilight, the narrow period of time where the veil between life and death is thinnest.");
        

    }}

    

