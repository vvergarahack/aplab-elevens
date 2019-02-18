package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card threeSpades = new Card("Rank3", "Spades", 3);
		Card fiveHearts = new Card("Rank5", "Hearts", 5);
		Card kingClubs = new Card("RankK", "Clubs", 12);
		Card threeSpades2 = new Card("Rank3", "Spades", 3);
		
		System.out.println("3 of Spades: " + threeSpades.toString());
		System.out.println("5 of Hearts: " + fiveHearts.toString());
		System.out.println("King of Clubs: " + kingClubs.toString());
		
		if(threeSpades.matches(fiveHearts)) {
			System.out.println("Lol matches doesn't work.");
		}
		if(threeSpades.matches(threeSpades2)) {
			System.out.println("Niceee");
		}
	}
}
