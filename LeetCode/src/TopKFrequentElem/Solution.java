package TopKFrequentElem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {-1,-1};
		System.out.println(Arrays.toString((bucketArray1(nums, 3))));
	}
	public static int[] bucketArray1(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		
		List<Integer>[] buckets = new List[nums.length+2];
		for(int i = 0; i < buckets.length; i++ ) buckets[i] =  new ArrayList<>();
		
		for(int key : map.keySet()) {
			buckets[map.get(key)].add(key);
		}
		List<Integer> result = new ArrayList<>();
		
		for(int i = buckets.length-1; i >= 0; i--) {
			result.addAll(buckets[i]);
			if(result.size() >= k) {
				for(int kElems = result.size()-1; kElems >= k; kElems--) {
					result.remove(kElems);
				}
				
			}
		}
		return result.stream().mapToInt(n -> n).toArray();
		
	}
	public static int[] bucketArray(int[] nums, int k) {
		
		Map<Integer, Integer> freq = new HashMap<>();
		
		for(int elem : nums) {
			freq.put(elem, freq.getOrDefault(elem, 0)+1);
		}
		
		List<Integer>[] buckets = new List[nums.length-1];
		for(int i = 0; i < buckets.length; i++ ) buckets[i] =  new ArrayList<>();
		
		for(int key : freq.keySet()) {
			buckets[freq.get(key)].add(key);
		}
		List<Integer> result = new ArrayList<>();
		
		for(int i = buckets.length-1; i >= 0; i--) {
			result.addAll(buckets[i]);
			if(result.size() >= k) {
				for(int kElems = result.size()-1; kElems >= k; kElems--) {
					result.remove(kElems);
				}
				
			}
		}
		return result.stream().mapToInt(n -> n).toArray();
	}
	
	public static int [] mySolution(int [] nums, int k) {
		
		//Map <K,V> == <Key, Frequency>
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for(int n : nums) {
		freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
		}
		
		@SuppressWarnings("unchecked")
		// Frequency Array | index == frequency --> each bucket contains ArrayList
		List<Integer>[] buckets = new List[nums.length+1];
		for(int i = 0;  i < buckets.length; i++) buckets[i] = new ArrayList<>(); 
		
		//Add The Keys to their corresponding frequency
		for(int key : freqMap.keySet()) {
			buckets[freqMap.get(key)].add(key);
		}
		
		//
		List<Integer> result = new ArrayList<>();
		for(int i = buckets.length-1; i >= 0; i--) {
			result.addAll(buckets[i]);
			if(result.size() >= k) {
				for(int kElems = result.size()-1; kElems >= k; kElems--) {
					result.remove(kElems);
				}
				break;
			}	
		}
		
		return result.stream().mapToInt(i->i).toArray();
		
	}

	public static int[] topKFrequentBEST(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        // bucket sort on freq
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) bucket[i] = new ArrayList();
        for (int key : freq.keySet()) {
            bucket[freq.get(key)].add(key);
        }
        // gather result
        List<Integer> res = new ArrayList<Integer>();
        for (int i = bucket.length - 1; i >= 0; i--) {
            res.addAll(bucket[i]);
            if (res.size() >= k) break;
        }
        return res.stream().mapToInt(i->i).toArray();
	}

	public static int[] topKFrequent(int[] nums, int k) {
		if (nums.length < 2) {
			return nums;
		}
		// V C
		HashMap<Integer, Integer> map = new HashMap<>();
		// size < K

		for (int n : nums) {

			if (map.containsKey(n)) {
				int temp = map.get(n);
				map.put(n, ++temp);
			} else {
				map.put(n, 1);
			}
		}

		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		Queue<Integer> list = new PriorityQueue<>();
		int kCount = 0;

		for (Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			Integer value = entry.getKey();

			if (kCount >= k) {
				break;
			}
			list.add(value);
			kCount++;
		}

		Iterator<Integer> it = list.iterator();

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = it.next();
		}

		return result;

	}
}
