/**
 * Flowerbed
 */
public class Flowerbed {


    final int MAXWATER=3;
    String color;
    int seedNum;
    int bloom;
    int water;

    public Flowerbed(String color,int seedNum){
        this.color=color;
        this.seedNum=seedNum;
        this.bloom=bloom;
    }
    void fillWater(){
        int water=0;
        if (water==0){
            System.out.println("水がありません。");

        }
        else {
        water++;
        System.out.println(water+"杯水をくみました。");
        }
    }
    void water(){
        int sprinkle=0;
        sprinkle++;
        System.out.println(sprinkle+"水を播きました");
    }
}