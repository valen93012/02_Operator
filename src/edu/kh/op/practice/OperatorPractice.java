package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1 () {
			
		System.out.print("인원 수: ");
		int es1 = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int es2 = sc.nextInt();
			
		System.out.println(es2 / es1);
		System.out.println(es2 % es1);
		
	}
	
	public void practice2() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("이름: ");
	    String name = sc.nextLine();

	    System.out.print("학년: ");
	    int grade = sc.nextInt();

	    System.out.print("반: ");
	    int classNum = sc.nextInt();

	    System.out.print("번호: ");
	    int num = sc.nextInt();
	    
	    sc.nextLine(); // 버퍼에 남아있는 엔터키 제거

	    System.out.print("성별(남학생/여학생): ");
	    String gender = sc.nextLine();

	    System.out.print("성적: ");
	    double score = sc.nextDouble();

	    System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, classNum, num, name, gender, score);
	    
	    
	}
	
	public void practice3() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("국어: ");
	    int kor = sc.nextInt();

	    System.out.print("영어: ");
	    int eng = sc.nextInt();

	    System.out.print("수학: ");
	    int math = sc.nextInt();

	    int sum = kor + eng + math; // 합계
	    double avg = sum / 3.0; // 평균

	    System.out.println("합계: " + sum);
	    System.out.println("평균: " + avg);

	    boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
	    System.out.println(result ? "합격" : "불합격");
	    
	}
	

	
}