/**
 * 
 */
package controller;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : Kapu.java
 * @story :
 */
public class kaup {
	public String execute(double tall2,double kg2){
		double tall = tall2,kg = kg2,kaup = 0.0;
		String anser = "";
		kaup = kg / (tall / 100) / (tall / 100);
		if (kaup < 18.5) {
			anser = "저체중";
		} else if (kaup >= 18.5 && kaup <= 22.9) {
			anser = "정상체중";
		} else if (kaup >= 23.0 && kaup <= 24.9) {
			anser = "위험체중";
		} else if (kaup >= 25.0 && kaup <= 29.9) {
			anser = "비만 1단계";
		} else if (kaup > 30 && kaup < 40) {
			anser = "비만 2단계";
		} else if (kaup >= 40.0) {
			anser = "비만 3단계";
		}
		return "비만도:" + kaup + "분류:" + anser;

	}
}

