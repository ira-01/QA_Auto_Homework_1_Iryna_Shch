public class Character {
    String name;                    //Ім'я персонажа.
    int health;                     //Кількість очок здоров'я персонажа.
    int strength;                   //Атрибут сили, який впливає на силу атаки.
    int defense;                    //Атрибут захисту, який впливає на зменшення шкоди, коли об'єкт захищається.
    static int characterCount;      //Статичне поле для відстеження кількості створених персонажів.

    Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;
    }



    public int Attack(Character otherPerson) {
        int damage;
        damage = this.strength - otherPerson.defense;

            if (damage < 0) {
                damage = 0;
            }

        return damage;
    }

   public void takeDamage (int damage){

        this.health = this.health - damage;

            if (this.health < 0){
                this.health = 0;
            }
   }

    protected boolean isAlive (){
       boolean isAlive;

            if (this.health > 0) {
                 isAlive = true;
             }
            else{
                 isAlive = false;
            }

       return isAlive;
   }

    protected void displayStatus (){

       if (isAlive()) {
           System.out.println(this.name + " is alive"); //alive
           System.out.println(this.name + " health = " + this.health); //health
           System.out.println(this.name + " strenght = " + this.strength); //strenght
           System.out.println(this.name + " defense = " + this.defense); //defense
       }
       else{
           System.out.println(this.name + " is death"); //not alive
       }



   }
}
