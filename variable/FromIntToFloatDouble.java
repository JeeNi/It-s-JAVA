package variable;

public class FromIntToFloatDouble {
    public static void main(String[] args){

        
        /*
        int num1 = 123456780;
        int num2 = 123456780;
        float num3 = num2;
        num2 = (int) num3;
        int result = num1 - num2;
        System.out.println(result);
        */

        //-4
        //�̴� int ���� float Ÿ������ �ڵ� ��ȯ�ϸ鼭 ������ �߻��߱� ����
        //������ float Ÿ���� ��Ʈ ���� �Ҵ� �Ǿ� ����

        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result);

        //0

    }
}
