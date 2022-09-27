public class Villain implements VillainInterface{
        private int villainMaxHealth = 100;
        private String villain;
        String[] villains = new String[4];
        private int villainCount;
        private int villainAttackDamage = 30;
        public void setVillainCount()
        {
            this.villainCount = villains.length;
        }
        public int getVillainCount(){
            return villainCount;
        }
        public int getVillainMaxHealth(){
            return villainMaxHealth;
        }
        public int getVillainAttackDamage() {
            return villainAttackDamage;
        }

        public void setVillainAttackDamage(int villainAttackDamage) {

            this.villainAttackDamage += (villainAttackDamage*10);
        }
        public void setVillainMaxHealth(int damage) {
            if(getVillainMaxHealth() > 0)
                this.villainMaxHealth+= damage;
            else
                this.villainMaxHealth = (damage+10)+100;
        }
        public String getVillain()
        {
            return villain;
        }
        public boolean setVillainList(int dungeonId){
            switch (dungeonId){
                case 1:
                    villains[0] = "Night Sword";
                    villains[1] = "Demon Sword";
                    villains[2] = "Gorr";
                    villains[3] = "Black Excalibur";
                    break;
                case 2:
                    villains[0] = "Night Elf";
                    villains[1] = "Black Arrow";
                    villains[2] = "Dark Moon Elf";
                    villains[3] = "Dark Queen";
                    break;
                case 3:
                    villains[0] = "Enchantress";
                    villains[1] = "Dark Fate";
                    villains[2] = "Black Marlin";
                    villains[3] = "Lord of Chaos";
                    break;
                default:
                    villains[0] = "";
            }
            if(villains.length > 1)
                return true;
            else
                return false;
        }
        public String generateVillain(int v1){
            if(v1 < villains.length) {
                villain = villains[v1];
                setVillainMaxHealth(v1);
                return villains[v1];
            }
            else
                return "NoVillain";
        }
        public void displayVillainStatus()
        {
            System.out.println("\t# "+villain+ "# \t# Max Attack range: 0-"+ getVillainAttackDamage() + "#\t # HP: "+getVillainMaxHealth() + "##");
        }

    }

