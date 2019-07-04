package constant;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	//public String color;
	private String color;
	
	//Fruit() {
	Fruit(String color) {
		//System.out.println("Call Constructor");
		//System.out.println("Call Constructor" + this);
		System.out.println("Call Constructor" + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
		
		// enum�� ���� ȿ���� �ڵ� �ܼ�ȭ, �ν���Ʈ�� ������ ����� ����
}

public class EnumEx {
	public static void main(String[] arg) {
		Fruit type = Fruit.APPLE;
		switch (type) {
		//case Fruit.APPLE:
		case APPLE:
			//System.out.println(57 + "kcal");
			//System.out.println(57 + "kcal, "+Fruit.APPLE.color);
			System.out.println(57 + "kcal, "+Fruit.APPLE.getColor());
			break;
		//case Fruit.PEACH:
		case PEACH:
			//System.out.println(34 + "kcal");
			//System.out.println(34 + "kcal, "+Fruit.PEACH.color);
			System.out.println(34 + "kcal, "+Fruit.PEACH.getColor());
			break;
		//case Fruit.BANANA:
		case BANANA:
			//System.out.println(93 + "kcal");
			//System.out.println(34 + "kcal, "+Fruit.BANANA.color);
			System.out.println(34 + "kcal, "+Fruit.BANANA.getColor());
			break;
			
			// case�� ���� �� ���̺��� switch ������ ������ ������ Ÿ���� Fruit��� ����� switch ������ �˱� ������
			// ������ Fruit�� ���� �ʰ� ����� ����
		}
	}

}
