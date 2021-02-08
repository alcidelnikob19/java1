package ru.progwards.java1.lessons.io1;
import java.util.Arrays;
import  java.io.*;
/*
        Создать статический метод
public static void codeFile (String inFileName, String outFileName, char [] code, String logName)
        , в котором прочитать файл inFileName и перекодировать его посимвольно
        в соответствии с заданным шифром, результат записать в outFileName.
        Шифр задается маcсивом char [] code, где каждому символу символу оригинального
        соответствует символ code [(int) symbol] выходного файла.
        В случае ошибок в файле с именем logName вывести название ошибки через метод класса Exception - getMessage ()
        */

public class Coder
{
    public static void toLog(String logName, String msg)
    {
        System.out.println(msg);
        try
        {
            FileWriter log = new FileWriter(logName, true);
//
            try
            {
                log.write(msg + "\n");
            } finally
            {
                log.close();
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void codeFile(String inFileName, String outFileName,
                                char[] code, String logName)
    {
        try
        {
            FileInputStream reader = new FileInputStream(inFileName);
            FileOutputStream writer = new FileOutputStream(outFileName);

            try
            {
                byte[] bytes = reader.readAllBytes();
                System.out.println(Arrays.toString(bytes));

                for (int i = 0; i < bytes.length; i++)
//          if (bytes[i] < code.length)
                    bytes[i] = (byte) code[bytes[i]];
//          else
//            bytes[i] = (byte) '';

                writer.write(bytes);
//        System.out.println(Arrays.toString(bytes));


            } finally
            {
                writer.close();
                reader.close();
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e)
        {
            toLog(logName, e.getMessage());
        }

    }

    public static void main(String[] args)
    {
//=====
        char[] code = new char[256];
        Arrays.fill(code, ' ');

        for (int i = 48; i < 58; i++)
            code[i] = (char) (i + 16);
//-----

        codeFile("d:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\qyqy9.txt", "d:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\dydy.txt", code, "d:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\log.txt");
    }

}