import java.util.ArrayList;
import java.util.List;

class Solution {
  public static void main(String[] args) {
    int n=4;
    int k = 2;
    System.out.println(combine(n,k));
 }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combinations(list, n, k, 1, new ArrayList<Integer>());
        return list;
    }

    public static void combinations(List<List<Integer>> list, int n, int k, int start, List<Integer> list1) {
        if (list1.size() == k) {
            list.add(new ArrayList<Integer>(list1));
            return;
        }
        for (int i = start; i <= n; i++) {
            list1.add(i);
            combinations(list, n, k, i + 1, list1);
            list1.remove(list1.size() - 1);
        }
    }

}
