
public class Card {
	private short rank, suit;
	public  String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	public  char[] suits = {'C','D','H','S'};


	public short getRank() {
		return rank;
	}

	public void setRank(short rank) {
		this.rank = rank;
	}

	public short getSuit() {
		return suit;
	}

	public void setSuit(short suit) {
		this.suit = suit;
	}
	
	
}
	
	
