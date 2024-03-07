package homework.hw1;

/**
 * algorithm for random numbers with a 5% probability of getting 3 identical numbers.
 *
 * @author Alexander Isai on 07.03.2024.
 */
public class Task1 {

    public static void main(String[] args) {

        int chance = 0;
        for (int i = 0; i < 1000; i++) {
            chance++;
            if(chance < 20){
                long a = Math.round(Math.random()*9);
                long b = Math.round(Math.random()*9);
                long c = Math.round(Math.random()*9);
                System.out.println(chance + ". " + a + " " + b + " " + c);
                if(a == b && b == c){
                    System.out.println("===Chance came earlier===");
                    chance = 0;
                }
            } else {
                long a = Math.round(Math.random()*9);
                System.out.println(chance +". " + a + " " + a + " " + a);
                chance = 0;
            }
        }
    }
}
