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

        int roundNumber = 0;
        while (!cardsInPlay.isEmpty()) {
            int bestCard = -1;
            int minCardsRemoved = Integer.MAX_VALUE;

            for (Integer card : cardsInPlay) {
                int cardsRemoved = 1;
                if (cardInPlay(card - 1)) {
                    cardsRemoved++;
                }
                if (cardInPlay(card + 1)) {
                    cardsRemoved++;
                }

                if (cardsRemoved < minCardsRemoved) {
                    bestCard = card;
                    minCardsRemoved = cardsRemoved;
                }
            }

            removeCard(bestCard);
            removeCard(bestCard - 1);
            removeCard(bestCard + 1);

            roundNumber++;
        }

        return roundNumber;
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
