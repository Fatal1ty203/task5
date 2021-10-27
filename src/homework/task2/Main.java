package homework.task2;

public class Main {

    public static void main(String[] args) {

        Character character = new Character("Vas");
        Character character2 = new Character("Pet");
        int is = 1;
        int n = 4;
        Character currentCharacter = character;
        Character oppositeCharacter = character2;

        Pistol pistol = new Pistol();
        pistol.name = "Glock";
        pistol.damage = 10;

        Rifle rifle = new Rifle();
        rifle.name = "AK-47";
        rifle.damage = 100;

        Gun gun = new Gun();
        gun.name = "Базука";
        gun.damage = 1000;

        gun.print();
        pistol.print();
        rifle.print();

        System.out.println(gun.makeShot());
        System.out.println(pistol.makeShot());
        System.out.println(rifle.makeShot());


        //logic AND:
        //пример с телефоном: нужно , чтобы цена было меньше 30000 и рейтинг было больше 4. Требуется и то и другое ОДНОВРЕМЕННО
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //logic AND:
        //пример с телефоном: нужно, чтобы цвет телефона был черный или белый. Требуется что-то одно
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false



        while (currentCharacter.health > 0){
            currentCharacter.print();
            if(currentCharacter.counter == 4){
                oppositeCharacter.health -= currentCharacter.shot(n);
            }else {
                oppositeCharacter.health -= currentCharacter.shot();
            }
            System.out.println(oppositeCharacter.toString());
            //Делаем обмен игроков местами
            Character tmp = currentCharacter;
            currentCharacter = oppositeCharacter;
            oppositeCharacter = tmp;

        }

    }
}

