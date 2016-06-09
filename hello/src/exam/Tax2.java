/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8. 
 * @author : 한상호
 * @file   : Tax2.java
 * @story  : 
*/
public class Tax2 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균***점]
	 * 을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점 이하는 절삭합니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		int kor=0,eng=0,math=0,total=0,avg=0;
		System.out.println("국어점수");
		kor = scanner.nextInt();
		System.out.println("영어점수");
		eng = scanner.nextInt();
		System.out.println("수학점수");
		math = scanner.nextInt();
		total = kor + eng + math;
		avg = total / 3;
		System.out.println("["+name+"] : 총점"+total+"점, 평균"+avg+"점");
	}
}
