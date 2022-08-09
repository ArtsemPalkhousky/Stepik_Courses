/*
Реализуйте метод, возвращающий true,
если среди четырех его аргументов ровно два истинны (любые). 
Во всех остальных случаях метод должен возвращать false.
*/

public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {    
    int s=0; if (a) s++; if (b) s++; if (c) s++; if (d) s++;
    return s == 2 ? true : false;    
}

