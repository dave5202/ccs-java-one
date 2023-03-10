import java.util.Random;

public class GameEngine {
    private final Random generator;

    public GameEngine() {
        generator = new Random();
    }

    public int rollDice() {
        return generator.nextInt(6) + 1;
    }

    /**
     * Logging method that prints message to standard output.
     */
    public void log(String message) {

        System.out.println(message);

    }

    /**
     * Simulation of battle between two fighters.
     * The battle ends when one of the fighters' stamina becomes 0
     */
    public void simulateBattle(Fighter first, Fighter second) {

        /*
     If both fighters compute the same attack score, the round results in a draw.
     Otherwise, the fighter with the higher attack score hits the fighter with the lower attack score,
     whose stamina is reduced by two (or set to zero if it is currently set to one).
    * */

        log("At start of battle, stats are:");
        log(first.toString());
        log(second.toString());
        log("------------------------------");

        while (!first.isDead() && !second.isDead()) {
            int firstAttackScore = first.calculateAttackScore();
            int secondAttackScore = second.calculateAttackScore();

            if (firstAttackScore == secondAttackScore) {
                log(first.getName() + " draws with " + second.getName());
            } else if (firstAttackScore > secondAttackScore) {
                second.takeDamage(first.calculateDamage());
                log(first.getName() + " hits " + second.getName());
            } else {
                // secondAttackScore > firstAttackScore
            }

            // Check if anyone is dead and if so - end the game
            // You can end the game by logging a message then having 'return;' on the line below

        }




        // TODO: Implement this method using the log method as above and the methods already implemented.
        // Below is how we want the simulation to look like.
        /*
    Alex hits Joe, stats are:
    Joe - Human Warrior - skill: 16; stamina: 6
    Alex - Elf Lord - skill: 18; stamina: 4
    ------------------------------
    Joe draws with Alex
    ------------------------------
    Alex hits Joe, stats are:
    Joe - Human Warrior - skill: 16; stamina: 4
    Alex - Elf Lord - skill: 18; stamina: 4
    ------------------------------
    Alex hits Joe, stats are:
    Joe - Human Warrior - skill: 16; stamina: 2
    Alex - Elf Lord - skill: 18; stamina: 4
    ------------------------------
    Alex hits Joe, stats are:
    Joe - Human Warrior - skill: 16; stamina: 0
    Alex - Elf Lord - skill: 18; stamina: 4
    ------------------------------
    End of battle, Alex - Elf Lord - skill: 18; stamina: 4 wins!
         */


    }

}
