import java.util.HashMap;
import java.util.Map;

public class FrequencyProblem {
    public static void main(String[] args) {
        int arr[] = {1,1,5,3,4,3,3,5};
        String str = "GangserParadise";
        findFrequecyInSting(str);
    }

    public static  void findFrequencyBruteForce(int arr[]){
        /*
        *
        * TC of this approach is O(n^2)
        *
        * */
        boolean visited[] = new boolean[arr.length];

        for(int i = 0 ; i< arr.length; i++){
            if(visited[i]==true){
                continue;
            }
            int count= 1;
            for(int j = i+1;j< arr.length;j++ ){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i] + "->" + count);
        }

    }

    public static void findFrequencyOptimalSol(int arr[]){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }
            else {
                map.put(arr[i],1 );
            }
        }

        for(Map.Entry<Integer,Integer> entery : map.entrySet()){
            System.out.println(entery.getKey() + "->"+entery.getValue());
        }
    }

    public static void findFrequecyInSting(String str){
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i< ch.length; i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else {
                map.put(ch[i],1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
