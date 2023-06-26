import java.util.*;
public class BowlingTeamDemo4 {
   public static void main(String[] args) {
      String name;
      BowlingTeam bowlTeam = new BowlingTeam();
      int x;
      int y;
      final int NUM_TEAM_MEMBERS = 4;
      final int NUM_TEAMS = 4;
      BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
      Scanner input = new Scanner(System.in);
      getTeamData(teams);
      for(y = 0; y < NUM_TEAMS; ++y) {
         System.out.println("\nMembers of team " +
         teams[y].getTeamName());
         for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            System.out.print(teams[y].getMember(x) + " ");
         System.out.println();
      }
      System.out.print("\n\nEnter a team name to see its roster >> ");
      name = input.nextLine();
      for(y = 0; y < teams.length; ++y)
         if(name.equals(teams[y].getTeamName()))
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
               System.out.print(teams[y].getMember(x) + " ");
      System.out.println();
   }
   public static void getTeamData(BowlingTeam[] teams) {
      String name;
      final int NUM_TEAMS = 4;
      int x;
      int y;
      final int NUM_TEAM_MEMBERS = 4;
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome this is a team organizer the main purpuse set and organize teams \nbut for this example we are using bowling teams.");
      for(y = 0; y < NUM_TEAMS; ++y) {
         teams[y] = new BowlingTeam();
         System.out.print("Enter team name >> ");
         name = input.nextLine();
         teams[y].setTeamName(name);
         for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
         System.out.print("Enter team member's name >> ");
         name = input.nextLine();
         teams[y].setMember(x, name);
         }
      }
   }
}