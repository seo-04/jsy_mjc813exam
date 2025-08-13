package Programmers;

public class index_num {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        index_num index = new index_num();
        int[] nums = {1, 2, 3, -1, 4};
        System.out.println(index.solution(nums));
    }
}