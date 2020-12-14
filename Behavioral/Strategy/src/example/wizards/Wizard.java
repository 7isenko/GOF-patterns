package example.wizards;

import example.spells.SpellBehaviour;

public abstract class Wizard {
    protected SpellBehaviour spellBehaviour;

    public Wizard() {
    }

    public void performSpell() {
        spellBehaviour.spell();
    }

    public void setSpellBehaviour(SpellBehaviour sb) {
        this.spellBehaviour = sb;
    }
}