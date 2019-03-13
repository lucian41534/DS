package rockScissorPaper;
import java.util.Scanner;

public class RockScissorPaper {
    String comRPS;
    String userRPS;


        public String startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1)바위, (2)보  or (3)가위중에 선택 하십시오");
        int userChoice = sc.nextInt();

        if (userChoice == 1){
            System.out.println("바위를 선택");
            userRPS = "바위";
        }
        else if (userChoice == 2){
            System.out.println("보를 선택");
            userRPS = "보자기";
        }
        else{
            System.out.println("가위를 선택");
            userRPS = "가위";
        }
        return userRPS;
    }

   public String computerChoice(){
       int computerChoiceNumber = (int)(Math.random() * 10);
      if (computerChoiceNumber <= 3){
            System.out.println("컴퓨터 : 바위 선택");
            comRPS = "바위";
       }
      else if (computerChoiceNumber <= 6){
            System.out.println("컴퓨터 : 보자기 선택");
            comRPS = "보자기";
        }
            else{
            System.out.println("컴퓨터 : 가위 선택");
            comRPS = "가위";
        }
                 return comRPS;
    }

    public String WhoIsWinner(String userRPS , String comRPS){

        if (userRPS.equals(comRPS)){
            System.out.println("무승부입니다.!");
            return "무승부!";

       }
        if (userRPS.equalsIgnoreCase("바위") && comRPS.equalsIgnoreCase("가위")){
            System.out.println("당신이 이겼습니다.!");
            return "user";
       }
        if (userRPS.equalsIgnoreCase("보자기") && comRPS.equalsIgnoreCase("바위")){
          System.out.println("당신이 이겼습니다.!");
            return "user";
        }
        if (userRPS.equalsIgnoreCase("가위") && comRPS.equalsIgnoreCase("보자기")){
            System.out.println("당신이 이겼습니다!");
            return "user";
        }
        else {
            System.out.println("컴퓨터가 이겼습니다 ㅠ");
            return "com";
        }

    }
}

