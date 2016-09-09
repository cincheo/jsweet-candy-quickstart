package myCandy;

/**
 * An example of a library programmed with JSweet. The produced Maven artifact
 * can be used by a regular Java program or by another JSweet program.
 * 
 * Also, it can be used from TypeScript and JavaScript directly (see the bundles
 * generated in the 'dist' directory of this project).
 */
public class API {

	/**
	 * Tells if the given number is a prime number or not.
	 * 
	 * <p>
	 * From http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	 * by Oscar Sanchez.
	 * 
	 * @param n
	 *            the number to be tested
	 * @return true if n is a prime number
	 */
	public static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
