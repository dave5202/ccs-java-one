public class Fighter {

    // Field Declarations
    private final String name;

    private final String type;

    private final int skill;

    private int stamina;

    private final GameEngine theGameEngine;

    public static final int DAMAGE_VALUE = 2;

    /**
     * Construct a figher, given a name, type, attributes and reference to the game engine.
     */
    public Fighter(String name, String type, int skill, int stamina, GameEngine theGameEngine) {

        this.name = name;
        this.type = type;
        this.skill = skill;
        this.stamina = stamina;
        this.theGameEngine = theGameEngine;

    }

    // TODO:  Reduce the fighter's stamina accordingly
    public void takeDamage(int damage) {
        stamina = Math.max(stamina - damage, 0);
    }

    // TODO:  Return the number of damage points to be inflicted on opponent
    public int calculateDamage() {
        return DAMAGE_VALUE;
    }

    // TODO: Calculate an attack score for the fighter using the procedure:
    public int calculateAttackScore() {
        return skill + theGameEngine.rollDice() + theGameEngine.rollDice();
    }

    public String getName() {
        return name;
    }
    // TODO: Answer this question.
    // Why don't we need more getters?
    // Because the GameEngine does not  need to get any of the other attributes.

    public String toString() {
        return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
    }

    public boolean isDead() {
        return stamina == 0;
    }
    // TODO: Answer this question.
    // Why not simply have a boolean that specifies whether the fighter is dead or not?
    // When the game engine is using the fighter object they won't have to change any field
    // of the fighter object. Calling this method instead is saving space and using
    // the fields we already have, similar to not having a bottom field.
}
