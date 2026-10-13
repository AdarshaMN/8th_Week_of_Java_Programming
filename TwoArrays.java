package DSA.SeventhWeek;

import java.util.*;

public class TwoArrays {
    
    //20) Given Ravi's and Sita's marks in the same five subjects, return in how many subjects Ravi scored more than Sita.
    static int getCountSubjectRaviScoredThanSita(int[] ravi, int[] sita)
    {
        int countSubjects = 0;
        for(int i = 0; i < ravi.length; i++)
        {
            if(ravi[i] > sita[i])
            {
                countSubjects++;
            }
        }
        return countSubjects;
    }

    //21) Given two arrays of the same length, return a new array with the bigger number at each position.
    static int[] getlargeNumberInEachPosition(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> arrayValue = new ArrayList<>();
        
        int storeValue = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] > arr2[i])
            {
                storeValue = arr1[i];
            }
            else if(arr2[i] > arr1[i])
            {
                storeValue = arr2[i];
            }
            else if(arr1[i] == arr2[i])
            {
                storeValue = arr1[i];
            }

            arrayValue.add(storeValue);
        }
        int [] result = new int[arrayValue.size()];

        for(int i = 0; i < arrayValue.size(); i++)
        {
            result[i] = arrayValue.get(i);
        }

        return result;
    }

    //22) Return the numbers in the first array that are not present in the second array.
    static int[] getNotPresentInTheSecondArr(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> arrayValue = new ArrayList<>();

        int values = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            boolean isvalid = false;
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                   isvalid = true;
                   break;
                }
            }

            if(!isvalid)
            {
                arrayValue.add(values);
            }
        }

        int [] result = new int[arrayValue.size()];

        for(int i = 0; i < arrayValue.size(); i++)
        {
            result[i] = arrayValue.get(i);
        }

        return result;
    }

    // 23) Given the scores of three players across matches, return which player (1, 2 or 3) has the highest total.
    static int getPalyerHighestTotalScore(int[] num1, int[] num2, int[] num3)
    {
       int player1 = 0;
       int player2 = 0;
       int player3 = 0;

       //player One
       for(int i = 0; i < num1.length; i++)
       {
            player1 += num1[i];
       }

       //player two
       for(int j = 0; j < num2.length; j++)
       {
            player2 += num2[j];
       }

       //palyer three
       for(int k = 0; k < num3.length; k++)
       {
            player3 += num3[k];
       }

       if(player1 > player2 && player1 > player3)
       {
            return 1;
       }
       else if(player2 > player1 && player2 > player3)
       {
            return 2;
       }
       else
       {
            return 3;
       }
    }

    // 24) Given three arrays, return the average of each array as a new array.
    static int[] getAverageOfEachArray(int[] arr1, int[] arr2, int[] arr3)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum1 = 0;

        //first Array
        for(int i = 0; i < arr1.length; i++)
        {
            sum1 += arr1[i];
        }
        int average1 = sum1 / arr1.length;
        numbers.add(average1);

        //second Array
        int sum2 = 0;
        for(int i = 0; i < arr2.length; i++)
        {
            sum2 += arr2[i];
        }
        int average2 = sum2 / arr2.length;
        numbers.add(average2);

        //third Array
        int sum3 = 0;
        for(int i = 0; i < arr3.length; i++)
        {
            sum3 += arr3[i];
        }
        int average3 = sum3 / arr3.length;
        numbers.add(average3);

        int result[] = new int[numbers.size()];
        for(int j = 0; j < result.length; j++)
        {
            result[j] = numbers.get(j);
        }

       return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter The " + n + " Elements" );
        int num1[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            num1[i] = sc.nextInt();
        }

        System.out.println("Enter The Size Of Array: ");
        int n1 = sc.nextInt();

        System.out.println("Enter The " + n1 + " Elements" );
        int num2[] = new int[n1];

        for(int i = 0; i < n1; i++)
        {
            num2[i] = sc.nextInt();
        }
        System.out.println(getCountSubjectRaviScoredThanSita(num1, num2));

        int value[] = getlargeNumberInEachPosition(num1, num2);
        System.out.println();
        for(int i = 0; i < value.length; i++)
        {
            System.out.print(value[i] + " ");
        }

        int notPresentValue[] = getNotPresentInTheSecondArr(num1, num2);
        System.out.println();
        for(int i = 0; i < notPresentValue.length; i++)
        {
            //System.out.print(notPresent[i] + " ");
        }

        int num3[] = {8, 8, 8, 8};
        System.out.println(getPalyerHighestTotalScore(num1, num2, num3));

        int values[] = getAverageOfEachArray(num1, num2, num3);
        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + " ");
        }

        sc.close();
    }
}
