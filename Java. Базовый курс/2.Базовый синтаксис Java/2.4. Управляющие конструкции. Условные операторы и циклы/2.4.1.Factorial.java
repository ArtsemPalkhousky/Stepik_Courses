/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */

//Реализуйте метод, вычисляющий факториал заданного натурального числа.

public static BigInteger factorial(int value){
        BigInteger BI = BigInteger.valueOf(value);
        BigInteger BIc = BI.subtract(BigInteger.ONE);
        while (!(BIc.equals(BigInteger.ONE) || BIc.equals(BigInteger.ZERO))){
              BI = BI.multiply(BIc);
              BIc = BIc.subtract(BigInteger.ONE);
        }
        return BI;
}