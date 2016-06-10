/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 9. 
 * @author : 한상호
 * @file   : MonthEnd.java
 * @story  : 
*/
public class MonthEnd2 {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는
	 * 프로그램
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다 라고 출력
	 * */
public static void main(String[] args) {
	// ------init---------
	Scanner scanner = new Scanner(System.in);
	String monend="",mon="";
	// -------op----------
	System.out.println("몇 월 입니까?");
	switch (scanner.next()) {
	case "1월":case "3월":case "5월":case "7월":case "9월":case "11월":
		monend = "31일";
	break;
	case "4월":case "6월":case "8월":case "10월":case "12월":
    monend = "30일";
    break;
	case "2월":
	monend = "29일";	
    break;
	default:
		System.out.println("잘못된 입력값입니다.");
		return;
	}
	System.out.println(mon+"은"+monend+"입니다.");
}

}
