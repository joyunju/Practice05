//GoodsApp 클래스는 수정하지 말 것!

package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods cup = new Goods("머그컵", 2000);

		camera.setName("니콘");
		camera.setPrice(400000);

		camera.showInfo();
		cup.showInfo();
	}

}
