// 引数に２つのdouble値を指定すると
// 2つの値の差（大きいほうから小さいほうを引き算）を表示するメソッド
// メソッドの名前や仮引数の名前も自分で考える

class Renshu03 {

	public static void main(String[] args) {

		// 引数に２つのdouble値を指定する
		kyoui(0.72, 1.05);

	}

/*------------------------ここからkyouiメソッド------------------------*/

	static void kyoui(double KC, double OS) {

		// 大きい値から小さい値を引き算する条件分岐
		double kakusa = OS - KC;
		if (kakusa < 0) {
			kakusa = kakusa * -1; // 値が負になるので-1をかける｡
			System.out.println("差は " + kakusa + " です｡");
		} else {
			System.out.println("差は " + kakusa + " です｡");
		}
/*------------------------kyouiメソッドここまで------------------------*/
	}

}
