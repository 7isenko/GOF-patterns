public abstract class Wizard {
    SpellBehaviour spellBehaviour;

    public Wizard() {
    }

    public void performSpell() {
        spellBehaviour.spell();
    }

    public void setSpellBehaviour(SpellBehaviour sb) {
        this.spellBehaviour = sb;
    }
}