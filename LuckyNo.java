import java.util.Random;
class LuckyNo {
    public static void main(String[] args) {
        Random rand = new Random();
        
//      int lucky = rand.nextInt(10);
//      int lucky = -1 - rand.nextInt(10);
        int lucky = 10 + rand.nextInt(90);
        
        System.out.println("今日のラッキーナンバーは" + lucky + "です。");
    }
    
}
