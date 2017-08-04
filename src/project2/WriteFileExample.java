package project2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFileExample {
	static int i = 0;
	public static void saveFile(String fileName,String content){
		File file = new File("E:/xiaoming/AlgorithmsPj2/theFile/"+fileName+i+".txt");
//		String content = "This is the text content";
		try (FileOutputStream fop = new FileOutputStream(file)) {
   // if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
   // get the content in bytes
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}
	public static void main(String[] args) {
		File file = new File("E:/xiaoming/AlgorithmsPj2/theFile/newFile.txt");
		String content = "This is the text content";
		try (FileOutputStream fop = new FileOutputStream(file)) {
   // if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
   // get the content in bytes
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}