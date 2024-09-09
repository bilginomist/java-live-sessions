package day_52_generics_enums.team;

import java.util.ArrayList;
import java.util.List;
                 // ? extends Player
public class Team <T extends Player>{

    private List<T> players;

    String name;

    public Team(String name){
        this.players = new ArrayList<>();
        this.name = name;
    }

    public void  add(T player){
        players.add(player);
    }

    public T search(String name){

        for (T player : players) {

            if (player instanceof BasketballPlayer){
                if (((BasketballPlayer)player).name.equals(name)){
                    return player;
                }

            }

            if (player instanceof FootballPlayer){
                if (((FootballPlayer)player).name.equals(name)){
                    return player;
                }

            }

        }


        return null;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                '}';
    }
}
