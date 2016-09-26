import java.util.HashSet;
import java.util.Set;

/**
 * SRMCards Problem from TopCoder
 * https://community.topcoder.com/stat?c=problem_statement&pm=11341
 */
public class SRMCards {
    Set<Integer> cardsInPlay;

    public int maxTurns(int[] cards) {
        cardsInPlay = new HashSet<>();
        for (int card : cards) {
            cardsInPlay.add(card);
        }
        return 0;
    }

    private boolean cardInPlay(int card) {
        return cardsInPlay.contains(card);
    }

    private void removeCard(int card) {
        if (cardInPlay(card)) {
            cardsInPlay.remove(card);
        }
    }
}
