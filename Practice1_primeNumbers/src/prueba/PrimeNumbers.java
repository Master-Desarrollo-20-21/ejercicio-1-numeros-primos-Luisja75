package prueba;

public class PrimeNumbers {
	public static void main(String[] args) {
        //Exercise 1
        int sumNumbersPrime1 = 0;
        for (int i = 1; i <= 50; i++)
        {
            Number number = new Number(i);
            if (number.isNumberPrime())
            {
            	sumNumbersPrime1 = sumNumbersPrime1 + i;
            }
        }
        System.out.println("La suma de los números primos menores que 50 es: " + sumNumbersPrime1);

        //Exercise 2
        int sumNumbersPrime2 = 0;
        int countNumbersPrime2 = 0;
        int j = 1;
	    while (countNumbersPrime2 < 50)
        {
            Number number = new Number(j);
            if (number.isNumberPrime())
            {
                sumNumbersPrime2 = sumNumbersPrime2 + j;
                countNumbersPrime2++;
            }
            j++;
        }
        System.out.println("La suma de 50 primeros números primos es: " + sumNumbersPrime2);
	}
}
