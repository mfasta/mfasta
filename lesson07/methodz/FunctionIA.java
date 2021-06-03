package lesson07.methodz;

public class FunctionIA {

    public static void main(String [] args){
        // применение точечной нотации,
        // вызов статичного метода из другого класса
        FunctionI.showResult();
    }

// Если вы применяете static к методу, он называется
// статическим методом.
// Статический метод принадлежит классу, а не объекту класса.
// Статический метод может быть вызван без необходимости
// создания экземпляра класса.
// Статический метод может получить доступ к статическому
// члену данных и изменить его значение.
}