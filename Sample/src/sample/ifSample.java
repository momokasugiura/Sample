package sample;

public class ifSample {

	public static void main(String[] args) {
		var score = 80;//成績
		
		if(score >= 60) {
			System.out.println("合格です！");
		} else if (score >= 80) {
			System.out.println("よくできました！");
		} else if(score ==100) {
			System.out.print("満点です！");
		} else {
			System.out.println("赤点です。。。");
			
		}

	}

}
