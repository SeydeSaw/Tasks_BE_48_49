public class Cat {

    /*
    1) Класс Cat дорадотать, реализовать возможность создания кота
    с именем, возрастом, весом, id(генерируемым автоматически)
    и возможностью вывода всех его полей на консоль

     */

    String name;
    int age;
    double weight;
    static int id; // переменная принадлежащая классу
    int ident; //переменная принадлежащая объекту

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        ident = id; //автоматически генегируем идентификаторы
        id++;
    }

    public void className() {
        System.out.println(" Создан в классе Cat ");

    }


    @Override
    public String toString() {      //
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", ident=" + ident +
                '}';
    }
}
