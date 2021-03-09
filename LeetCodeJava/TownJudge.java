

public class TownJudge {
    // https://leetcode.com/problems/find-the-town-judge/
    public static void main(String[] args) {
        
        // String s = "[[1,3],[1,4],[2,3],[2,4],[4,3]]".replaceAll("\\[", "\\{").replaceAll("\\]", "\\}");
        // System.out.println(s);
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int n = 4;

        System.out.println(findJudge(n, trust));
    }

    private static int findJudge(int n, int[][] trust){
        int[] isTrusted = new int[n + 1];

        for(int[] person : trust){
            isTrusted[person[0]]--;
            isTrusted[person[1]]++;
        }

        for(int i = 1; i <= n; i ++){
            if(isTrusted[i] == n-1) return i;
        }

        return -1;
    }
}
