public class TennisGame3 implements TennisGame {
  
  private int player1Points;
  private int player2Points;
  private String player1Name;
  private String player2Name;
  
  public TennisGame3(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }
  
  public String getScore() {
    String[] scoreNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    String score;
    String lead;
    
    if (player1Points < 4 && player2Points < 4) {
      score = scoreNames[player1Points];
      
      return (player1Points == player2Points)
              ? score + "-All"
              : score + "-" + scoreNames[player2Points];
      
    } else if (player1Points == player2Points) {
      return "Deuce";
      
    } else {
      lead = player1Points > player2Points
              ? player1Name
              : player2Name;
      
      return (Math.abs(player1Points - player2Points) == 1)
              ? "Advantage " + lead
              : "Win for " + lead;
    }
  }
  
  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.player1Points += 1;
    else
      this.player2Points += 1;
  }
}