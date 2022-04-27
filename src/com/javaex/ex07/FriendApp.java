// 1. java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성
// 2. 이들을 Friend 객체 배열에 저장 
// 3. 친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요.

package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		// 친구정보 3명 입력 로직 --> 반복문 사용
		for (int i = 0; i < friendArray.length; i++) {

			Friend friend = new Friend(); // Friend 클래스

			System.out.print("이름 : ");
			String name = sc.nextLine();
			friend.setName(name);
			// next() 는 문자 혹은 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력을 받는다.
			// nextLine()의 경우에는 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다.

			System.out.print("핸드폰 : ");
			friend.setHp(sc.nextLine());

			System.out.print("학교 : ");
			friend.setSchool(sc.nextLine());

			System.out.println("-----------------");

			friendArray[i] = friend; // 배열에 저장

		}

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();

			// friendArray[0].showInfo();
			// friendArray[1].showInfo();
			// friendArray[2].showInfo();
		}

		sc.close();
	}

}
