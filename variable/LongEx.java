package variable;

public class LongEx {
    public static void main(String[] args){

        //������ �� �ִ� ���� ������ -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //int Ÿ���� ���� ������ �Ѿ�� ū ������ �ݵ�� �ҹ��� 'l' or �빮�� 'L'�� ����
        //bcuz ������ ���� �߻� (���� �빮�� 'L' ���, �̴� ���� '1'�� ȥ�� ��)

        long var1 = 10;
        long var2 = 20L;
        //long var3 = 1000000000000;  //������ ����  //���� ���ͷ��� 'L'�� ������ ����
        long var4 = 1000000000000L;

        System.out.println(var1);     //10
        System.out.println(var2);     //20
        System.out.println(var4);     //1000000000000
        

    }
}
