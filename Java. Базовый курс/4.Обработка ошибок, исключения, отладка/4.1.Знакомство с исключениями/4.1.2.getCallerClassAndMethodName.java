// Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
// Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
// утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
// является точкой входа в программу, т.е. его никто не вызывал.


package getCallerClassAndMethodName;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        anotherMethod2();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod2() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
       if (Thread.currentThread().getStackTrace().length > 3) {
           return Thread.currentThread().getStackTrace()[3].getClassName() + "#" + Thread.currentThread().getStackTrace()[3].getMethodName();
       }
       return null;
    }
}


// Output
// null
// null
// getCallerClassAndMethodName.Test#main
// getCallerClassAndMethodName.Test#main

