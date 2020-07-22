package Q3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Question3 {
	public static boolean isPalindrome(String word)
	{
		if(word.equals(new StringBuffer(word).reverse().toString()))
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		String strArray[] = {"1001","0101","0110","1111","0000"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = Question3.getPalidromeList(strList, Question3::isPalindrome);
		System.out.println("The Values in the Array is");
		for(int i=0;i<5;i++)
		{
			System.out.println(strArray[i]);
		}
		System.out.println("\nThe Palidromes in the list are:"+resultList);		
	}

	private static List<String> getPalidromeList(List<String> strList, Predicate<String> predicate) 
	{
		List<String> finalList = new ArrayList<>();
		for(String str : strList)
		{
			if(predicate.test(str))
			{
				finalList.add(str);
			}
		}
		return finalList;
	}
}

/*
Output:
The Values in the Array is
1001
0101
0110
1111
0000

The Palidromes in the list are:[1001, 0110, 1111, 0000]
 */
