package leetcode;

import java.util.*;

class TimeValue{
    int time;
    String value;
    public TimeValue(int time, String value){
        this.time = time;
        this.value = value;
    }
}

public class TimeMap
{
    public TimeMap() { }

    Map<String, List<TimeValue>> map = new HashMap<>();


    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        List<TimeValue> list = map.get(key);
        list.add(new TimeValue(timestamp, value));
    }
    

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<TimeValue> list = map.get(key);
        
        int left = 0, right = list.size() - 1;
        
        while(left + 1 < right){
            int mid = (left + right) / 2;
            TimeValue midTimeValue = list.get(mid);
            if(midTimeValue.time == timestamp){
                return midTimeValue.value;
            }else if(midTimeValue.time < timestamp){
                left = mid;
            }else{
                right = mid;
            }
        }
        
        if(list.get(right).time <= timestamp){
            return list.get(right).value;
        }else if(list.get(left).time <= timestamp){
            return list.get(left).value;
        }else{
            return "";
        }
    }


}
