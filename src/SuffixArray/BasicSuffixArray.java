/**
 * 
 */
package SuffixArray;

/**
 * @author takashi
 *
 */
public class BasicSuffixArray implements AbstractSuffixArray {
	/*
	 * library: このsuffix arrayと関連付けられる文字列
	 * array: このクラスが保有するsuffix array
	 */
	private String library;// 必要ない？メモリのムダな気がする。元クラスで管理してあればOK、staticでやればいいのかな
	private int[] array;
	private int len;
	
	/**
	 * 具体的なarrayの構築方法は別クラスで定義される
	 */
	public BasicSuffixArray(String a) {
		this.library = a;
		this.len = library.length();
	}
	
	
	/**
	 * keyに合致する文字列を二分探索します。
	 * BWTに比べて低速です。 
	 * @param key
	 * @return
	 */
	@Override
	public int[] basicsearch(String key){
		// 二分探索
		// 再帰
		int l = len;
//		初期化：両端にも外れてしまうものでないか確認する
		
//		array[len/2]がkeyよりも大きかったら後ろ半分についてsearch
//							小さかったら前半分についてsearch
//		keyと候補の一部が完全一致したら・・返す、でも続けるので一旦答えセットに格納しておく
//		l と　rが一致したら、終了して現在の値を返す
		
		
		return null;
	}

}
