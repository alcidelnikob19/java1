package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        Double pi=3.14;
        Double V = 4.0/3.0*pi*(radius*radius*radius);
        return V;
    }


    public static float volumeBallFloat(float radius){
        float pi= (float) 3.14;
//        return (float) volumeBallDouble(6371.2);
        float V = (float) (4.0/3.0*pi*(radius*radius*radius));
        return V;
}

    public static double calculateAccuracy(double radius){
        Float temp =volumeBallFloat((float) 6371.2);
        double str = (double)temp;
        //double str2 = Double(parseDouble(str));
        double raz=volumeBallDouble(6371.2)-str;
        return raz;
    }
    public static void main (String[]args){

        System.out.println(volumeBallDouble( 6371.2));
        System.out.println(volumeBallFloat((float) 6371.2));
        System.out.println(calculateAccuracy(6371.2));
    }
}
