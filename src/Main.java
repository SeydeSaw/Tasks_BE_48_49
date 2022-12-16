public class Main {

    /*
    1) Перевод счисления: 2, 16
     2) Калькулятор с методами и условными ветвлениями
     3) Игра: "Камень, ножницы, бумага":
     игра компьютер vs компьютер и компьютер vs человек


     */


    public static void main(String[] args) {

    Cat myCat = new Cat("Barsik", 5, 7.5);

    Cat myCat2 = new Cat("Thomas", 0, 0.5);

        System.out.println(myCat);
        System.out.println(myCat2);

        myCat.className(); //вызываем метод объекта

        //======= троичная система счисления:
        //способ 1

        Converter converter = new Converter();
        System.out.println("Число в троичной системе: " + converter.to3(637));

        //======= троичная система счисления:
        //способ 2

        //вариант 1:
        //принимает из десятичной
        //                           число   в какую систему
        String str = Integer.toString(24, 16);
        System.out.println(str);


        //=====вариант2:
        //перевод из какой-либо системы, сначала значение потом система:
        //                     число   в какую систему
        int f = Integer.parseInt(str, 10);
        System.out.println(f);

        


    }


}