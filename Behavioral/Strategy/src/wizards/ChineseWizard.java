package wizards;

import spells.FireSpellBehaviour;

public class ChineseWizard extends Wizard{
    public ChineseWizard() {
        spellBehaviour = new FireSpellBehaviour();
    }
}
