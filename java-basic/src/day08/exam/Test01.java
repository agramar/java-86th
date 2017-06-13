/*
 * 		음료관리 프로그램
 * 
 * 		-----------------------
 * 		1. 전체조회
 * 		2. 가격조회
 * 		3. 칼로리조회
 * 		4. 종료 
 * 		-----------------------
 * 		메뉴 선택 : 1
 * 
 * 		1
 * 		-----------------------
 * 		음료		가격		칼로리
 * 		-----------------------
 * 		콜라		1500	237
 * 		사이다	1400	330
 * 		환타		1600	325
 * 		-----------------------
 * 
 * 		2
 * 		가격 : 1500
 * 		-----------------------
 * 		음료		가격		칼로리
 * 		-----------------------
 * 		콜라		1500	237
 * 		사이다	1400	330
 * 		-----------------------
 * 
 * 		3
 * 		칼로리 : 327
 * 		-----------------------
 * 		음료		가격		칼로리
 * 		-----------------------
 * 		콜라		1500	237
 * 		환타		1600	325
 * 		-----------------------
 * 		
 * 		text01.txt화일의 정보를 담을수 있는 drink class만들것
 * 		Test01.java - 메인 클래스
 * 		DrinkService - 관리 프로그램 처리
 * 	
 * 		기능별로 메소드를 분리 		 
 */
package day08.exam;

import java.io.FileNotFoundException;

public class Test01 {
	public static void main(String[] args) throws FileNotFoundException {
		DrinkService ds = new DrinkService();
		ds.start();
		
		
	}
}