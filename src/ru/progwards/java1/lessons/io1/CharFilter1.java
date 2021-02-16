package ru.progwards.java1.lessons.io1;

//import java.io.FileReader;
//import java.io.IOException;
//import java.io.*;
//import java.util.Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
        Создать статический метод
public static void filterFile (String inFileName, String outFileName, String filter)
        , в котором прочитать файл inFileName и удалить символы,
        содержится в String filter, результат записать в выходной файл.
        В случае возникновения ошибки, пробросить стандартное исключение выше, корректно закрыв все ресурсы
        Например файл содержит:
        Java - строго типизированный объектно-ориентированный язык программирования, используемый компанией Sun Microsystems (в последующем приобретённой компании Oracle).
        непристойный = "- ,. ()"
        Должен выдать результат:
        JavaстроготипизированныйобъектноориентированныйязыкпрограммированияразработанныйкомпанияSunMicrosystemsвпоследующемприобретённойкомпаниейOracle
        */
public class CharFilter1 {
    private static String deleteFilterChars(String string, String filter) {
        StringBuilder stringBuilder = new StringBuilder();
        int l = string.length();

        for (int i = 0; i < l; i++) {
            if (filter.indexOf(string.charAt(i)) < 0)
                stringBuilder.append(Boolean.parseBoolean(String.valueOf(string.charAt(i))));
        }
        return stringBuilder.toString();
    }


    public static void filterFile(String inFileName, String outFileName, String filter) throws IOException {
        FileReader fileReader = new FileReader(inFileName);
        Scanner scanner = new Scanner(fileReader);
            FileWriter fileWriter = new FileWriter(outFileName);
            StringBuilder str_out = new StringBuilder();
            try

            {
                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();
                    str = deleteFilterChars(str, filter);
                    fileWriter.write(str);
                }
            }
            finally

            {
                fileReader.close();
                fileWriter.close();

            }
        }

        public static void main (String[]args ){
        try {

            filterFile("D:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\CharFile.txt",
                    "D:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\CharFileO.txt", " - ,. () ");
        }
        catch (IOException e)
        {e.printStackTrace();
        }
    }
    }
