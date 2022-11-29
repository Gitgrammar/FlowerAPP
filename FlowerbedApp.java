import java.util.*;

public class FlowerbedApp {
public static void main(String[] args) {
    System.out.print("何色の花にしますか?>>");
    Scanner sc=new Scanner(System.in);
    String color=sc.next();
    System.out.print("タネをいくつ植えますか>>");
    int kinds=sc.nextInt();
    int water=0;
   while(true){
     System.out.print("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>>");

   int select=sc.nextInt();
   
   switch(select){
    case 1:
    {
       
        System.out.println(water+"杯水を組みました");
        water++;
    }
    case 2:
    {
        if( water==0){
            System.out.println("水が空っぽです。");
            break;
        }
        System.out.println("水を播きました");
       
        
    }
   }
}
}    
}

