/*
Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) 
до заданного года включительно. На самом деле Григорианский календарь был введен значительно позже,
но здесь для упрощения мы распространяем его действие на всю нашу эру.
 */

public static int leapYearCount(int year) {
    year = year / 4 - year / 100 + year / 400;
    return year;
}



