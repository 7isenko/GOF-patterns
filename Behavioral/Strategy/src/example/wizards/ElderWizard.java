package example.wizards;

import example.spells.EarthSpellBehaviour;

public class ElderWizard extends Wizard {
    public ElderWizard() {
        spellBehaviour = new EarthSpellBehaviour();
    }
}
