/**
 * Flowerbed
 */
public class Flowerbed {


    final int MAXWATER=3;
    String color;
    int seedNum;
    int bloom;
    int water;

    public Flowerbed(String color,int seedNum,int bloom,int water){
        this.color=color;
        this.seedNum=seedNum;
        this.bloom=bloom;
        this.water=0;
    }

    void fillWater(){
        
        if (water==0){
          System.out.println("水がありません。");

        }else if(water>4)
        {
        System.out.println("もう水はくめません。");
        }
        else{
            water++;
            System.out.println(water+"杯水をくみました。");

        }
    }
    void water(){
        if( water==0){
            System.out.println("水が空っぽです。");}
        else{   
        water--;
        System.out.println(water+"水を播きました");
        }
    }
}