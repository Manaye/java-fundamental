import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
   public static List<String> votes = new ArrayList<>();
    public static String winner = "";
    public String getGreeting() {
        return "Hello world.";
    }

            public static void main(String[] args) {
            System.out.println(getMaxValue(new int[]{1, 2, 3, 4}));
            System.out.println(getMinValue(new int[]{1, 2, 3, 4}));
            iterateArrayofArray();
        }

        public static int getMaxValue(int[] array) {
            Arrays.sort(array);
            int max = array[array.length - 1];
            return max;
        }

        public static int getMinValue(int[] array) {
            Arrays.sort(array);
            int min = array[0];
            System.out.println(min);
            return min;
        }
    public static String tally(List<String> votes){

        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        return  "bush recived the most votes!";
    }
        public static String iterateArrayofArray() {
            int[][] weeklyMonthTemperatures = new int[][]{
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}};

            HashSet<Integer> h = new HashSet();

            for(int i = 0; i < weeklyMonthTemperatures.length; ++i) {
                for(int j = 0; j < weeklyMonthTemperatures[i].length; ++j) {
                    System.out.println(weeklyMonthTemperatures[i][j]);
                    h.add(weeklyMonthTemperatures[i][j]);
                }
                    HashMap<String,Integer>tallies = new HashMap<>();
                for (String vote : votes){
                    if (tallies.containsKey(vote)) {
                        tallies.put(vote, tallies.get(vote) + 1);
                    }
                    else{
                        tallies.put(vote,1);

                        }
                      int highstVote = 0;
                     String winner = "";

                    for (String key : tallies.keySet()){
                        if (tallies.get(key)>highstVote){
                            highstVote = tallies.get(key);
                            winner = key;
                        }

                        }


                        }

                }
            return "received the most votes!";
            }


        }


