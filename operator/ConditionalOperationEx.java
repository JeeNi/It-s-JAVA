package operator;

public class ConditionalOperationEx{
    public static void main(String[] args) {


        //���� �����ڴ� ? ���� ���ǽĿ� ���� �ݷ�(:) �յ��� 
        //�ǿ����ڸ� �����Ͽ� true�� false�� ������ ���� �����
        
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "����" + grade + "����Դϴ�.");

        //85����B����Դϴ�.

    }
}
