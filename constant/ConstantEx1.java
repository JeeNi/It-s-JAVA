package constant;

/*
public class ConstantEx1 {
	public static void main(String[] arg) {
		
		 * 1. ���
		 * 2. ������
		 * 3. �ٳ���
		 
		int type = 1;
		
		switch (type) {
			case 1:
				System.out.println(57);
				break;
			case 2:
				System.out.println(34);
				break;
			case 3:
				System.out.println(93);
				break;
		}
	}
}
*/

/*
public class ConstantEx1 {
	// fruit
	//private final static int APPLE = 1;
	private final static int FRUIT_APPLE = 1;
	//private final static int PEACH = 2;
	private final static int FRUIT_PEACH = 2;
	//private final static int BANANA = 3;
	private final static int FRUIT_BANANA = 3;
	
	
	// company
	//private final static int GOOGLE = 1;
	private final static int COMPANY_GOOGLE = 1;
	//private final static int APPLE = 2;			// ó�� APPLE�� 1�� ������ �ο� �޾ұ� ������ ���� �߻�
	private final static int COMPANY_APPLE = 2;
	//private final static int ORACLE = 3;			// ������ final�� ������ ������ ���ø����̼� �������� APPLE�� ��� ���� 1�̶�� ���� �����ϱ� ����
	private final static int COMPANY_ORACLE = 3;
	
	
	public static void main(String[] arg) {
		//int type = APPLE;
		int type = FRUIT_APPLE;
		switch (type) {
			//case APPLE:
			case FRUIT_APPLE:
				System.out.println(57 + "kcal");
				break;
			//case PEACH:
			case FRUIT_PEACH:
				System.out.println(34 + "kcal");
				break;
			//case BANANA:
			case FRUIT_BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}
*/

/*
interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}

interface COMPANY {
	int GOOGOLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantEx1 {
	public static void main(String[] arg) {
		int type = FRUIT.APPLE;
		switch (type) {
			case FRUIT.APPLE:
				System.out.println(57 + "kcal");
				break;
			case FRUIT.PEACH:
				System.out.println(34 + "kcal");
				break;
			case FRUIT.BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}
*/

class Fruit {
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}

class Company {
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class ConstantEx1 {
	public static void main(String[] arg) {
		//if(Fruit.APPLE == Company.APPLE) {
		Fruit type = Fruit.APPLE;
		switch (type) {				// switch ������ type�� ����� �� ��� ���� �߻�
			case Fruit.APPLE:
				System.out.println(57 + "kcal");
				break;
			case Fruit.PEACH:
				System.out.println(34 + "kcal");
				break;
			case Fruit.BANANA:
				System.out.println(93 + "kcal");
				break;
		}
	}
}