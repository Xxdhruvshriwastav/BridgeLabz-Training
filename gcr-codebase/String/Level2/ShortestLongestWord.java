public class ShortestLongestWord {

    public static int[] findShortLong(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = min;

        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            min = Math.min(min, len);
            max = Math.max(max, len);
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {

        String[][] words = {
                { "Java", "4" },
                { "Programming", "11" },
                { "Is", "2" }
        };

        int[] result = findShortLong(words);

        System.out.println("Shortest Length = " + result[0]);
        System.out.println("Longest Length = " + result[1]);
    }
    
}
