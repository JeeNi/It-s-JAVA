package progenitor;

class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
}

		// ��ü ���� ���ϼ��� ���ϰ� ���� ���� ==�� ������� ���� equals�� �̿�
		// equals�� ���� �����ؾ� �Ѵٸ� hashCode�� �Բ� �����ؾ� ���� ����
		// �� ������ �и����� �ʴٸ� �� ������ ==�� ���� ���������� ���� ���� ���

class EqualsEx {
	public static void main(String[] arg) {
		Student s1 = new Student("JeeNi");
		Student s2 = new Student("JeeNi");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
