public class Grades {
    int[] grades;

    public Grades(int[] grades) {
    this.grades = grades;
    }
}
    public double avarageGrades() {
        int sum;
        for (int i = 0; i <= grades.length; i++) {
            sum += i ;
        }
        return sum;
}