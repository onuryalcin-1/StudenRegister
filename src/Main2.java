
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Player implements Comparable<Player>{
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }

    @Override
    public int compareTo(Player player) {

        if (this.id < player.id) {
            
            return -1;
            
        }
        else if (this.id > player.id) {
            return 1;
            
        }
        return 0;
        


    }
public class Main2 {
    
    /*public static void main(String[] args) {
            /*List <String> list_string = new ArrayList<String>();
        
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string);
        
        for (String s : list_string) {
            System.out.println(s);
                   
        }
        
        List<Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Onur", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oğuz", 10));
        list_player.add(new Player("Yusuf", 4));
        
        Player p1  = new Player("Onur", 5);
        Player p2 = new Player("Yusuf", 4);
        
        System.out.println(p1.compareTo(p2)); 
                
        
               
        //Collections.sort(list_player);*/
    
        public static void main(String[] args) {
        
    }
}
}

