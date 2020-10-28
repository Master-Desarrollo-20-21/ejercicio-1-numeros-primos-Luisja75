package prueba;

public class Number {
    private int _number;

    public Number(int number)
    {
        _number = number;
    }

    public boolean isNumberPrime()
    {
    	boolean isNumberPrime = false;

        if (_number >= 1)
        {
            if (_number == 1 || _number == 2)
            {
                isNumberPrime = true;
            }
            else
            {
                int result = 0;
                int divider = 2;
                while (true)
                {
                    result = _number / divider;
                    int rest = _number % divider;

                    if (rest == 0)
                    {
                        isNumberPrime = false;
                        break;
                    }
                    else if (result <= divider)
                    {
                        isNumberPrime = true;
                        break;
                    }
                    divider++;
                }
            }
        }

        return isNumberPrime;
    }
}
