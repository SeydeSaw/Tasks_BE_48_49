public class Converter {

    //Метод для перевода числа в троичную систему счисления:
    public String to3(int i){
        String str = "";
        //цикл
        while (i>0){
        str += i%3;
        i = i/3;
        }
        //вызываем метод reverse:
        return reverse(str);
    }


    //Метод для переворота строки:
    public String reverse(String str){
        /* Реализация через цикл While:
        String rev = "";

        int j = str.length() -1;
        while (j >= 0){
            rev += str.charAt(j);
            j--;
        }
        */

        // Реализация через цикл For :

        String rev = "";
        for (int i = str.length() -1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
