import java.util.*;

public class ChtrArray1 {
        
    //15) Given the traffic signal colours seen in a day ('R', 'G', 'Y'), return the counts as [red, green, yellow].
    static int[] getCountOfSignalColours(char[] ch)
    {
        int red = 0;
        int green = 0;
        int yellow = 0;
        for (char c : ch) 
        {
            if(c == 'R')
            {
                red++;
            }
            else if(c == 'G')
            {
                green++;
            }
            else 
            {
                yellow++;
            }
        }
        return new int[] {red, green, yellow};
    }

    //16)Mobile number check: return true if there are exactly 10 characters and all are digits.
    static boolean checkMobileNumIsValid(char[] ch)
    {
        int len = ch.length;
        boolean isValid = true;

        if(len != 10)
        {
            return false;
        }
        for(char c: ch)
        {
            if(c < '0' || c > '9')
            {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
    //17)Return the array with each letter moved one step forward in the alphabet ('z' becomes 'a').
    static char[] getEachLetterMovedOneStep(char[] ch)
    {
        char ans[] = new char[ch.length];

        for(int i = 0; i < ch.length; i++) 
        {
            char c = 0;
            if(ch[i] == 122 || ch[i] == 90)
            {
                c = (char) (ch[i] - 25);
            }

            if(ch[i] >= 65 && ch[i] < 90 || ch[i] >= 97 && ch[i] < 122)
            {
                int chr = ch[i] + 1;
                c = (char) chr;
            }
            ans[i] = c;
        }
        return ans;
    }

    //18) Return the positions (indexes) where a given character appears.
    static int[] getPositionOfGivenChar(char[] ch, char key)
    {
        ArrayList<Integer> chars = new ArrayList<>();
    
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
            {
                if(ch[i] == key)
                {
                    chars.add(i);
                }
            }
        }
        int[] indice = new int[chars.size()];

        for(int i = 0; i < chars.size(); i++)
        {
            indice[i] = chars.get(i);
        }

        return indice;
    }

    //19)Return true if the word reads the same forwards and backwards.
    static boolean checkReadsForwardAndBackWords(char[] ch)
    {
        int left = 0;
        int right = ch.length - 1;

        while(left < right)
        {
            if(ch[left] != ch[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //20) Given two words of the same length, return at how many positions they have the same character.
    static int getCountSamePositions(char[] ch1, char[] ch2)
    {
        int positionCount = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            if(ch1[i] == ch2[i])
            {
                positionCount++;
            }
        }
        return positionCount;
    }

    //21) Given a student's quiz answers and the answer key, return the score (1 mark per correct answer).
    static int getMarksForCorrectAnswer(char[] ch1, char[] ch2)
    {
        int countMarks = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            if(ch1[i] == ch2[i])
            {
                countMarks++;
            }
        }
        return countMarks;
    }

    //22) Return the characters in the first array that are not present in the second array.
    static char[] getNotPresentInTheArray(char[] ch1, char[] ch2)
    {
        ArrayList<Character> chr = new ArrayList<>();
        for(int i = 0; i < ch1.length; i++)
        {
            boolean found = false;
            for(int j = 0; j < ch2.length; j++)
            {
                if(ch1[i] == ch2[j])
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
                chr.add(ch1[i]);
            }
        }
        char result[] = new char[chr.size()];
        for(int i = 0; i < chr.size(); i++)
        {
            result[i] = chr.get(i);
        }
        
        return result;
    }

    //23) Given a first name and a last name, return the full name with a space in between.
    static char[] getFullNameOfGivenName(char[] ch1, char[] ch2)
    {
        char[] ans = new char[ch1.length + ch2.length];

        for(int i = 0; i < ch1.length; i++)
        {
            ans[i] = ch1[i];
        }

        for(int j = 0; j < ch2.length; j++)
        {
            ans[ch1.length + j] = ch2[j];
        }
        return ans;
    }
    //24)
    public static void main(String[] args)
    {
        char []ch1 = {'r','a','m'};
        char []ch2 = {'k','u','m','a','r'};
        //char key = 'l';
        // int result[] = getCountOfSignalColours(ch);
        // for(int i = 0; i < result.length; i++)
        // {
        //     System.out.print(result[i] + " ");
        // }

        //System.out.println(checkMobileNumIsValid(ch));

        // char chr[] = getEachLetterMovedOneStep(ch);
        // for(int i = 0; i < chr.length; i++)
        // {
        //     System.out.print(chr[i] + " ");
        // }

        // int chtr[] = getPositionOfGivenChar(ch, key);
        // for(int i = 0; i < chtr.length; i++)
        // {
        //     System.out.print(chtr[i] + " ");
        // }

        //System.out.println(checkReadsForwardAndBackWords(ch));
        //System.out.println(getCountSamePositions(ch1, ch2));

        //System.out.println(getMarksForCorrectAnswer(ch1, ch2));

        // char[]c = getNotPresentInTheArray(ch1, ch2);
        // for(int i = 0; i < ch2.length; i++)
        // {
        //     System.out.print(c[i] + " ");
        // }

        char[] fullName = getFullNameOfGivenName(ch1, ch2);
        for(int i = 0; i < fullName.length; i++)
        {
            System.out.print(fullName[i] + " ");
        }


    }
}
