package scanner;

public class String_methods {
	public static void main(String[] args) {
		
		String a="Priya";
		String b="Prabu";
		String x="  Magashwin";
		String y="my name is priya";
		String z="Programming";
		int c = a.length();
		System.out.println(c);//return type--int
		
		boolean d = a.equals(b);
		System.out.println(d);//return type---boolean
		
		boolean e = a.equalsIgnoreCase(b);
		System.out.println(e);//return type---boolean
		
		String f = a.toUpperCase();
		System.out.println(f);//return type--upper case string
		
		String g = a.toLowerCase();
		System.out.println(g);//return type--lower case string
		
		boolean h = a.startsWith("P");
		System.out.println(h);//return type--boolean
		
		boolean i = b.endsWith("u");
		System.out.println(i);//return type--boolean
		
		boolean j = a.contains("i");
		System.out.println(j);//return type--boolean
		
		int k = a.indexOf("r");
		System.out.println(k);//return type--int
		
		int l = z.lastIndexOf("m");
		System.out.println(l);//return type--int

		char m = z.charAt(3);
		System.out.println(m);//return type--char
		
		String n = a.replace('i','a');
		System.out.println(n);//return type string
		
		String o = z.substring(3);
		System.out.println(o);//return type--substring
		
		boolean p = a.isEmpty();
		System.out.println(p);//return type--boolean
		
		String[] q = y.split(" ");
		System.out.println(q[1]);//return type--string
		
		String r = x.trim();
		System.out.println(r);//return type--string
		
		String s = y.concat(b);
		System.out.println(s);//return type--string
		
		int w=15;
		String t = String.valueOf(w);
		System.out.println(t);//return type--int
		
		int u = a.compareTo(b);
		System.out.println(u);//return type--int
		}
}
