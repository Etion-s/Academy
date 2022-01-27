package jan25;

import java.util.TreeSet;

public class TreeSet_Ex1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        score = scores.first();
        System.out.println("가장낮은점수: "+score);

        score = scores.last();
        System.out.println("가장높은점수: "+score);
    }
}
