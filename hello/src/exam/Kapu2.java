/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10. 
 * @author : 한상호
 * @file   : Kapu2.java
 * @story  : 카우푸지수 구하는 프로그램
*/
public class Kapu2 {
	/**
	 * 개발자님 BMI 지수가 너무 길어요.
	 * 소수점 이하 2자리에서 끊어주세요.
	 */
	public static void main(String[] args) {
		//-----init------
		Scanner scanner = new Scanner(System.in);
		String name ="",result="";
		double height = 0.0,weight = 0.0,kaup = 0.0;
		//------op-------
		System.out.println("이름?");
		name =scanner.next();
		System.out.println("키?");
		height = scanner.nextDouble();
		System.out.println("몸무게?");
		weight = scanner.nextDouble();
		kaup = weight / (height/100) / (height/100);
		if (kaup < 18.5) {
			result = "저체중";
		} else if(kaup >= 18.5 && kaup <= 22.9){
			result = "정상체중";
		} else if(kaup >= 23.0 && kaup <= 24.9){
			result = "위험체중";
		} else if(kaup >= 25.0 && kaup <= 29.9){
			result = "비만 1단계";
		} else if(kaup > 30 && kaup < 40){
			result = "비만 2단계";
		} else if(kaup >= 40.0){
			result = "비만 3단계";
		}
		System.out.println(name+"은 BMI지수는"
		+Double.parseDouble(String.format("%.2f", kaup))+"이고, "
				+ ""+result+"이다");
		
	}

}
