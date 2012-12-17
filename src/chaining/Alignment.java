/**
 * Copyright(c) 2012, Takashi Matsuda
 */
package chaining;

import java.util.Comparator;


/**
 * 
 * @author takashi
 *
 */
public class Alignment implements Comparable<Alignment>{
	
	// どうしてcomparatorとserializableは表裏一体なのか。質問しよう。
	
//	まとなってはgitのレポジトリをworkspace直下に持ってきても問題なかったなあ。
	
//	comparatorはクラスそのものに入れるものではなかった！！！！！
//  内部クラスとして定義するのもスマートかと
//	代わりと言ってはなんだが、comparableを使ってみよう
	/*
	 * sx, ex, sy, ey, scoreの実装です
	 */
	/*
	 * 便利のため、getメソッドの実装は後回しにしてpublicとして実装します。
	 */
	public int sx;
	public int ex;
	public int sy;
	public int ey;
	public double score;
	
	
	/**
	 * null constructer
	 * 他に充実したコンストラクタを設けること
	 */
	Alignment(){
		
	}
	
	@Override
	public int compareTo(Alignment o) {
		// TODO 自動生成されたメソッド・スタブ
		if (this.ex <= o.sx && this.ey <= o.ey ){
			return -1;
		}
		else if (this.ex >= o.sx && this.ey >= o.ey){
			return 1;
		}
		else
			return 0;
	}
	
	
	/**
	 * まだ実装していません。とりあえずこれでいい。
	 * 必要かどうか謎。RedBlackTreeの実装しだい。
	 * 
	 * 
	 * @author takashi
	 *
	 */
	public class AlignmentComparator implements Comparator<Alignment> {
		
		@Override
		public int compare(Alignment o1, Alignment o2) {
			// TODO 自動生成されたメソッド・スタブ
			
			return 0;
		}
	}
	
}
