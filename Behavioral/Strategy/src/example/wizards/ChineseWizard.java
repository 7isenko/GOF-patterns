package example.wizards;

import example.spells.FireSpellBehaviour;

public class ChineseWizard extends BaseWizard {
    public ChineseWizard() {
        spellBehaviour = new FireSpellBehaviour();
    }
}
