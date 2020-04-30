package wizards;

import spells.SpellBehaviour;

public abstract class Wizard implements SpellBehaviour {
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