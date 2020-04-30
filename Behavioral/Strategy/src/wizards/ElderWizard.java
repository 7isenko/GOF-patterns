package wizards;

import spells.EarthSpellBehaviour;

public class ElderWizard extends Wizard {
    public ElderWizard() {
        spellBehaviour = new EarthSpellBehaviour();
    }
}
