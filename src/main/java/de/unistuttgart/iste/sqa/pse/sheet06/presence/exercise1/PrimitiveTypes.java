package de.unistuttgart.iste.sqa.pse.sheet06.presence.exercise1;

public class PrimitiveTypes {

	public static void main(String[] args) {

		byte maximumOfByte = 127;

		int tenAsInteger = 10;
		int fourAsInteger = 4;
		double fourAsDouble = 4;

		double rootOfTwo = Math.sqrt(2);
		double zero = rootOfTwo * rootOfTwo - 2;

		char characterA = 'a';
		char characterB = 'b';

		System.out.println(maximumOfByte + 1);
		maximumOfByte++;
		System.out.println(maximumOfByte);
		System.out.println(tenAsInteger / fourAsInteger);
		System.out.println(tenAsInteger / fourAsDouble);
		System.out.println(zero);
		System.out.println(characterB - characterA);
	}
}
