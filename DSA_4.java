import java.util.HashMap;
import java.util.Map;

public class DSA_4 {

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for(int num: nums){
            int freq = freqMap.getOrDefault(num,0)+1;
            freqMap.put(num,freq);
            maxFreq = Math.max(maxFreq,freq);

        }
        int count = 0;
        for(int freq:freqMap.values()){
            if(freqMap.get(freq) == maxFreq){
                count++;
            }
        }
        return count;
        
    }
    public static void main(String args[]){
        int[] nums = {1,1,1,2,3,3,4};
        System.out.println(maxFrequencyElements(nums));
    }
}

