package Test;

import java.util.Scanner;

public class PrivateTraining {
	public static void main(String[] args) {
		//�� Ʈ�� ���
		int a= 5;
		for(int b = 0; b<a; b++) {//a�� ����
			for(int c= a-1; c>b; c--) {//���� �����
				System.out.print(" ");
			}
			for(int d=0; d<2*b+1; d++) {//�� ���
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		//�� ������ ���
		int e=1; //*�� ���� ����
		int f=3; //������ ���۰���
		
		for(int g= 0; g<7; g++) {//7�� �����(7�� �ݺ�)
			if(g<3) {//�� �ﰢ��
				for(int h=f; h>0; h--) {
					System.out.print(" ");
				}
				for(int i=0; i<e; i++) {
					System.out.print("*");
				}
				for(int h=f; h>0; h--) {
					System.out.print(" ");
				}
				System.out.println("");
				
				e+=2;//*ũ�� ����
				f--; //*���� ����
			}else {//�ؿ� �ﰢ��
				for(int h=0; h<f; h++) {//����
					System.out.print(" ");
				}
				for(int i=e; i>0; i--) {//��
					System.out.print("*");
				}
				for(int h =0; h<f; h++) {//����ݺ�
					System.out.print(" ");
				}
				System.out.println("");
				
				e-=2;//�� ����
				f++; //���� ����
			}
		}
		System.out.println("");
		
		//up&�ٿ� ����
		int answer = (int)(Math.random()*100+1);//���亯���� answer�� 1���� 100���� ������ ���� ����
		int input;//�����ϴ� ����� �Է��� ���� ����
		
		Scanner sc = new Scanner(System.in);//��ĳ�� ��ü ����(�Է¹ޱ� ����)
		
		while(true) {
			System.out.print("���ڸ� �Է����ּ���(1~100) : ");
			input = sc.nextInt();//�Է¹��� ���ڸ� input�� ����
			
			if(input>100) {//100�� �ʰ��ϸ� ����
				System.out.println("����!");
			}else if(input<answer) {
				System.out.println("��!");
			}else if(input>answer){
				System.out.println("�ٿ�!");
			}else {
				System.out.println("����!");
				break;
			}
		}
	}

}
