//digit by digit simulation with carry

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class pattern1 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={3,4,5};
        int carry=0;
        int i=0;
        int j=0;
        int arr1max=arr1.length;
        int arr2max=arr2.length;
        ArrayList<Integer>list=new ArrayList<>();
        while(i!=arr1max||j!=arr2max||carry!=0){
            int sum=carry;
            if(i!=arr1max){
                sum+=arr1[i];
                i++;
            }
            if(j!=arr2max){
                sum+=arr2[j];
                j++;
            }
            int digit=sum%10;
            carry=sum/10;
            list.add(digit);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
