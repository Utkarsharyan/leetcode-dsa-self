import java.util.HashMap;

public class array11slidingwindow {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println("Maximum fruits collected: " + totalFruit(fruits));
    }
    public static int totalFruit(int[]fruits){
        int l=0;
        int maxlen=0;
        HashMap<Integer,Integer>basket=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            basket.put(fruits[r], basket.getOrDefault(basket.get(fruits[r]), 0)+1);
            while(basket.size()>2){
                basket.put(fruits[l], basket.get(fruits[l])-1);
                if(basket.get(fruits[l])==0){
                    basket.remove(fruits[l]);
                }
                l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}
