package collection;

import java.util.*;

class Computer implements Comparable {
	int serial;
	String owner;
	
	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {					// a.compareTo(b)
		return this.serial - ((Computer)o).serial;		// 0: a�� b�� ���� ���
	}													// ���: a�� b���� Ŭ ���
	public String toString() {						 	// ����: b�� a���� Ŭ ���
		return serial + " " + owner;					// compareTo() �޼ҵ带 �����Ѵٴ� ����
	}													// Computer�� ���� serial, owner �� ���� �Ӽ� ���
}														// ������ �������� ũ�� ���� ���� �к��� ������ ���� �Ѵٴ� ��
public class CollectionsEx {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		
		computers.add(new Computer(500, "JeeNi"));
		computers.add(new Computer(200, "Leezche"));
		computers.add(new Computer(3233, "graphittie"));
		
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("\nafter");
		i = computers.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
