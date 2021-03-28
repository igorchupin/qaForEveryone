public  class KataExtra {

    public static class Fighter {
        public String name;
        public int health;
        public int damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";

        if (firstAttacker.equals(fighter1.name)) {

            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }

            }
        }

        if (firstAttacker.equals(fighter2.name)) {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
            }

        }
        return winner;
    }


    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
    }
}



