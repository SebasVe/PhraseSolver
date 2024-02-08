/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = null;
    game = new Board();
    solved = false;
  }
      //Player test = new Player();
  /* your code here - accessor(s) */
      /*public getName1()
      {
        player1 = test;
        return player1;
      }*/
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {

      /* your code here - game logic */
      /* your code here - determine how game ends */  

      String guess;
      if(currentPlayer == 1)
      {
        currentPlayer++;
        System.out.print("Current Player: ");
        System.out.println(player1.getName());
        System.out.println("Current Phrase: " + Board.getSolvedPhrase());
        System.out.println("Guess a letter or a phrase");
        guess = input.nextLine();
        if (guess.length() == 1)
        {
          boolean letter = Board.guessLetter(guess);
          if(letter == true)
          {
            System.out.println("Found the letter " + guess + " in the phrase");
            player1.points++;
          }
          else
          {
            System.out.println("Letter not Found");
          }
        }
        else
        {
          currentPlayer++;
          if (Board.isSolved(guess))
          {
            solved = true;
            System.out.println("Congrats you solved the phrase correctly!");
            System.out.println("Phrase: " + Board.getSolvedPhrase());
          }
          else
          {
            System.out.println("Wrong guess");
          }
        }
        System.out.println("Points: " + player1.getPoints());
        System.out.println();

      }


      //solved = true; 
    } 
   
  }
  
}