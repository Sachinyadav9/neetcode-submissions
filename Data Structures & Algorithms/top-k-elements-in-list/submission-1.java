class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer , Integer> hashmap = new HashMap<>();
        for(Integer value : nums){
            if(hashmap.containsKey(value)){
                hashmap.put(value, hashmap.get(value)+1);   
            }
            else{
                hashmap.put(value, 1);
            }

        }

        TreeSet<Map.Entry<Integer , Integer>> tree = new TreeSet<>(
            Comparator.<Map.Entry<Integer , Integer> , Integer>comparing(Map.Entry::getValue)
            .reversed()
            .thenComparing(Map.Entry::getKey)
        );

        tree.addAll(hashmap.entrySet());
        int[] result = tree.stream().limit(k).mapToInt(Map.Entry::getKey).toArray();
       return result;
    }
}
