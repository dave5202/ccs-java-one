public class Main {
    /**
     * Example battle.
     */
    public static void main(String[] args) {

        // Run the program once the Fighter Class and Game Engine are implemented!

        GameEngine gameEngine = new GameEngine();

        Fighter humanWarrior = new Fighter("Joe", "Human Warrior", 16, 12, gameEngine);

        Fighter elfLord = new Fighter("Alex", "Elf Lord", 18, 6, gameEngine);

        gameEngine.simulateBattle(humanWarrior, elfLord);

    }
}