package generic;

class EmployeeInfo {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}
class Person<T, S> {				// ���׸��� �⺻ ������ Ÿ����(int, char, double) �� �� ����
	public T info;					// �⺻ ������ Ÿ����  ��ü�� �ƴ�
	public S id;					// ����(wrapper) Ŭ������ ����Ͽ� ��ü ó�� �ٷ�� ��
	
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {		// �޼ҵ� �ȿ��� U�� ������ ������ Ÿ���� �ٷ� info �Ű������� ���׸� Ÿ���� �ȴٴ� ��
		System.out.println(info);
	}
}

public class GenericEx3 {
	public static void main(String[] args) {
		//Person<EmployeeInfo, Integer> p1 =
				//new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), 1);
											// �׷��� int�� �ش��ϴ� �κ��� int�� ���� Ŭ������ Integer�� ��ü�� ��
		/*
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(1);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		*/
		/*
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		*/
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(e, i);
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e);
	}
}