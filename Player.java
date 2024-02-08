/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
    private String name;
    int points;
  /* your code here - constructor(s) */ 
    public Player()
    {
        System.out.println("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        name = newName;
        System.out.println("Hello and welcome to the game, " + newName);
        points = 0;
    }

    public Player(String inputName)
    {
        name = inputName;
        points = 0;
        System.out.println("Hello and welcome to the game, " + inputName);
    }

  /* your code here - accessor(s) */ 
      public String getName()
      {
        return name;
      }
      public int getPoints()
      {
        return points;
      }
  /* your code here - mutator(s) */ 
  public void setName(String x)
  {
    name = x;
  }
}