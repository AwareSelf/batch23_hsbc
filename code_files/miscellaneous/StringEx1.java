package miscellaneous;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Namrata";
		
		name = name + " Marathe";
		//System.out.println(name+" Marathe");
		System.out.println(name);
		
		name = "Core ";
		name = name + "Java";
		//System.out.println(name.concat("Java"));
		System.out.println(name);
		
		name = "Core";
		StringBuilder sb = new StringBuilder(name);
		sb.append(" Java").append(" is my batch");
		System.out.println(sb);
		name = sb.toString();
		System.out.println(name);
		
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		String s3 = new String("abc");
		System.out.println(s1==s3);
		
		
		String n ="abcdef hijk";
		n = n.toUpperCase();
		System.out.println(n);
		
		n = "  java ";
		System.out.println("xxx"+n+"xxx");
		n = n.trim();
		System.out.println("xxx"+n+"xxx");
		
		
		   String str5 = "\t    Namrata    \u2005";
	        System.out.println("xxx"+str5+"xxx");
	        System.out.println("xxx"+str5.trim()+"xxx");
	        System.out.println("xxx"+str5.strip()+"xxx");
	        
	        String str6 = "\t   Namrata    \u2005";
	        System.out.println("xxx"+str6.stripLeading()+"xxx");
	        
	        String str7 = "\t    Namrata    \u2005";
	        System.out.println("xxx"+str7.stripTrailing()+"xxx");
		

	}

}
