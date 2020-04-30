import spells.PoisonSpellBehaviour;
import wizards.ChineseWizard;
import wizards.ElderWizard;
import wizards.Wizard;

public class WizardFight {
    public static void main(String[] args) {
        Wizard elderWizard = new ElderWizard();
        Wizard chineseWizard = new ChineseWizard();

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

