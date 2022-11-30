/**
 * Flowerbed
 */
public class Flowerbed {


    final int MAXWATER=3;
    String color;
    int seedNum;
    int bloom;
    int water;
    int count;

    public Flowerbed(String color,int seedNum,int bloom,int water,int count){
        this.color=color;
        this.seedNum=seedNum;
        this.bloom=bloom;
        this.water=0;
        this.count=0;
    }

    void fillWater(){
       
        this.water++;
        System.out.println(water+"杯水をくみました。");
        
        if(this.water>4)
           System.out.println("もう水を組めません。");

        }
    
    void water(){
        if( this.water==0){
            System.out.println("水が空っぽです。");}
        else{   
        this.count++;
        System.out.println(water+"杯水を播きました");
        }
    }
    void observe(){
        if(this.count>3){
            System.out.printf("立派な%sの色の花が咲きました。\n",color);
        }
        else{
            System.out.println("まだ花が咲くには水が足りません。");
            
        }
    }
}