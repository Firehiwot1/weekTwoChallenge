import java.util.ArrayList;
import java.util.Random;

public class WeekTwoChallenge {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<String> burrito = new ArrayList<String>();
        ArrayList<String> rice = new ArrayList<String>();
        ArrayList<String> meat = new ArrayList<String>();
        ArrayList<String> beans = new ArrayList<String>();
        ArrayList<String> salsa = new ArrayList<String>();
        ArrayList<String> veggies = new ArrayList<String>();
        int [] num={3,6,3,4,4};
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
        burrito.add(rice.get((int) (Math.random()) *rice.size()));



            meat.add("chicken meat");
            meat.add("steak meat");
            meat.add("carnidas meat");
            meat.add(" chorizo meat");
            meat.add("sofritas meat");
            meat.add("veggies");

            burrito.add(meat.get((int) (Math.random()) * meat.size()));


            beans.add("pinto beans");
            beans.add("black beans");
            beans.add("no beans");
            burrito.add(beans.get((int) (Math.random()) * beans.size()));

            salsa.add("mild salsa");
            salsa.add("midium salsa");
            salsa.add(" hot salsa");
            salsa.add("no salsa");

            burrito.add(salsa.get((int) (Math.random()) * salsa.size()));
            veggies.add("lettuce");
            veggies.add("fajita veggies,");
            veggies.add("no veggies");

            burrito.add(veggies.get((int) (Math.random()) * veggies.size()));

        int num1=rand.nextInt();
        int order=0;
        for (int i= 0; i< burrito.size(); i++){

            if(burrito.get(i).contains("al")){
               order++;
            }
                else if(!burrito.get(i).contains("n"))
                    order++;

            System.out.println("Burrito " +order +burrito);


}
}
}








