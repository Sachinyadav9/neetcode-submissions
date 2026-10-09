class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    HashMap<String , List<String>> hashmap = new HashMap<>();
    for (String str : strs) {

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String string = new String(arr);
       if(hashmap.containsKey(string)){
       hashmap.get(string).add(str);
       }
       else{
        hashmap.put(string, new ArrayList<>(List.of(str)));

       }

     
    }

    List<List<String>> last = new ArrayList<>();
    hashmap.forEach((key , list)-> {
        last.add(list);
    });       
        

    return last;
    }
}
