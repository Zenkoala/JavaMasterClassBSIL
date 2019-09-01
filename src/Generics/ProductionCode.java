package Generics;

public class ProductionCode {
      public static void main(String[] args) {
      FootballPlayer joe = new FootballPlayer("Joe");
      BaseballPlayer pat = new BaseballPlayer("Pat");
      SoccerPlayer max = new SoccerPlayer("Max");

      Team teamOne = new Team("One");
      teamOne.addPlayer(joe);
      teamOne.addPlayer(pat);
      teamOne.addPlayer(max);

            System.out.println(teamOne.numPLayers());

      }
}
