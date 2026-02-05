public class GradeReport{
    public static void main(String[] args){
        executeGradeReport(67);
    }




public static void executeGradeReport(double score) {
    if (!validateScore(score)) {
        System.out.println("Invalid Score");
        return;
    }
    char grade = calculateLetterGrade(score);

    displayPerformanceMessage(grade);
}

    public static boolean validateScore(double score) {
        if (score >= 0 && score <= 100) {
            return true;
        } else {
            return false;
        }
    }

    public static char calculateLetterGrade(double score) {
            if (score >= 80) return 'A';
            else if (score >= 70) return 'B';
            else if (score >= 60) return 'C';
            else if (score >= 50) return 'D';
            else if (score >= 40) return 'E';
            else return 'F';
    }

    public static void displayPerformanceMessage(char grade) {
            System.out.println("You had grade " + grade);
        }
    }