package chaining;

import java.util.HashSet;
import java.util.ArrayList;
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
	
	/**
	 * アラインメントを行う。
	 * @param x
	 * @param y
	 * @return ローカルアラインメントのリスト
	 */
	private List<Alignment> localAlignment(String x, String y){
//		ArrayかLinkedか
//		Arrayだ
//		下流での使い方をそのように最適化した。
		return null;
	}
	
	/**
	 * fragmentsを初期化します。
	 */
	private void InitializeFragments(){
		List<Alignment> chips = localAlignment(this.seqP, this.seqQ);
		HashSet<Alignment> tmpS = new HashSet<Alignment>();
		for(Alignment k:chips){
			// 超重い
//			やっぱり継承してそれ専用のものを作ったほうがよい。いくら何でも複雑すぎて遅すぎる。
			int exk = k.ex;
			int sxk = k.sx;
			// Mapへの挿入はkeyとvalueのセットでおこなわなければならず、複雑になる。
			if (fragments.containsKey(sxk)){
				fragments.get(sxk).add(k);
			}
			else{
				tmpS.clear();// 危険、動作確認が絶対に必要
				tmpS.add(k);
				fragments.put(sxk, tmpS);// 安全性、putの動作でtmpSをどうあつかっているのか
			}
			if (fragments.containsKey(exk)){
				fragments.get(exk).add(k);	
			}
			else{				
//				fragments.put(exk, HashSet<Alignment>().add(k));// ここの書き方が難しい
//				妥協すれば次のようにかけるが
				tmpS.clear();// 危険、動作確認が絶対に必要
				tmpS.add(k);
				fragments.put(exk, tmpS);// 安全性、putの動作でtmpSをどうあつかっているのか
			}
		}
	}
	
	/**
	 * あまり綺麗ではないなー。
	 * グローバル変数定義なのでメモリを食う。
	 * 今回は別に問題ないが、汚いし余裕あったら変えたい。
	 * 
	 */
	private void makeChain(){
		
	}
	
	
}
