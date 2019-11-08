package test;
/*Viết chương trình Java để đảo ngược chuỗi bằng cách sử dụng đệ quy*/
public class Test3 {	
	public static void main(String[] args) {
	String s="The quick brown fox jumps";
	System.out.println(s);
	System.out.println("ReverseString:");
	System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
		
		if(s.length()==0) {
			return s;
		}
		return reverseString(s.substring(1))+s.charAt(0);
	}
}
