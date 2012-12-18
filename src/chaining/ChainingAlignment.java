package chaining;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Chainingアルゴリズムの実装クラスです。
 * chainingする対象となるローカルアラインメントを平衡木で保管・管理します。
 * @author takashi
 *
 */
public class ChainingAlignment {

	// TODO RedBlackTreeをライブラリの継承で作りたいと思っています
//	RedBlackMultiTree<Integer, Alignment> fragments;
	
	// これ違うんじゃないか
//	(A.sx, A), (A.ex, A)の形で格納する。第一変数でソートする。なのだから
	
	
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
	

	/*
	 * fragments: アラインメントのリスト
	 * chain: 候補鎖
	 * 
	 * パフォーマンスがよくないので、このコードに適した
	 * カスタムド赤黒木を独自に実装するのがテスト通過後の目標。
	 * 
	 * 木の深さのメソッドがあるかどうか不安。なかったら自分で継承しなければいけない。
	 * 
	 * fragmentsは木である必要性はなく、単なるリストなのだが、
	 * SortedMapのライブラリを利用した方が実装が楽なので、そうする。
	 * 
	 */
	Map<Integer, Set<Alignment>> fragments;
	Map<Integer, Set<Alignment>> chain;
	
	
	
	/**
	 * 2つのsequenceと共にこのクラスのオブジェクトインスタンスとオブジェクト参照を生成します。
	 * @param p
	 * @param q
	 */
	ChainingAlignment(String p, String q){
		this.seqP = p;
		this.seqQ = q;
		this.fragments = new TreeMap<Integer, Set<Alignment>>();
		this.chain = new TreeMap<Integer, Set<Alignment>>();
		
//		各アラインメントに各鎖？
	}
	
	
//	Map<Integer, Alignment> chain;
	
	/*
	 * アラインメントを行う。
	 *	
	 */
	
	private List<Alignment> localAlignment(String x, String y){
		return null;
		
	}
	
	
	
	
	
	
	
	
}
