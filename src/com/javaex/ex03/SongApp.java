//아래의 출력결과를 예상하여 작성하세요.
//(코드를 작성해서 예상과 맞는지 확인해 보세요.)

package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		//출력 
		s1.toString();
		//Song(파라미터5개)
		//Song(파라미터6개)
		
		s1.showInfo();
		//아이유, 좋은날 (Real, 2010, 3번 track, 이민수 작곡 )
	}

}
