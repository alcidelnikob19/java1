package ru.progwards.java1.lessons.bitsworld;
/*  Создайте метод, возвращающий значение enum Grade по числовой оценке.
        Сигнатура метода static Grade intToGrade(int grade)
        Соответствие оценок
    1 - VERYBAD
    2 - BAD
    3 - SATISFACTORILY
    4 - GOOD
    5 - EXCELLENT
    все остальное NOTDEFINED
        Например, intToGrade(4) должно вернуть GOOD*/
public class l5 {
    public static void main(String[] args) {
        byte value =12;
        int result = value & 1;
        System.out.println(result);

//        System.out.println(intToGrade(3));
//        System.out.println(intToGrade(0));
    }


    enum Grade {VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED}
    static Grade intToGrade(int grade) {
        switch (grade) {
            case 1: return Grade.VERYBAD;
            case 2: return Grade.BAD;
            case 3: return Grade.SATISFACTORILY;
            case 4: return Grade.GOOD;
            case 5: return Grade.EXCELLENT;
            default: return Grade.NOTDEFINED;
        }
    }

}

