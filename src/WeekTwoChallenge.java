import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class WeekTwoChallenge {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner inport = new Scanner(System.in);
        ArrayList<String> burrito = new ArrayList<String>();
        ArrayList<String> rice = new ArrayList<String>();
        ArrayList<String> meat = new ArrayList<String>();
        ArrayList<String> beans = new ArrayList<String>();
        ArrayList<String> salsa = new ArrayList<String>();
        ArrayList<String> veggies = new ArrayList<String>();
        int[] num = {3, 6, 3, 4, 4};
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
        burrito.add(rice.get((int) (Math.random()) * rice.size()));


        meat.add("chicken meat");
        meat.add("steak meat");
        meat.add("carnidas meat");
        meat.add(" chorizo meat");
        meat.add("sofritas meat");
        meat.add("veggies");

        //urrito.add(meat.get((int) (Math.random()) * meat.size()));


        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
        // burrito.add(beans.get((int) (Math.random()) * beans.size()));

        salsa.add("mild salsa");
        salsa.add("midium salsa");
        salsa.add(" hot salsa");
        salsa.add("no salsa");

        burrito.add(salsa.get((int) (Math.random()) * salsa.size()));
        veggies.add("lettuce");
        veggies.add("fajita veggies,");
        veggies.add("no veggies");

        // burrito.add(veggies.get((int) (Math.random()) * veggies.size()));

        int num1 = rand.nextInt();
        int order = 0;
        for (int i = 0; i < burrito.size(); i++) {


          //  int i = 1;
            System.out.println("The ordered burrito is:");
            do {

                int rice_index = rand.nextInt(rice.size());
                int Meat_index = rand.nextInt(meat.size());
                int Beans_index = rand.nextInt(beans.size());
                int Salsa_index = rand.nextInt(salsa.size());
                int veggies_index = rand.nextInt(veggies.size());

                System.out.println(" Burrito " + i + ":[" + rice.get(rice_index) + "," + meat.get(Meat_index) + "," + beans.get(Beans_index) + "," + salsa.get(Salsa_index) + "," + veggies.get(veggies_index) + "]");
                i++;
            } while (i <= 10);
        }
    }
}




