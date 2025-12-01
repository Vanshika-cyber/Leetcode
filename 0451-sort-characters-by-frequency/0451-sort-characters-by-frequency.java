class Solution {
    public String frequencySort(String s)
    {
         int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder[] buckets = new StringBuilder[s.length() + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new StringBuilder();
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                buckets[freq[i]].append((char) i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            for (char c : buckets[i].toString().toCharArray()) {
                for (int j = 0; j < i; j++) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

}