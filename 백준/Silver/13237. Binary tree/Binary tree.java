import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 노드의 수를 읽어온다
        int[] parents = new int[n]; // 각 노드의 부모 정보를 저장할 배열
        List<List<Integer>> tree = new ArrayList<>(); // 트리 구조를 저장할 리스트
        int root = -1;

        for (int i = 0; i < n; i++)
        {
            tree.add(new ArrayList<>());
        }

        // 부모 정보를 읽어와서 트리를 구성한다
        for (int i = 0; i < n; i++)
        {
            parents[i] = scanner.nextInt();
            if (parents[i] == -1)
            {
                root = i + 1; // 루트 노드를 찾는다
            }
            else
            {
                tree.get(parents[i] - 1).add(i + 1); // 자식 노드를 추가한다
            }
        }

        // 각 노드의 높이를 저장할 배열
        int[] heights = new int[n];
        Arrays.fill(heights, -1); // 초기화 (미계산 노드는 -1로 설정)

        // BFS를 이용해 노드의 높이를 계산한다
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{root, 0}); // {노드, 높이}

        while (!queue.isEmpty())
        {
            int[] current = queue.poll();
            int node = current[0];
            int height = current[1];
            heights[node - 1] = height; // 높이를 0-based 인덱스로 저장

            for (int child : tree.get(node - 1))
            {
                queue.offer(new int[]{child, height + 1});
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(heights[i]);
        }

    }
}
