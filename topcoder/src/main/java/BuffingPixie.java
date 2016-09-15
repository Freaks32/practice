import java.util.Scanner;

public class BuffingPixie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int normalAttack = scanner.nextInt();
        int buffedAttack = scanner.nextInt();
        System.out.println(fastestVictory(hp, normalAttack, buffedAttack));
    }

    public static int fastestVictory(int HP, int normalAttack, int buffedAttack) {
        return 0;
    }
}

/**
 * Problem Statement for BuffingPixie
 * <p>
 * <p>
 * Problem Statement
 * <p>
 * You are playing a turn-based role-playing game. At the moment you are preparing a strategy that will defeat an enemy character in the fewest turns possible. At the beginning of the fight the enemy has HP hitpoints. The enemy dies when their hitpoints become zero or negative.
 * <p>
 * <p>
 * <p>
 * A less experienced player may simply try attacking each turn, but you know the importance of support skills. In each of your turns you may choose one of the following two actions: either Focus or Attack.
 * <p>
 * Focus changes the amount of damage dealt by an Attack performed during your next turn.
 * Attack deals some damage to the opponent. If you used Focus during your immediately previous turn, the attack decreases the enemy's hitpoints by buffedAttack. Otherwise, the attack decreases the enemy's hitpoints by normalAttack.
 * <p>
 * <p>
 * You are given the ints HP, normalAttack and buffedAttack. Return the smallest number of turns in which you can kill the enemy.
 * <p>
 * <p>
 * Definition
 * <p>
 * Class:	BuffingPixie
 * Method:	fastestVictory
 * Parameters:	int, int, int
 * Returns:	int
 * Method signature:	int fastestVictory(int HP, int normalAttack, int buffedAttack)
 * (be sure your method is public)
 * <p>
 * <p>
 * Constraints
 * -	HP will be between 1 and 10^9, inclusive.
 * -	normalAttack will be between 1 and 10^9, inclusive.
 * -	buffedAttack will be between 1 and 10^9, inclusive.
 * <p>
 * Examples
 * 0)
 * <p>
 * 5
 * 1
 * 3
 * Returns: 4
 * One optimal strategy looks as follows:
 * Turn 1: Focus.
 * Turn 2: Attack. Our enemy's hitpoints decrease from 5 to 2.
 * Turn 3: Focus.
 * Turn 4: Attack. Our enemy's hitpoints decrease from 2 to -1.
 * 1)
 * <p>
 * 10
 * 20
 * 50
 * Returns: 1
 * You can win by simply attacking on the first turn.
 * 2)
 * <p>
 * 24
 * 2
 * 5
 * Returns: 10
 * 3)
 * <p>
 * 497
 * 40
 * 45
 * Returns: 13
 * 4)
 * <p>
 * 8400
 * 1
 * 5
 * Returns: 3360
 * 5)
 * <p>
 * 10
 * 2
 * 1
 * Returns: 5
 * Note that buffedAttack does not have to be greater than normalAttack.
 * .
 */