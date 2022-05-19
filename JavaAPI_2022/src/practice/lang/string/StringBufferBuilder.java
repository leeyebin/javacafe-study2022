package practice.lang.string;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();

		sb2.append("Java ");
		sb2.append("Program Study");
		System.out.println(sb2.toString());
		
		sb2.insert(4, "2");
		System.out.println(sb2.toString());

		sb2.setCharAt(4, '6');
		System.out.println(sb2.toString());
		
		sb2.replace(6, 13, "Book");
		System.out.println(sb2.toString());
		
		sb2.delete(4, 5);
		System.out.println(sb2.toString());
		
		int length = sb2.length();
		System.out.println("총문자수: " + length);
		
		String result = sb2.toString();
		System.out.println(result);		

	}

}
