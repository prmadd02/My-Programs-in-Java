import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		String str;
		char ch;
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int othersCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		str = input.next();
		
		for(int pos = 0; pos < str.length(); pos++) {
			
			ch = str.charAt(pos);
					
				switch(ch){
				
				case 'a':
					aCount++;
					break;
				
				case 'e':
					eCount++;
					break;
				
				case 'i':
					iCount++;
					break;
				
				case 'o':
					oCount++;
					break;
				
				case 'u':
					uCount++;
					break;
					
				default:
					othersCount++;
				}
		}

		System.out.println("The number of a's: " + aCount);
		System.out.println("The number of e's: " + eCount);
		System.out.println("The number of i's: " + iCount);
		System.out.println("The number of o's: " + oCount);
		System.out.println("The number of u's: " + uCount);
		System.out.println("The number of other characters: " + othersCount);
	}

}
