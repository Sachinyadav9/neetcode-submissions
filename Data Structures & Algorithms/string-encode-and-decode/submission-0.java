class Solution {

    char delimiter = '—';
    public String encode(List<String> strs) {

        StringBuilder builder = new StringBuilder();
        strs.forEach(str -> {
            for (char a : str.toCharArray()) {
                builder.append((char) (a - 1)); 
            }
            builder.append(delimiter);
        });
        return builder.toString();
    }

    public List<String> decode(String str) {
        String[] parts = str.split(String.valueOf(delimiter), -1);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < parts.length - 1; i++) {
            StringBuilder builder = new StringBuilder();
            for (char elem : parts[i].toCharArray()) {
                builder.append((char) (elem + 1)); 
            }
            result.add(builder.toString());
        }

        return result;  
    }
}
