package example.wizards;

import example.spells.FireSpellBehaviour;

public class ChineseWizard extends Wizard{
    public ChineseWizard() {
        spellBehaviour = new FireSpellBehaviour();
    }
}
