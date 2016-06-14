/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : ArrAssign.java
 * @story :
 */
public class ArrAssign {
	public static void main(String[] args) {
		/**
		 * 전교생이 몇명인지 몰라요.
		 * 전교생 수를 입력받고
		 * 학생의 이름과 점수를
		 * 입력받고, 이것을 출력하세요
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0,count=0;
		
		System.out.println("학생 수가 몇명입니까?");
		count = scanner.nextInt();
		String[] name = new String[count];
		int[] num = new int[count];
		int[] age = new int[count];
		
		System.out.println("?명의 이름,나이를 입력하세요");
		
		for (;i < name.length; i++) {
			num[i] =i+1;
			name[i] = scanner.next();
			age[i] = scanner.nextInt();
		}
		System.out.println("===================\n");
		System.out.println("학번| 이름 | 나이 \n");
		System.out.println("===================\n");		
		for (i= 0; i < age.length; i++) {
			System.out.printf("%s\t%s\t%d\n",num[i],name[i],age[i]);
	    }
	}
}