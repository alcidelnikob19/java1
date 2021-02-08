package ru.progwards.java1.lessons.io1;

import ru.progwards.java1.lessons.arrays.DIntArray;

import  java.io. * ;
import  java.util.Scanner ;

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
public  class  CharFilter {


    private static  String  deleteFilterChars ( String  string , String  filter ) {
        StringBuilder StringBuilder =  new  StringBuilder ();
        int l = string.length();
        DIntArray stringBuilder;
        for (int i = 0; i < l; i ++ ) {
           if (filter.indexOf (string.charAt (i)) <  0 )
            StringBuilder.append(string. charAt (i));
        }
        return StringBuilder.toString();
    }

    public  static  void  filterFile ( String  inFileName , String  outFileName , String  filter ) {
        try (FileReader fileReader = new FileReader(inFileName)) {
            try (Scanner scanner = new scanner(fileReader)) {
                FileWriter fileWriter = new FileWriter(outFileName);
                try {
                    while (scanner.hasNextLine()) {
                        String str = scanner.nextLine();
                        str = deleteFilterChars(str, filter);
                        fileWriter.write(str);
                    }
                } finally {
                    fileWriter.close();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public  static  void  main ( String [] args ) {
        filterFile ( " D:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\CharFile.txt " ,
                " D:\\Java\\PR\\src\\ru\\progwards\\java1\\lessons\\io1\\CharFileO.txt " , " - ,. () " );
    }
}