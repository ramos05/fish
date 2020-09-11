import java.util.ArrayList;

public class FishTank {


    public static void main(String[] args) {

        ArrayList<Fish> fishTank = new ArrayList();


        Fish theFish;
        Fish aFish = new Fish(10, 2, "Red");
        aFish.color = "красную";
        aFish.weight = 2;
        fishTank.add(aFish);
        aFish = new Fish(100, 42, "Wite");
        aFish.color = "purple";
        aFish.weight = 12;
        fishTank.add(aFish);
//        fishTank.remove(aFish);
//        fishTank.set(0,aFish);
        aFish = new Fish("Blue");
        aFish.color = "зеленую";
        aFish.weight = 5;
        fishTank.add(aFish);

        int fishCount = fishTank.size();
        for (int i = 0; i < fishCount; i++) {
            theFish = fishTank.get(i);
            System.out.println("Поймал " + theFish.color + " рыбу с весом " + theFish.weight + " кг. Глубина:" + theFish.currentDepth);


//            System.out.println(fishTank.get(2));


        }

    }
}
