public class TennisGame1 implements TennisGame {
  
  private int player1Points = 0;
  private int player2Points = 0;
  private String player1Name;
  private String player2Name;
  
  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }
  
  public void wonPoint(String playerName) {
    if (playerName == "player1")
      player1Points += 1;
    else
      player2Points += 1;
  }
  
  public String getScore() {
    String score = "";
    int tempScore;
    int player1Advantage = player1Points - player2Points;
    
    if (player1Points == player2Points) {
      switch (player1Points) {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;
      }
      
    } else if (player1Points >= 4 || player2Points >= 4) {
      
      if (player1Advantage == 1) score = "Advantage " + player1Name;
      else if (player1Advantage == -1) score = "Advantage " + player2Name;
      else if (player1Advantage >= 2) score = "Win for " + player1Name;
      else score = "Win for " + player2Name;
      
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = player1Points;
        } else {
          score += "-";
          tempScore = player2Points;
        }
        
        switch (tempScore) {
          case 0:
            score += "Love";
            break;
          case 1:
            score += "Fifteen";
            break;
          case 2:
            score += "Thirty";
            break;
          case 3:
            score += "Forty";
            break;
        }
      }
    }
    return score;
  }
}