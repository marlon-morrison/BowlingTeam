import java.util.*; 
public class BowlingTeam {
   private String teamName;
   private String[] members = new String[4];
   public void setTeamName(String team) {
      teamName = team;
   }
   public String getTeamName() {
      return teamName;
   }
   public void setMember(int number, String name) {
      members[number] = name;
   }
   public String getMember(int number) {
      return members[number];
   }
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);  
      System.out.println("Enter a string: ");  
      String str= sc.nextLine();
   } 
}