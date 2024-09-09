package day_52_generics_enums.team;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam {

    private List<FootballPlayer> players;

    String name;

    public FootballTeam( String name) {
        this.players = new ArrayList<>();
        this.name = name;
    }

    public void  add(FootballPlayer player){
        players.add(player);
    }
}
