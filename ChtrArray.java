public class ChtrArray {
    
    // 1) Count the vowels and consonants. Return both as [vowels, consonants].
    static int[] countVowelsAndConsonants(char[] nums)
    {
        //edge case
        if(nums == null || nums.length == 0)
        {
            return null;
        }
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if((nums[i] >= 'a' && nums[i] <= 'z') || (nums[i] >= 'A' && nums[i] >= 'Z'))
            {
                if((nums[i] == 'a' || nums[i] == 'A') 
                || (nums[i] == 'e' || nums[i] == 'E') 
                || (nums[i] == 'i' || nums[i] == 'I')
                || (nums[i] == 'o' || nums[i] == 'O')
                || (nums[i] == 'u' || nums[i] == 'U'))
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        return new int[] {vowels, consonants};
    }

    // 2) Return how many times a given character appears.
    static int getCountGivenCharAppears(char[] characters, char key)
    {
        //edge case
        if(characters == null || characters.length == 0)
        {
            return 0;
        }
        int countChar = 0;
        for(int i = 0; i < characters.length; i++)
        {
            if((characters[i] >= 'a' && characters[i] <= 'z') 
            || (characters[i] >= 'A' && characters[i] >= 'Z'))
            {
                if(characters[i] == key)
                {
                    countChar += 1;
                }
            }
        }
        return countChar;
    }

    // 3) Return the array with every letter in capitals.
    static char[] getEachLetterInCapitals(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        return ch;
    }

    //4) Return true if the array contains at least one digit.
    static boolean isContainDigits(char[] ch)
    {
        for(char chr: ch)
        {
            if(chr >= '0' && chr <= '9')
            {
                return true;
            }
        }
        return false;
    }

    //5) Return the first and the last character as a new array.
    static char[] getFirstAndLastChar(char[] ch)
    {
        return new char[] {ch[0], ch[ch.length-1]};
    }

    //6) Return how many capital letters are in the array.
    static int countCapitalLetters(char[] ch)
    {
        int countCapitalLtr = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'A' && ch[i] <= 'Z')
                {
                    countCapitalLtr++;
                }
        }
        return countCapitalLtr;
    }

    //7) Password check: return true if the password has at least 8 characters and at least one digit.
    static boolean checkThePasswords(char[] ch)
    {
        int len = ch.length;
        for(char chr: ch)
        {
            if((chr >= '0' && chr <= '9') && len == 8)
            {
                return true;
            }
        }
        return false;
    }
    //8) Return the array with every space replaced by an underscore '_'.
    static char[] replaceSpaceByUnderScore(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == ' ')
            {
                ch[i] = '_';
            }
        }
        return ch;
    }

    //9) Return the number of words. Words are separated by single spaces.
    static int countWordsSeparatedByWords(char[] ch)
    {
        int countWords = 1;
        for(char chr: ch)
        {
            if(chr == ' ')
            {
                countWords++;
            }
        }
        return countWords;
    }

    //10) Return the array with all vowels removed.
    static char[] removeVowels(char[] ch)
    {
        char chr[] = new char[ch.length];

        for(int i = 0; i < ch.length; i++)
        {
            char value = 0;
            if((ch[i] != 'a' && ch[i] != 'A') 
            && (ch[i] != 'e' && ch[i] != 'E') 
            && (ch[i] != 'i' && ch[i] != 'I') 
            && (ch[i] != 'o' && ch[i] != 'O')
            && (ch[i] != 'u' && ch[i] != 'U'))
            {
                value = ch[i];
            }
            chr[i] = value;
        }
        return chr;
    }

    //12) Return the letter that comes last in alphabetical order.
    static char getLetterComesLastOrder(char[] ch)
    {
        int chr = ch[0];
        for(int chtr: ch)
        {
            if(chtr >= 65 && chtr <= 90 || chtr >= 97 && chtr <= 122)
            {
                if(chtr > chr) 
                {
                    chr = chtr;
                }
            }
        }
        return (char) chr;
    }

    //13) Given the grades of a class, return how many students got 'A'.
    static int countStudentsGotGradeA(char[] ch)
    {
        int countStudents = 0;
        for(char chr: ch)
        {
            if(chr >= 'A' && chr <= 'Z')
            {
                if(chr == 'A')
                {
                    countStudents++;
                }
            }
        }
        return countStudents;
    }

    //14) Return the sum of all the digit characters, ignoring letters.
    static int getSumOfAllDigitChar(char[] ch)
    {
        int sumDigitCount = 0;
        for(char chr: ch)
        {
            if(chr >= '0' && chr <= '9')
            {
                sumDigitCount += chr - '0';
            }
        }
        return sumDigitCount;
    }
    public static void main(String[] args)
    {
        char ch[] = {'a','3','b','7','2'};
        char key = 'a';
        int character[] = countVowelsAndConsonants(ch);
        for(int i = 0; i < character.length; i++)
        {
            System.out.print(character[i] + " ");
        }

        System.out.println(getCountGivenCharAppears(ch, key));

        char chtr[] = getEachLetterInCapitals(ch);
        for(int i = 0; i < chtr.length; i++)
        {
            System.out.print(chtr[i] + " ");
        }
        System.out.println(isContainDigits(ch));

        char chr[] = getFirstAndLastChar(ch);
        System.out.println(chr);

        System.out.println(countCapitalLetters(ch));

        System.out.println(checkThePasswords(ch));

        char value[] = replaceSpaceByUnderScore(ch);
        for(int i = 0; i < value.length; i++)
        {
            System.out.print(value[i] + " ");
        }

        System.out.println(countWordsSeparatedByWords(ch));

        char chrter[] = removeVowels(ch);
        for(int i = 0; i < chrter.length; i++)
        {
            System.out.print(chrter[i]);
        }

        char result = getLetterComesLastOrder(ch);
        System.out.println("The Last Order of Alphabet is: " + result);

        System.out.println(countStudentsGotGradeA(ch));
        System.out.println(getSumOfAllDigitChar(ch));
    }
}
