import java.util.*;
import java.util.stream.Stream;

class Solution
{

    public int[] solution(String[] genres, int[] plays)
    {
        HashMap<String, Integer> genreMap = new HashMap<>();
        HashMap<String, List<int[]>> playMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++)
        {
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0) + plays[i]);
            playMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{plays[i], i});
        }

        List<Integer> answer = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sortedGenre = genreMap.entrySet().stream().sorted(((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue())));

        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = playMap.get(entry.getKey()).stream().sorted((o1, o2) -> Integer.compare(o2[0], o1[0])).limit(2);
            sortedSongs.forEach(song -> answer.add(song[1]));
        });


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}