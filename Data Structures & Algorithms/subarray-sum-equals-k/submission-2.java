class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
           prefixSum = prefixSum + nums[i];

           if (map.containsKey(prefixSum - k)) {
            count = count + map.get(prefixSum - k);
           }
           int freq = map.getOrDefault(prefixSum, 0);
           map.put(prefixSum, freq + 1);
        }
        return count;
    }
}