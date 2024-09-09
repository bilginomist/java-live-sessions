package day_52_generics_enums.team;

public class TestTeam {

    public static void main(String[] args) {
        BasketballPlayer basketballPlayer=new BasketballPlayer("alperen");
        /*
        BasketballTeam basketballTeam=new BasketballTeam("AFACANLAR");
        basketballTeam.add(basketballPlayer);


         */
        FootballPlayer footballPlayer=new FootballPlayer("Ronaldo");
        FootballPlayer footballPlayer1=new FootballPlayer("Sabri");
        /*
        FootballTeam footballTeam=new FootballTeam("Madrid");
        footballTeam.add(footballPlayer);


         */

        Team<FootballPlayer> footballPlayerTeam=new Team<>("BİLGİ");
        footballPlayerTeam.add(footballPlayer);
        footballPlayerTeam.add(footballPlayer1);

        Team<BasketballPlayer> basketballPlayerTeam=new Team<>("ADA");
        basketballPlayerTeam.add(basketballPlayer);

        System.out.println("footballPlayerTeam.search(\"Sabri\") = " + footballPlayerTeam.search("Sabri"));

        System.out.println(footballPlayerTeam);


        //Car Player clasının alt sınıfı olmadığı için takım oluşamaz
       // Car car=new Car();

       // Team<Car> carTeam=new Team<>("ARABA");

    }
}
