package ru.progwards.java1.lessons.basics;

    public class ReverseDigits {

        public static int reverseDigits(int number){
            int z= number % 10;
            int z1= (number-z) / 10;
            int z4= z1%10;
            int z2= z1/10;

            //while (( number- z1*10)/ 10) != 0)


            System.out.print(z);
          System.out.print(z4);
           System.out.print(z2);
            String str = Integer.toString(z);
            String str4 = Integer.toString(z4);
            String str2 = Integer.toString(z2);
            String str5 = str+str4+str2;
            int i = Integer.parseInt(str5);

            return i;

        }
        public static void main (String[]args) {
            reverseDigits(825);

        }
        }
