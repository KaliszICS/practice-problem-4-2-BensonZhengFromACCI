public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String repeatLetter(char letter, int num) {
		String result = "";
		for (int num2 = 0; num2 != num; num2++) { 
			result += letter;
		}
	return result; 
	}

	public static int countLetter(String word, char letter) {
		int result = 0;
		for (int pos0 = 0; pos0 != word.length(); pos0++) { 
			if (word.charAt(pos0) == letter) {
				result++;
			}
		}
	return result; 
	}

	public static int evenSum(int num1, int num2) {
		int result = 0;
		if (num1 <= num2) {
			for (int num3 = num1; num3 <= num2; num3++) {
				if (num3 % 2 == 0) {
					result += num3;
				}
			}
		}
		else {
			for (int num3 = num2; num3 <= num1; num3++) {
				if (num3 % 2 == 0) {
					result += num3;
				}
			}
		}
	return result; 
	}
}
