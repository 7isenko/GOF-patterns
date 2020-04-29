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

