package day_52_generics_enums.team;

import java.util.ArrayList;
import java.util.List;

public class BasketballTeam {

   private List<BasketballPlayer> players;

   public String name;

    public BasketballTeam( String name) {
        this.players = new ArrayList<>();
        this.name = name;
    }

    public void  add(BasketballPlayer player){
        players.add(player);
    }
}
