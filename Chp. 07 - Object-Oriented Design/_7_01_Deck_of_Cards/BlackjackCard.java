<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _7_01_Deck_of_Cards;

public class BlackjackCard extends Card {
    public BlackjackCard(Rank rank, Suit suit, Color color) {
        super(rank, suit, color);
    }

    public boolean isFaceCard() {
        return rank == Rank.TEN || rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING;
    }
}
