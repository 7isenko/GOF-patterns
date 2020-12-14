package example.wizards;

import example.spells.SpellBehaviour;

public abstract class BaseWizard {
    protected SpellBehaviour spellBehaviour;

    public BaseWizard() {
    }

    public void performSpell() {
        spellBehaviour.spell();
    }

    public void setSpellBehaviour(SpellBehaviour sb) {
        this.spellBehaviour = sb;
    }
}