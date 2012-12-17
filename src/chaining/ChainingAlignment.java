package chaining;


/**
 * Chainingアルゴリズムの実装クラスです。
 * chainingする対象となるローカルアラインメントを平衡木で保管・管理します。
 * @author takashi
 *
 */
public class ChainingAlignment {

	// TODO RedBlackTreeをライブラリの継承で作りたいと思っています
	RedBlackMultiTree<Integer, String> fragments;
	
	/*
	 * 文字列Pの開始位置sxから終了位置ex-1(sx < ex)まで連続した部分文字列を
	 * P[sx, ex)とする。
	 * 
	 * Pはこれからは配列名+List
	 * 
	 */
	/*
	 * 2本の配列と共にクラスは定義される
	 * 配列が変わればオブジェクトの再利用は難しい設計とする
	 */
	String seqP;
	String seqQ;
	
	/**
	 * 2つのsequenceと共にこのクラスのオブジェクトインスタンスとオブジェクト参照を生成します。
	 * @param p
	 * @param q
	 */
	ChainingAlignment(String p, String q){
		this.seqP = p;
		this.seqQ = q;
		this.fragments = new RedBlackMultiTree<Integer, String>();// この型でいいかは微妙
		
	}
	
	// アラインメントを扱うクラスを定義したい。
	// そのクラスはComparatorを継承していたほうがよい。
	
	
	
	
	
	
	
	
}
