package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*Viết chương trình java để đọc một dòng tệp theo dòng và lưu nó vào một biến.*/
public class Test6 {
	public static void main(String[] args) {
		String fileName ="E:\\hello.txt";
		String line="";
		StringBuilder sb= new StringBuilder("");
		BufferedReader br =null;
		try {
			br= new BufferedReader(new FileReader(fileName));
			while ((line=br.readLine()) != null) {
				sb.append(line+" ");
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br !=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
