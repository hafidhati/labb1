

public class LABALL {

    //1
    static int remainder(int a, int b)
    {
        return a % b;
    }

    //2
    static double triArea(int a, int b)
    {
        return a * b / 2.0;
    }

    //3
    static int animals(int a, int b, int c)
    {
        return 2 * a + 4 * b + 4 * c;
    }

    //4
    static boolean profitableGamble(double prob, double prize, double pay)
    {
        return  prob * prize > pay;
    }

    //5
    static int ctoa(char ch)
    {
        return (int)ch;
    }

    //6
    static String operation(int N, int a, int b)
    {
        if (N == a + b)
            return "added";
        if (N == a - b)
            return "subtracted";
        if (N == a * b)
            return "multed";
        if (N == a / b)
            return "divied";
        return "none";
    }

    //7
    static int addUpTo(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    //8
    static int nextEdge(int a, int b)
    {
        return a + b - 1;
    }

    //9
    static int sumOfCubes(int[] cubes)
    {
        int sum = 0;
        for (int i = 0; i < cubes.length; i++)
        {
            sum += cubes[i] * cubes[i] * cubes[i];
        }
        return sum;
    }

    //10
    static boolean abcmath(int a, int b, int c)
    {
        for (int i = 0; i < b; i++)
        {
            a += a;
        }
        return a % 10 == 0;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("remainder(1,3) -> " + remainder(1,3));
        System.out.println("triArea(4,5) -> " + triArea(4,5));
        System.out.println("animals(2, 3, 5) -> " + animals(2, 3, 5));
        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble(0.2, 50, 9));
        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("nextEdge(8, 10) -> " + nextEdge(8, 10));
        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(new int[]{ 1, 5, 9}));
        System.out.println("abcmath(5, 2, 1) -> " + abcmath(5, 2, 1));
    }
}