package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
	public static void main(String[] arg) {
		/*
		//HashSet<Integer> A = new HashSet<Integer> ();
		ArrayList<Integer> A = new ArrayList<Integer> ();
		A.add(1);
		A.add(2);						// List�� �߰��ϴ� ��� ���� ��
		A.add(2);						// Set�� �ߺ��Ǵ� ���� ���� �ʰ� ������ ���� ����
		A.add(2);
		A.add(2);
		A.add(3);
		*/
		
		HashSet<Integer> A = new HashSet<Integer> ();
		A.add(1);
		A.add(2);
		A.add(3);
		HashSet<Integer> B = new HashSet<Integer> ();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer> ();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));   // false   // A ���տ� B ������ ��ü ���Ұ� ��� ����ִ� Ȯ���ϴ� ����
		System.out.println(A.containsAll(C));	// true	   	
		
		//A.addAll(B);				// A ���տ�  B ������ ���ļ� A�� ����ٴ� ��
		//A.retainAll(B);			// retain�� '�����ϴ�' �׷��� A ���տ��� �ְ� B ���տ��� �ִ� ���� A�� ��ڴٴ� �� (������)
		A.removeAll(B);
		
		Iterator hi = A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());			// List���� �߰��� ��� ���� ��, Set�� �����̱⿡ �ߺ��Ǵ� ���� ���� ����
		}											// List�� ���� ������� ����, Set������ ������ ������� ����Ǵ� ���� ������� ����
	}
}
