/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 10. 
 * @author : 한상호
 * @file   : oddEven.java
 * @story  : 
*/
public class oddEven {
    /**
     * 개발자님, 홀짝 게임하나 만들어 주세요. 
     * 사용자가 홀인지 짝인지 맞추면
     * WIN 틀리면 LOOSE 
     */
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	String con = "";
	int num=0,call=0,ran1=0;
    num = random.nextInt(10)+1;
    System.out.println("== 개발자만 보는 화면 ==");
    System.out.println("랜덤수는"+num);
    System.out.println("돈을 거시는데 짝이라고 생각하면 0을 "
    		+ "홀이라고 생각하면 1을 입력하세요.");
    call = scanner.nextInt();
	switch (call) {
	case 1:
		con = "LOOSE";
		break;
	default:
		con = "WIN";
		break;
	}
    System.out.println(con);
	}
}
