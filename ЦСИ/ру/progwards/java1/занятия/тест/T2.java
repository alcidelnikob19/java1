package ru.progwards.java1.lessons.test;

public class T2 {
    static int addAsStrings(int n1, int n2) {
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        String s3 = s1 + s2;
        int i = Integer.parseInt(s3);

        return i;//555
    }

    public static void main(String[] args) {
        /*ystem.out.println(addAsStrings(2, 2));
       System.out.println(addAsStrings(2, 1));
        System.out.println(addAsStrings(9874, 6518));
        textGrade(5);*/
        System.out.println(factorial(55));

    }

    static long factorial(long n){
        long f = 1;
        for (long i = n; i > 1; i--)
            f *= i;
        return f;
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

   /* if (grade < 0 || grade > 100) return "не определено";
        if (grade == 0) return "не оценено";
        if (grade <= 20) return "очень плохо";
        if (grade <= 40) return "плохо";
        if (grade <= 60) return "удовлетворительно";
        if (grade <= 80) return "хорошо";
        return "отлично";*/
}

//,Оператор	Описание
//&	Логическое AND (И)
//&&	Сокращённое AND
//|	Логическое OR (ИЛИ)
//||	Сокращённое OR
//^	Логическое XOR (исключающее OR (ИЛИ))
//!	Логическое унарное NOT (НЕ)
//&=	AND с присваиванием
//|=	OR с присваиванием
//^=	XOR с присваиванием
//==	Равно
//!=	Не равно
//?:	Тернарный (троичный) условный оператор
