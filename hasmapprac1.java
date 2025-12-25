import java.util.HashMap;
import java.util.HashSet;

public class hasmapprac1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(map.contains(i)){
                System.out.println("the number "+arr[i]+" more than once");
            }
        }
        System.out.println("no number is more than once");
    }
}
