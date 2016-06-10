/**
 * 
 */
package branch;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @date   : 2016. 6. 9. 
 * @author : 한상호
 * @file   : Num1.java
 * @story  : 
*/
public class Num1 {
    /**
     * 저희 반은 학생수가 3명입니다.
     * 학생의 평균점수는 0~100점 사이입니다.
     * 3명의 평균점수를 입력하면
     * 1등 홍길동
     * 2등 김유신
     * 3등 김구
     * 이렇게 나오도록 해주세요. 동점은 없습니다.
     * 단, 학생이름은 스캐너로 입력받습니다.
     * 홍길동
     * 49
     * 김유신
     * 78
     * 김구
     * 96
     * ================
     * 1등 김구 96점
     * 2등 김유신 78점
     * 3등 홍길동 49점
     * ================
     */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H=0,K=0,Ku=0;
		String top="";
		System.out.println("3명의 평균 점수를 입력하세요");
		System.out.println("홍길동");
		H = scanner.nextInt();
		System.out.println("김유신");
		K = scanner.nextInt();
		System.out.println("김  구");
		Ku = scanner.nextInt();
		if (H > K&&H >Ku) {
			top = "1등";
			if (H < K) {
			top = "2등";
			}else {
			top = "3등";	
			}
		}
		System.out.println(""+top+"");
	}
}
