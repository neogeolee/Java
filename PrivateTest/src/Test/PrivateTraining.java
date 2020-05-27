package Test;

import java.util.Scanner;

public class PrivateTraining {
	public static void main(String[] args) {
		//별 트리 출력
		int a= 5;
		for(int b = 0; b<a; b++) {//a줄 형성
			for(int c= a-1; c>b; c--) {//공백 만들기
				System.out.print(" ");
			}
			for(int d=0; d<2*b+1; d++) {//별 출력
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		//별 마름모 출력
		int e=1; //*의 시작 갯수
		int f=3; //공백의 시작갯수
		
		for(int g= 0; g<7; g++) {//7줄 만들기(7번 반복)
			if(g<3) {//위 삼각형
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
				
				e+=2;//*크기 증가
				f--; //*공백 감소
			}else {//밑에 삼각형
				for(int h=0; h<f; h++) {//공백
					System.out.print(" ");
				}
				for(int i=e; i>0; i--) {//별
					System.out.print("*");
				}
				for(int h =0; h<f; h++) {//공백반복
					System.out.print(" ");
				}
				System.out.println("");
				
				e-=2;//별 감소
				f++; //공백 증가
			}
		}
		System.out.println("");
		
		//up&다운 게임
		int answer = (int)(Math.random()*100+1);//정답변수인 answer에 1에서 100까지 무작위 변수 저장
		int input;//게임하는 사람이 입력한 변수 저장
		
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성(입력받기 위해)
		
		while(true) {
			System.out.print("숫자를 입력해주세요(1~100) : ");
			input = sc.nextInt();//입력받은 숫자를 input에 저장
			
			if(input>100) {//100을 초과하면 에러
				System.out.println("에러!");
			}else if(input<answer) {
				System.out.println("업!");
			}else if(input>answer){
				System.out.println("다운!");
			}else {
				System.out.println("정답!");
				break;
			}
		}
	}

}
