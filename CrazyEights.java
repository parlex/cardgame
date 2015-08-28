import java.util.ArrayList;

class CrazyEights{
   private Deck deck;
   private ArrayList<Player> players;
   private final int INITIALAMOUNTOFCARDS = 8;
   private Card currentCard;
   private final Value CRAZYEIGHT = Value.Eight;

   public CrazyEights(int playerCnt){
      deck = new Deck();
      initPlayersWithCards(playerCnt);
      currentCard = deck.deal();
      startGame();
   }

   private void startGame(){
      System.out.println("Current card : " + currentCard);
   }


   private void initPlayersWithCards(int playerCnt){
      players = new ArrayList<Player>(playerCnt);
      Player tmp = new Player(0);
      for(int i = 0; i < playerCnt; i++){
         tmp = new Player(i);
         for(int j = 0; j < INITIALAMOUNTOFCARDS; j++){
            tmp.drawCard(deck.deal());
         }
         players.add(tmp);
      }
   }

   private boolean isValidCard(Card card){
      if(currentCard.getSuit() == card.getSuit() || currentCard.getValue() == card.getValue() || card.getValue() == CRAZYEIGHT){
         return true;
      }
      return false;
   }


   public String toString(){
      String output = "";
      for(Player p : players){
         output += "----Player " + p.getId() + "----\n";
         output += p.getHand() + "\n";
      }
      return output;
   }
}
