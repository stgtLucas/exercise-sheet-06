package de.unistuttgart.iste.sqa.pse.sheet06.presence.exercise1;

public class PrimitiveTypes {

	public static void main(final String[] args) {

		byte maximumOfByte = 127;

		final int tenAsInteger = 10;
		final int fourAsInteger = 4;
		final double fourAsDouble = 4;

		final double rootOfTwo = Math.sqrt(2);
		final double zero = rootOfTwo * rootOfTwo - 2;

		final char characterA = 'a';
		final char characterB = 'b';

		System.out.println(maximumOfByte + 1);
		maximumOfByte++;
		System.out.println(maximumOfByte);
		System.out.println(tenAsInteger / fourAsInteger);
		System.out.println(tenAsInteger / fourAsDouble);
		System.out.println(zero);
		System.out.println(characterB - characterA);
	}
}
