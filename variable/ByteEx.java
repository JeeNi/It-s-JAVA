package variable;

public class ByteEx{
    public static void main(String[] args){
        
        //byte Ÿ���� ���� ���� �� ���� �Ǵ� �̹��� ���� ����(���̳ʸ�) �����͸� ó���� ���� ���
        //������ �� �ִ� ���� ������ -128 ~ 127
        //���� ��, ������ �� �ִ� ���� ������ �ʰ��ϸ� �ּҰ� ���� �ٽ� �ݺ� ����
        //�ٸ� ���� Ÿ�� ���� �̿� ���� ������� ó��

        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; //������ ����

        System.out.println(var1);    //-128
        System.out.println(var2);    //-30   
        System.out.println(var3);    //0   
        System.out.println(var4);    //30
        System.out.println(var5);    //127
        


    }
    
}
