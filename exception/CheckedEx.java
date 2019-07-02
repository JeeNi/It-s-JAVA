package exception;

import java.io.*;

public class CheckedEx {
	public static void main(String[] arg) {
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
		// ������ ����� �������� FileReader ��ü�� ���ڷ� �̸��� ���´�
		
		String input = null;
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}