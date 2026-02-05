public class ClassAverage{
    public static void main(String[] args){
    System.out.println(calculateClassAverage(2,25,98));
    }

public static double calculateClassAverage(double score1, double score2) {
    return (score1 + score2) / 2;
}

public static double calculateClassAverage(double score1, double score2, double score3) {
    return (score1 + score2 + score3) / 3;
}

public static double calculateClassAverage(double[] scores) {
    double total = 0;
    for (double score : scores) {
        total += score;
    }
    return total / scores.length;
}
}