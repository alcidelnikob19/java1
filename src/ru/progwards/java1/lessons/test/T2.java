package ru.progwards.java1.lessons.test;

public class T2 {
    static int addAsStrings(int n1, int n2) {
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String s3 = s1 + s2;
        int i = Integer.parseInt(s3);

        return i;
    }

    public static void main(String[] args) {
        System.out.println(addAsStrings(2, 2));
        System.out.println(addAsStrings(2, 1));
        System.out.println(addAsStrings(9874, 6518));
        textGrade(5);

    }

    static String textGrade(int grade) {
        if (grade == 0)
        {
            System.out.println("не оценено");
        }

        else if (grade >= 1 && grade <= 20)  {
            System.out.println("очень плохо");
        }
        else if (grade >= 20 && grade <= 40){
            System.out.println("плохо");
        }

        else if (grade >= 41 && grade <= 60){
            System.out.println("удовлетворительно");
        }

        else if (grade >= 61 && grade <= 80){
            System.out.println("хорошо");
        }
        else if (grade >= 81 && grade <= 100){
            return "отлично";
        }
        return "нет подх знач";
    }
}



