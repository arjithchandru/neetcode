class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        List<Integer> size = new ArrayList<>();

        for (String s : strs) {
            size.add(s.length());
        }

        for (int si : size) {
            result.append(si);
            result.append(',');
        }

        result.append('#');

        for (String s : strs) {
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            size.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int si : size) {
            result.add(str.substring(i, i + si));
            i += si;
        }

        return result;
    }
}
