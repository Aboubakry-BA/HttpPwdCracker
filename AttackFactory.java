public class AttackFactory {
    
    public Attack getAttack(String attackType) {
        if (attackType == null) {
            return null;
        }
        if (attackType.equalsIgnoreCase("Force Brute")) {
            return new ForceBrute();
        } else if (attackType.equalsIgnoreCase("Dictionnaire")) {
            return new Dictionnaire();
        }
        return null;
    }
}