class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(str);
        }
        
        return new ArrayList<>(res.values());
    }
}
