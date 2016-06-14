/**
 * 
 */
package loop;

/**
 * @date   : 2016. 6. 13. 
 * @author : 한상호
 * @file   : ForLoopEx.java
 * @story  : 
*/
public class ForLoopEx {
    public static void main(String[] args) {
	    int i =0,sum=0;
	    
    	for (i = 1; i <= 10; i++) {
    		sum+=i;
		}
    	// 공차가 2인 1부터 10까지의 자연수 수열을 구하시오.
    System.out.println(sum);
    }
}
