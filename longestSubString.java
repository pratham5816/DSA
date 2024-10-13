package javaDSAfreeCodeCamp;

import java.util.HashMap;
import java.util.Map;

public class longestSubString {
    public int LengthOfLongestSubString(String s){
        Map<Character , Integer> map = new HashMap();
        int maxLength = 0;
        int start = 0;

        for(int end = 0; end < s.length(); end++){
            char rightChar = s.charAt(end);
            if(map.containsKey(rightChar)){
                start = Math.max(start , map.get(rightChar) + 1);
            }
            map.put(rightChar ,end);
            maxLength = Math.max(maxLength , end - start + 1);
        }

        return maxLength;
    }
}
