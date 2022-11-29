import java.util.*;

public class FlowerbedApp {
public static void main(String[] args) {
    System.out.print("何色の花にしますか?>>");
    Scanner sc=new Scanner(System.in);
    String color=sc.next();
    System.out.print("タネをいくつ植えますか>>");
    int kinds=sc.nextInt();
    Flowerbed fb=new Flowerbed(color, kinds, kinds, kinds);

    int water=0;
    boolean flag=true;
   while(flag==true){
     System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>>");

   int select=sc.nextInt();
   
   switch(select){
    case 1:
    {
        fb.fillWater();
        break;
        
    }
    case 2:
    {
      fb.water();
      break;
        
    }
    case 3:
    {
        if(water>3){
            System.out.printf("立派な%sの色の花が咲きました。\n",color);
        }
        else{
            System.out.println("まだ花が咲くには水が足りません。");
            break;
        }
    }
    case 4:{
        System.out.println("アプリケーションを終了します。");
        flag=false;
        break;
        
    }
  
    
   }
  
}
}    
}

