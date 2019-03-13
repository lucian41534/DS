package rockScissorPaper;

public class Main {



public static void main(String[] args) {

  

       RockScissorPaper Game = new RockScissorPaper();
        String user = Game.startGame();
        String computer = Game.computerChoice();
        String wins = Game.WhoIsWinner(user, computer);
       
      
    }
  }
