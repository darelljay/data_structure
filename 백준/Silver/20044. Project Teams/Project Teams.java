import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 팀 수 N
        int[] arr = new int[2 * n]; // 학생 수 2N

        // StringTokenizer로 한 줄 입력 빠르게 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬

        int[] teamSum = new int[n]; // 팀 점수 배열
        for (int i = 0; i < n; i++) {
            teamSum[i] = arr[i] + arr[arr.length - 1 - i]; // 가장 작은 + 가장 큰
        }

        // 팀 점수 중 최소값 출력
        int min = Arrays.stream(teamSum).min().getAsInt();
        System.out.println(min);
    }
}
