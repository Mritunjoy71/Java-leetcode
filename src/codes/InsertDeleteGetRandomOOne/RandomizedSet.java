package codes.InsertDeleteGetRandomOOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    private HashMap<Integer, Integer> hashMap;
    private List<Integer> list;

    public RandomizedSet() {
        this.hashMap = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int val) {
        boolean res = hashMap.containsKey(val);
        if (!res){
            hashMap.put(val,list.size());
            list.add(val);
        }
        return !res;
    }

    public boolean remove(int val) {
        boolean res = hashMap.containsKey(val);
        if (res){
            int index = hashMap.get(val);
            int lastIndex = list.size()-1;
            int lastVal = list.get(lastIndex);
            list.set(index,lastVal);
            list.remove(lastIndex);
            hashMap.put(lastVal,index);
            hashMap.remove(val);

        }
        return res;
    }

    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
