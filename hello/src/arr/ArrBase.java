/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : ArrBase.java
 * @story : 배열(array)의 기초
 */
public class ArrBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// int avg[0]=0,avg[1]=0,avg[2]=0,gradeA[0]=0,gradeA[1]=0,gradeA[2]=0;
		// String name[0]="",name[1]="",name[2]="",grade[0]="",grade[2]="",grade[1]="";
		int[]avg = new int[3];
		// avg[0] = 0;	avg[1] = 0;	avg[2] = 0;
		int[]gradeA = new int[3];
		int i = 0;		
		String[]name = new String[3];
		String[]grade = new String[3];
		
		
		name[0]=scanner.next();
		avg[0] =scanner.nextInt();
		System.out.println("이름,점수 입력");
		name[1]=scanner.next();
		avg[1] = scanner.nextInt();
		System.out.println("이름,점수 입력");
		name[2]=scanner.next();
		avg[2] = scanner.nextInt();
		
		for (; i < avg.length; i++) {
			System.out.println("이름,점수 입력");
			name[i]=scanner.next();
			avg[i] =scanner.nextInt();
		}
		
		
		if (avg[0]>avg[1]&&avg[1]>avg[2]) {
			grade[0]=name[0];
			grade[1]=name[1];
			grade[2]=name[2];
			gradeA[0]=avg[0];
			gradeA[1]=avg[1];
			gradeA[2]=avg[2];
		} else if(avg[0]>avg[1]&&avg[2]>avg[1]){
			grade[0]=name[0];
			grade[1]=name[2];
			grade[2]=name[1];
			gradeA[0]=avg[0];
			gradeA[1]=avg[2];
			gradeA[2]=avg[1];
		}else if(avg[1]>avg[0]&&avg[0]>avg[2])
			{
		grade[0]=name[1];
		grade[1]=name[0];
		grade[2]=name[2];
		gradeA[0]=avg[1];
		gradeA[1]=avg[0];
		gradeA[2]=avg[2];}
		else if(avg[1]>avg[0]&&avg[2]>avg[0]){
			
		
		grade[0]=name[1];
		grade[1]=name[2];
		grade[2]=name[0];
		gradeA[0]=avg[1];
		gradeA[1]=avg[2];
		gradeA[2]=avg[0];
		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
			grade[0]=name[2];
			grade[1]=name[0];
			grade[2]=name[1];
			gradeA[0]=avg[2];
			gradeA[1]=avg[0];
			gradeA[2]=avg[1];
		}else if(avg[2]>avg[0]&&avg[0]>avg[1]){
			grade[0]=name[2];
			grade[1]=name[0];
			grade[2]=name[1];
			gradeA[0]=avg[2];
			gradeA[1]=avg[0];
			gradeA[2]=avg[1];}
		
			{
		
				System.out.println("1등+"+grade[0]+"점수는"+gradeA[0] );
				System.out.println("2등+"+grade[1]+"점수는"+gradeA[1] );
				System.out.println("3등+"+grade[2]+"점수는"+gradeA[2] );
				
			}
	}
	}
