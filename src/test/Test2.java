package test;
import java.util.Arrays;
import java.util.List;

/*Viết chương trình Java để in các mục danh sách chứa tất cả các ký tự của một từ đã cho*/
public class Test2 {
	public static void main(String[] args) {
		String[] arr = {"rabbit","bribe","dog"};
		List<String> listStr = Arrays.asList(arr);
		System.out.println("Chuoi ban dau:");
		for(String s: listStr) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		System.out.println("In các mục danh sách chứa tất cả các ký tự của từ:bib");
		for(String s : listStr) {
			check(s,"bib");
		}
	}
	public static void check(String s,String wordSearch) {
		int count=0;
		for(int i=0;i<wordSearch.length();i++) {
			char c =wordSearch.charAt(i);
			if(s.contains(Character.toString(c))) {
				count++;
			}
		}
		if(count==wordSearch.length()) {
			System.out.println(s);
		}
	}
}
