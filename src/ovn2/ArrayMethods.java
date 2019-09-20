package ovn2;

public class ArrayMethods {

	public static int largest(int[] values) {
		if(values==null || values.length==0)
			throw new IllegalArgumentException("values may not be null or empty");
		
		int largest = values[0];
		for (int i : values) {
			if (i > largest) {
				largest = i;
			}
		}

		return largest;
	}

	
	
	
	
	public static boolean equals(int[] a1, int[] a2) {
		if (a1 == null && a2 == null)
			return true;
		
		if (((a1 == null) != (a2 == null)) || (a1.length != a2.length))
			return false;

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i])
				return false;
		}

		return true;
	}

	public static int[] copy(int[] org, int start, int end) {
		return org.clone();
	}

}
