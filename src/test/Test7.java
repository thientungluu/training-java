package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*Viết chương trình Java để nối văn bản vào tệp hiện có.*/
public class Test7 {
	public static void main(String[] args) {
		String fileName ="E:\\hello.txt";
		BufferedWriter bw =null;
		try {
			String data="Thêm nội dung";
			File file = new File(fileName);
			if(!file.exists()) {
				file.createNewFile();
			}
			bw= new BufferedWriter(new FileWriter(fileName,true));
			bw.write(data);
			System.out.println("Thành công");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
