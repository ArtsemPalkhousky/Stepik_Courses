/*
Реализуйте метод, который возвращает букву, стоящую 
в таблице UNICODE после символа "\" (обратный слэш)
на расстоянии a
*/

public static char charExpression(int a) {
    return (char) ('\\' + a);
}