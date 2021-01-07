import java.util.Arrays;

public class TASK2 {
    //1
    static String repeat(String str, int n)
    {
        String res = "";
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < n; j++)
            {
                res+=str.charAt(i);
            }
        }
        return res;
    }

    //2
    static int differenceMaxMin(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        return Math.abs(max-min);
    }

    //3
    static boolean isAvgWhole(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum % arr.length == 0;
    }

    //4
    static int[] cumulativeSum(int[] arr)
    {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = 0; j <= i; j++)
            {
                sum += arr[j];
            }
            res[i] = sum;
        }
        return (res);
    }

    //5
    static int getDecimalPlaces(String num)
    {
        for (int i = 0; i < num.length(); i++)
        {
            if (num.charAt(i) == '.')
            {
                return num.length() - i - 1;
            }
        }
        return 0;
    }

    //6
    static int Fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n-2) + Fibonacci(n-1);
    }

    //7
    static boolean isValid(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                return false;
        }
        return true;
    }

    //8
    static boolean isStrangePair(String str1, String str2)
    {
        return str1.charAt(0) == str2.charAt(str2.length()-1) && str2.charAt(0) == str1.charAt(str1.length()-1);
    }

    //9
    static boolean isPreffix(String str, String preffix)
    {
        return str.startsWith(preffix.substring(0, preffix.length() - 1));
    }

    static boolean isSuffix(String str, String suffix)
    {
        return str.endsWith(suffix.substring(1, suffix.length()));
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("repeat(\"mice\", n) -> " + repeat("mice", 5));
        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> " + differenceMaxMin(new int[]{ 10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("isAvgWhole([1, 5, 6]) -> " + isAvgWhole(new int[] { 1, 5, 6}));
        System.out.println("cumulativeSum([1, 2, 3]) -> " + Arrays.toString(cumulativeSum(new int[] { 1, 2, 3})));
        System.out.println("getDecimalPlaces(\"7.430\") -> " + getDecimalPlaces("7.430"));
        System.out.println("getDecimalPlaces(\"400\") -> " + getDecimalPlaces("400"));
        System.out.println("Fibonacci(7) -> " + Fibonacci(7));
        System.out.println("isValid(\"59001\") -> " + isValid("59001"));
        System.out.println("isValid(\"853a 7\") -> " + isValid("853a 7"));
        System.out.println("isStrangePair(\"ratio\", \"operator\") -> " + isStrangePair("ratio", "operator"));
        System.out.println("isStrangePair(\"bush\", \"hubris\") -> " + isStrangePair("bush", "hubris"));
        System.out.println("isPreffix(\"automation\", \"auto-\") -> " + isPreffix("automation", "auto-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") -> " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isPreffix(\"retrospect\", \"sub-\") -> " + isPreffix("retrospect", "sub-"));
        System.out.println("isSuffix(\"vocation\", \"-logy\") -> " + isSuffix("vocation", "-logy"));

    }
}
