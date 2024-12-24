import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        subject[] list = new subject[20];
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < 20; i++) {
            String n = in.next();
            double t = in.nextDouble();
            String g = in.next();
            list[i] = new subject(n, t, g);
            if(list[i].getCounting()){
                sum += list[i].getMathGrade() * list[i].getTime();
                cnt += list[i].getTime();
            }
        }
        if (cnt > 0) {
            System.out.printf("%f", sum / cnt);
        }
    }

    public static class subject {
        String name;
        double time;
        String grade;
        double mathGrade;
        boolean counting = true;

        public subject(String name, double time, String grade){
            this.name = name;
            this.time = time;
            this.grade = grade;
            switch(this.grade){
                case "A+":
                    this.mathGrade = 4.5;
                    break;
                case "A0":
                    this.mathGrade = 4.0;
                    break;
                case "B+":
                    this.mathGrade = 3.5;
                    break;
                case "B0":
                    this.mathGrade = 3.0;
                    break;
                case "C+":
                    this.mathGrade = 2.5;
                    break;
                case "C0":
                    this.mathGrade = 2.0;
                    break;
                case "D+":
                    this.mathGrade = 1.5;
                    break;
                case "D0":
                    this.mathGrade = 1.0;
                    break;
                case "F":
                    this.mathGrade = 0.0;
                    break;
                default:
                    this.counting = false;
                    break;
            }
        }

        public boolean getCounting() {
            return counting;
        }

        public double getMathGrade() {
            return mathGrade;
        }

        public double getTime() {
            return time;
        }
    }
}