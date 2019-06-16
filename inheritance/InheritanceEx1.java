package inheritance;

class Calculator {
    int left, right;
     
    public Calculator(){}
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);				// super�� �θ� Ŭ������ �ǹ� // this�� �ڱ� �ڽ��� �ǹ��ϴ� �Ͱ� ���� ����
    }									// super��� ���� ��ȣ�� �پ������� �θ� Ŭ������ �����ڸ� �ǹ�
    									// ���� Ŭ������ �ʱ�ȭ �ڵ带 super ���� ���� �����Ű�� �ȵ� 
    public void substract() {			// ���� Ŭ������ ��������ٴ� ���� ���� Ŭ������ �̹� �ν���Ʈȭ �ƴٴ� ���̱� ������, ���� Ŭ������ �����ڸ� ȣ���� ������ ��Ÿ������
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
