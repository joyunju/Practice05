package com.javaex.ex04;

public class Base {

	// 필드
	private String service;

	// 생성자
	public void service(String state) {
		// 코드작성할것
		this.service = state;

		if (state == "낮") {
			this.day();
		} else if (state.equals("오후")) {
			this.afternoon();
		} else if (state.equals("밤")) {
			this.night();
		}

	}

	// 메소드 - gs

	// 메소드 - 일반
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤에는 숙면");
		// 코드작성할것

	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
