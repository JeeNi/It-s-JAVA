package overriding;



class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public int avg() {
    	//System.out.println(this.left + this.right);
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
        
        // ���� ����� c1.sum�� ���� Ŭ������ �޼ҵ尡 �ƴ�
        // ���� Ŭ������ �޼ҵ� sum�� ������
        
        // ���� Ŭ���� ���忡�� �θ� Ŭ������, �⺻���� ���� ����� ������ ��
        // ���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ�, �θ� Ŭ�����κ���
        // ���� ���� �⺻ ���� ����� �����ϴ�  ȿ��
        
        // �⺻ ������ ���а� ����ǰ�, �������� ������ �� ���� �켱������ ���� ��
        
    }
    
    //public int avg() {
    //public int avg() {
    	//return ((this.left + this.right) / 2);
    public int avg() {
    	return super.avg();
    	
    	// ����
    	// avg�� ���� Ÿ���� void ������ ��� Ŭ������ ���� Ÿ���� int�� 
    	// ���� Ŭ������ �ڵ带 ����
    	
    	// �ι� °�� ����
    	// ������ ���� Ŭ������ �ڵ尡 �ߺ��Ǳ� ����
    	// �ߺ��� ���� �Ǿ�� �ϱ⿡ super�� ���
    	
    	// ���� °�� avg���� ���� Ŭ������ �޼ҵ带 ȣ���ϱ� ���� super ���
    	// �ڵ� �ߺ� ����
    	
    	// ��ó�� �θ� Ŭ������ ����� ������ �� �ִ� ����� �������̵�

    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class OverridingCalculatorEx1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("���� �����" + c1.avg());
        c1.substract();
    }
}
