package example.wizards;

import example.spells.EarthSpellBehaviour;

public class ElderWizard extends BaseWizard {
    public ElderWizard() {
        spellBehaviour = new EarthSpellBehaviour();
    }
}
