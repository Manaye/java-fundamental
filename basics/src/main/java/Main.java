import java.time.LocalDateTime;

public class Main {

        public static void main(String[] args) {
            clock();
            String greeting = "Welcome to my Java program.";
            System.out.println(greeting);

            int x = 7;
            float f = 42.3f;
            double d = 42.3;

            // execute the function called "loopTo" and pass 10 as a parameter
            loopTo(10);

            int four = 4;
            int result = multiplyByTwo(four);
            System.out.println(four + " doubled is " + result);
        }

        // Functions that return nothing have a return type of "void"
        public static void loopTo(int max) {
            for (int i = 0; i < max; i++) {
                System.out.println("Loop #" + i);
            }
        }

        // This function has a return type of "int"
        public static int multiplyByTwo(int n) {
            return n * 2;
        }

        public static String pluralize(String word, int value) {
            if (value < 0) {
                return word;
            } else {
                return word + "s";
            }
        }

        public static void flipNHeads(int n) {
            for (int i = 0; i < n; i++) {
                if (Math.random() < 0.5) {
                    System.out.println("tails");
                } else {
                    System.out.println("heads");
                }

            }


        }
    public static String padTime(int time){
        if (time<10)return "0" + time;
        else return "" + time;
    }
    public static void clock(){
        LocalDateTime startTime = LocalDateTime.now();
        int startHour = startTime.getHour();
        int startMinute= startTime.getMinute();
        int startSecond= startTime.getSecond();
        LocalDateTime now;
        System.out.println(padTime(startHour)+':'+padTime(startMinute)+':'+padTime(startSecond));
        while (true){
            now =  LocalDateTime.now();
            int currentHour = now.getHour();
            int currentMinute = now.getMinute();
            int currentSecond = now.getSecond();
            if (currentHour!= startHour || currentMinute!=startMinute||currentSecond!=startSecond){
                System.out.println(padTime(currentHour)+':'+padTime(currentMinute)+':'+padTime(currentSecond));
            }
            startHour = currentHour;
            startMinute= currentMinute ;
            startSecond=currentSecond;
        }
    }
}

