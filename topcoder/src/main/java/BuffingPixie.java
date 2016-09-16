import java.util.Scanner;

/**
 * BuffingPixie
 * https://community.topcoder.com/stat?c=problem_statement&pm=14376
 */
public class BuffingPixie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int normalAttack = scanner.nextInt();
        int buffedAttack = scanner.nextInt();
        System.out.println(fastestVictory(hp, normalAttack, buffedAttack));
    }

    /**
     * Calculates the fewest number of moves to victory.
     * <p>
     * We achieve this by first counting the even number of moves necessary
     * to reduce health to no more than 2x normal or 1x buffed.
     * <p>
     * After this is done, we will either be able to successfully win with 1
     * normal attack or 2 more attacks (whether this is 1 buffed attack or 2 normal attacks)
     *
     * @param HP           HP of enemy
     * @param normalAttack normal attack damage
     * @param buffedAttack buffed attack damage
     * @return number of moves necessary to win
     */
    public static int fastestVictory(int HP, int normalAttack, int buffedAttack) {
        int numAttacks = 0;

        int attackPower = normalAttack * 2;
        if (buffedAttack > attackPower) {
            attackPower = buffedAttack;
        }
        while (HP > attackPower) {
            numAttacks += 2;
            HP -= attackPower;
        }

        if (normalAttack >= HP) {
            numAttacks += 1;
        } else {
            numAttacks += 2;
        }

        return numAttacks;
    }
}