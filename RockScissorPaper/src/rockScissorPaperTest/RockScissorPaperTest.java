package rockScissorPaperTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockScissorPaperTest {

	@Test
	void testEvaluateGame() {
		assertEquals("com", WhoIsWinner("보","가위"));

	

;
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
