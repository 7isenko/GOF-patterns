package example;

import example.spells.PoisonSpellBehaviour;
import example.wizards.ChineseWizard;
import example.wizards.ElderWizard;
import example.wizards.BaseWizard;

public class WizardFight {
    public static void main(String[] args) {
        BaseWizard elderWizard = new ElderWizard();
        BaseWizard chineseWizard = new ChineseWizard();

        elderWizard.performSpell();
        chineseWizard.performSpell();

        chineseWizard.setSpellBehaviour(new PoisonSpellBehaviour());
        chineseWizard.performSpell();

        // output:
        // You turn stone!
        // Fireball!
        // You're infected!

    }
}

