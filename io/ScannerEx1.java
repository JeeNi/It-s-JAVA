package io;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {					
			System.out.println(sc.nextInt()*1000);
		}
		sc. close();
		
		// �Ʒ� ������ �� �� �����ϰ� �� �� ����� ����ϸ� ���α׷��� �������� 
		// �� ������ ���α׷��� �ٽ� ������ �ʿ� ���� ���ø����̼ǰ� ��� ��ȣ�ۿ���
		
		/*
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();						// nextInt()��� �޼ҵ�� �� ������ ����Ǹ�
		System.out.println(i*1000);					// ���α׷��� ���⼭ ������ ���߰� ��ٸ��� ����
		sc. close();
		*/
	}

}
