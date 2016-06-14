/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : Num1.java
 * @story : 1등을 출력하시오
 */
public class Num1 {
    /**
     * 학생수는 입력받습니다.
     * 학생의 점수만 입력해서
     * 최고점과 최저점만 출력하는 
     * 로직을 작성하시오
     * */
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i=0, count=0;
    
    System.out.println("학생수는 몇명입니까?");
    count = scanner.nextInt();
    int[] max= new int[count];
    int[] min= new int[count];
    
    System.out.println("점수를 입력하세요.");
    
    for (; i < max.length; i++) {
		max[i] = scanner.nextInt();
		min[i] = scanner.nextInt();
		 System.out.printf("%s%d%s%d","최고점",max[i],"최저점",min[i]);
	}
  }
}
