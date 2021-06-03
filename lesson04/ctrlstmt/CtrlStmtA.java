package lesson04.ctrlstmt;

// В названии класса присутствует CtrlStmt,
// поскольку данная тема рассматривается в англоязычных
// источниках как Control Statements.

// Операторы if, if - else, if – else if - else
public class CtrlStmtA {

    public static void main(String[] args) {

// Пример № 1 (всегда истинно, без альтернативы).
// Оператор if.
// Состоит из логического выражения, после которого
// следует один или более операторов.
        int a = 15;
        System.out.println("Пример № 1:");
        if( a < 25 ) { // в () логическое выражение
            // Операторы в {} выполняются, если истинно
            System.out.println("Наш оператор if.\n");
        }


// Пример № 2 (с альтернативой).
// Конструкция if - else.
// Состоит из логического выражения, после которого следует
// один или более операторов, а также выполнения альтернативных
// операторов.
        int b = 95;
        System.out.println("Пример № 2:");
        if( b < 25 ) {
            System.out.println("Значение меньше.\n");
        }else {
            System.out.println("Значение больше.\n");
        }
// Если в блоке после if или else всего одна команда, заключать
// ее в блок из фигурных скобок необязательно.
        int x = 15;
        System.out.println("Пример № 2.1:");
        if( x < 25 ) System.out.print("Значение меньше.\n");
        else System.out.print("Значение больше.\n");


// Пример № 3 (с альтернативой).
// Состоит из логических выражений (ЛВ) со своим вариантом
// исполнения операторов.
        int c = 95;
        System.out.println("\nПример № 3:");
        if( c < 25 ) { // в () ЛВ1
            // Операторы выполняются, если ЛВ1 - true
            System.out.println("Значение " + c + " меньше.\n");
        }else if ( c > 25 ) { // в () ЛВ2
            // Выполнение, если ЛВ1 - false, ЛВ2 - true
            System.out.println("Значение " + c + " больше.\n");
        }else {
            // Выполнение, если ЛВ1 – false, ЛВ2 - false
            System.out.println("Значения равны.\n");
        }


// Пример № 4 (множественное условие "и" без альтернативы вывода)
// Вывода нет, т.к. &&.
// && — логическая операция сокращенного вычисления, сокращенная
// конъюнкция (conditional-AND).
        int d = 9;
        int e = 5;
        System.out.println("Пример № 4:\n");
        if(d > e && d < 6) {
            System.out.println("d больше e и больше 6.\n");
        }


// Пример № 5 (множественное условие "или" без альтернативы вывода)
// Вывод есть, т.к. ||.
// || — логическая операция сокращенного вычисления,
// сокращенная дизъюнкция (conditional-OR).
        int f = 9;
        int g = 5;
        System.out.println("Пример № 5:");
        if(f > g || f < 6) {
            System.out.println("f больше g или больше 6.\n");
        }


// Пример № 6 (множественное условие "и" с альтернативой вывода)
        int h = 9;
        int i = 5;
        System.out.println("Пример № 6:");
        if(h > i && h > 6) {
            System.out.println("h больше i и больше 6.\n");
        }else System.out.println("h меньше i и меньше 6.\n");



//  Пример № 7 (многоступенчатая конструция if- else if - else)
//  Вложенный if- else if - else.
        int z;
        System.out.println("Пример № 7:");
        for( z = 1; z < 6; z++ ) {
            if(z == 1)
                System.out.println("z равно 1");
            else if(z == 2)
                System.out.println("z равно 2");
            else if(z == 3)
                System.out.println("z равно 3");
            else if(z == 4)
                System.out.println("z равно 4");
            else
                // Условие, выполняемое по умолчанию.
                System.out.println("z не в диапазоне от 1 до 4") ;
        }
    }
}