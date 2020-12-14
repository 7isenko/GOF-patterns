package example.spells;

public class FireSpellBehaviour implements SpellBehaviour {
    @Override
    public void spell() {
        System.out.println("Fireball!");
    }
}