package collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] arg) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		// arrayObj[2] = "three"; ������ �߻��Ѵ�.
		for (int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>(); // al�� ���� ArrayList�� �߰��Ǵ� ����
		al.add("one");									// String Ÿ������ ���׸��� ���� ����
		al.add("two");
		al.add("three");
		for (int i=0; i<al.size(); i++) {
			//System.out.println(al.get(i));
			
			String val = al.get(i);
			System.out.println(val);
			
			//String val = (String)al.get(i);
			//System.out.println(val);			// ArrayList�� ����� ��� add() �޼ҵ�� ���� ������ ��
		}										// �� ���� ������ ������ Ÿ������ ����ȯ�ؾ� �ϴ� ��������� ����
	}

}
