package example.spells;

public class PoisonSpellBehaviour implements SpellBehaviour {
    @Override
    public void spell() {
        System.out.println("You're infected!");
    }
}
