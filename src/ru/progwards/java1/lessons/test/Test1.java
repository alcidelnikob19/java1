package ru.progwards.java1.lessons.test;

public class Test1 {
    public static void main(String[] args){
        String S1="Сделаю коммит, запушу в репо: робот, проверяй теперь всё это...";
        System.out.println(S1);
        long Vital=171_151_450;
        System.out.print(Vital);
    }
}
/*
Создайте класс Calculator, содержащий

приватную переменную int result;
конструктор по умолчанию, устанавливающий result = 0;
публичную функцию set(int num), устанавливающую значение result равный num
публичную функцию add(int num), увеличивающую result на num
публичную функцию sub(int num), уменьшающую result на num
публичную функцию int getResult()
Answer:(penalty regime: 10, 20, ... %)

Отзыв
Test	Expected	Got
calculator.add(1)
1
1
calculator.sub(5)
-4
-5
calculator.set(312)
312
312
Your code must pass all tests to earn any marks. Try again.

Неверно
Баллы за эту попытку: 0,00/1,00.
Вопрос 2
Верно
Баллов: 1,00 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Отметьте, какие утверждения относительно классов являются верными



Выберите один или несколько ответов:
a. Классы позволяют сделать программный код более понятным и читаемым для программиста
b. Классы структурируют программный код, облегчая его разработку
c. Классы позволяют компилятору Java разобраться в устройстве этого мира
d. Классы, это градация программного кода по старшинству исполнения
e. Классы позволяют отобразить объекты реального мира в язык понятный компьютеру
Отзыв
Ваш ответ верный.
Правильные ответы: Классы позволяют отобразить объекты реального мира в язык понятный компьютеру, Классы позволяют
сделать программный код более понятным и читаемым для программиста , Классы структурируют программный код, облегчая его разработку
Вопрос 3
Частично правильный
Баллов: 0,67 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Отметьте верные утверждения

Выберите один или несколько ответов:
a. Конструктор потомка всегда вызывает конструктор родителя
b. При наследовании у потомка может быть более одного родителя
c. Конструктор не наследуется, как другие методы
d. Наследование это обретение классом-потомком свойств класса-родителя
e. Потомок не может иметь собственных свойств и методов
f. Конструктор родителя вызывается в произвольном месте конструктора потомка
Отзыв
Ваш ответ частично правильный.
Вы правильно выбрали 2.
Правильные ответы: Наследование это обретение классом-потомком свойств класса-родителя, Конструктор не наследуется,
 как другие методы, Конструктор потомка всегда вызывает конструктор родителя
Вопрос 4
Частично правильный
Баллов: 0,33 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Укажите верные утверждения

Выберите один или несколько ответов:
1. Инкапсуляция позволяет скомпилировать класс в отдельный файл-капсулу
2. Инкапсуляция - это объединение нескольких классов в пул
3. Инкапсуляция позволяет представить объект реального мира в виде класса с его свойствами и действиями
4. Инкапсуляция - это объединение переменных и методов в одном классе
5. Инкапсуляция позволяет программисту ограничить доступ к переменным и функциям класса
Отзыв
Ваш ответ частично правильный.
Вы правильно выбрали 1.
Правильные ответы: Инкапсуляция - это объединение переменных и методов в одном классе, Инкапсуляция позволяет
представить объект реального мира в виде класса с его свойствами и действиями, Инкапсуляция позволяет программисту
ограничить доступ к переменным и функциям класса
Вопрос 5
Верно
Баллов: 1,00 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Выберите соответствие модификатора доступа и видимости метода, описанного с этим модификатором

"по умолчанию"

Ответ 1
Внутри класса; другой класс, тот же package

protected

Ответ 2
Внутри класса; другой класс, тот же package; наследование в другом package

public

Ответ 3
Внутри класса; другой класс, тот же package; наследование в другом package; другой класс в другом package

private

Ответ 4
Внутри класса

Отзыв
Ваш ответ верный.
Правильный ответ: "по умолчанию" → Внутри класса; другой класс, тот же package, protected → Внутри класса; другой класс,
 тот же package; наследование в другом package, public → Внутри класса; другой класс, тот же package; наследование в другом package;
 другой класс в другом package, private → Внутри класса
Вопрос 6
Неверно
Баллов: 0,00 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Создайте классы Point2D, Point3D, в одном окошке, последовательно один, за другим

Класс Point2D - точка с 2-мя координатами, содержит

переменные int x; int y;
конструктор с параметрами int x, int y, устанавливающий соответствующие переменные
переопределение функции toString(), которая должна возвращать результат в формате х,у, например 23,12
Класс Point3D - точка с 3-мя координатами

наследуется от Point2D
содержит приватную переменную int z;
конструктор с параметрами int x, int y, int z, вызывающий конструктор родителя и устанавливающий соответствующую свою переменную
переопределение функции toString(), которая должна возвращать результат в формате х,у,z, например 23,12,37 для этого вызывать функцию toString() родителя внутри себя


Answer:(penalty regime: 10, 20, ... %)

Отзыв
Syntax Error(s)
__tester__.java:30: error: cannot find symbol
        Int x1=x;
        ^
  symbol:   class Int
  location: class __tester__.Point3D
__tester__.java:30: error: x has private access in __tester__.Point2D
        Int x1=x;
               ^
__tester__.java:31: error: x has private access in __tester__.Point2D
        return x+ "@"+y;
               ^
__tester__.java:31: error: y has private access in __tester__.Point2D
        return x+ "@"+y;
                      ^
__tester__.java:34: error: non-static variable this cannot be referenced from a static context
        Point3D p1=new Point3D(5,5,6);
                   ^
__tester__.java:36: error: x has private access in __tester__.Point2D
        System.out.println(p1.x);
                             ^
__tester__.java:33: error: Illegal static declaration in inner class __tester__.Point3D
    public static void main(String[] args) {
                       ^
  modifier 'static' is only allowed in constant variable declarations
7 errors
Неверно
Баллы за эту попытку: 0,00/1,00.
Вопрос 7
Верно
Баллов: 1,00 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Создайте класс Person, содержащий

приватную переменную String name;
приватную переменную int age;
приватную переменную String country;
конструктор по умолчанию, устанавливающий country = "RU";
конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию, и устанавливающий значения переменным
name и age из соответствующих параметров;
публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения соответствующих переменных
Answer:(penalty regime: 10, 20, ... %)

Отзыв
Test	Expected	Got
person.getName()
Вася
Вася
person.getAge()
25
25
person.getCountry()
RU
RU
Passed all tests!

Верно
Баллы за эту попытку: 1,00/1,00.
Вопрос 8
Частично правильный
Баллов: 0,67 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Укажите верные утверждения относительно конструктора

Выберите один или несколько ответов:
1. Имя конструктора совпадает с именем класса
2. Конструктор не может иметь параметров
3. В классе может присутствовать только один конструктор
4. Конструктор это особый метод, выделяющий память под создаваемый экземпляр (объект) и инициализирующий переменные этого объекта
5. Конструктор по умолчанию это конструктор без параметров
Отзыв
Ваш ответ частично правильный.
Вы правильно выбрали 2.
Правильные ответы: Конструктор по умолчанию это конструктор без параметров, Имя конструктора совпадает с именем класса,
 Конструктор это особый метод, выделяющий память под создаваемый экземпляр (объект) и инициализирующий переменные этого объекта
Вопрос 9
Частично правильный
Баллов: 0,25 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Выберите верные утверждения

Выберите один или несколько ответов:
a.
Аннотация @Override позволяет нам исключить ошибки в сигнатуре при переопределении методов
b. Полиморфизм в информатике это  явление прерывистого и одновременного морфологического различия между особями или группами
 особей в популяции какого либо вида без изолирующих репродуктивных механизмов
c.
Наследование позволяет писать код без дублирования
d.
Конструктор потомка вызывается из родителя ключевым словом super
e.
Модификатор protected позволяет видеть свойство при наследовании класса в другом package
f.
Конструктор родителя вызывается из потомка ключевым словом super
Отзыв
Ваш ответ частично правильный.
Вы правильно выбрали 3.
Правильные ответы:
Наследование позволяет писать код без дублирования,
Конструктор родителя вызывается из потомка ключевым словом super,
Аннотация @Override позволяет нам исключить ошибки в сигнатуре при переопределении методов,
Модификатор protected позволяет видеть свойство при наследовании класса в другом package
Вопрос 10
Верно
Баллов: 1,00 из 1,00
Не отмеченоОтметить вопрос
Текст вопроса
Отметьте верные утверждения

Выберите один или несколько ответов:
a. Модификатор protected позволяет видеть свойство при наследовании класса в другом package
b. Аннотация @Override позволяет нам исключить ошибки в сигнатуре при переопределении методов
c. Конструктор потомка вызывается из родителя ключевым словом super
d. Наследование позволяет писать код без дублирования
e. Полиморфизм в информатике это  явление прерывистого и одновременного морфологического различия между особями или группам
 особей в популяции какого либо вида без изолирующих репродуктивных механизмов
f. Конструктор родителя вызывается из потомка ключевым словом super
Отзыв
Ваш ответ верный.
Правильные ответы: Наследование позволяет писать код без дублирования, Конструктор родителя вызывается из потомка ключевым
 словом super, Аннотация @Override позволяет нам исключить ошибки в сигнатуре при переопределении методов, Модификатор protected
  позволяет видеть свойство при наследовании класса в другом package
 */