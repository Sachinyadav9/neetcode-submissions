class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
        return false;
      }
        for (char ch : s.toCharArray()) {
        if(t.contains(String.valueOf(ch))){
          t =   t.replaceFirst(String.valueOf(ch), "");

        }
        else{
            System.out.println("Error ");
            return false ;
        }
        
    }
    System.out.println("All Good");
    return true;
    }
}
