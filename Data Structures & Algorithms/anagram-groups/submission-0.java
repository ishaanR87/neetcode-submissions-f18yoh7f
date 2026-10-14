class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map <String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            result.putIfAbsent(sortedKey, new ArrayList<>());
            result.get(sortedKey).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
