/**
 * 
 */
package SuffixArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author takashi
 *	
 *	inducedSotringを用いてSAを構築します。
 *	ネストしたメソッドを用いてください。(static only use)
 *
 */
public class InducedSortingSAConstructer {
	private static final boolean DEBUG = true;
	private int[] a;// staticわからん
	
	/**
	 * Constructerは用いられません。
	 */
	public InducedSortingSAConstructer() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	/**
	 * indeced sortingによってSAを構築します。
	 * @param library
	 * @return
	 */
	public static AbstractSuffixArray constructSA(String library) {
//		やはり最初にひな形をつくってしまう方がいろいろとやりやすい。
		/* 初期化*/
		int anum = 0;
		int tnum = 0;
		int cnum = 0;
		int gnum = 0;
		int l = library.length();
		
		
//		step 0: Check S or L type.
		/* Sは1, Lは0.*/
		byte[] slindicator = checkSL(library);
		
//		step 1: Sort LMS suffixes.
		int[] suffixarray = sortLMSSuffixes(slindicator, library);
		
//		step 2: Sort L-type suffixes.
		suffixarray = sortLSuffixes(slindicator, suffixarray, library);
		
//		step 3: Sort S-type suffixes.
		suffixarray = sortSSufixes(slindicator, suffixarray, library);
		
		BasicSuffixArray harvest = new BasicSuffixArray(suffixarray, library);
		return harvest;
	}
	
	
	
	
	/**
	 * Check "S or L type" in the induced sorting algorithm.
	 * @param library
	 * @return 1:S 0:L
	 */
	private static byte[] checkSL(String library){
		
		byte[] indicator = new byte[library.length() + 1];
		
//		右となりと確認してその大小でSLtypeをつける
//		一緒にLMSも登録してしまったほうが速いかもしれない。そうしていない。
		indicator[library.length()] = 1;// 末尾は特別扱いするのがだんだんめんどくさくなってくる。
		// はじめに末尾になにか追加しておくべきかもしれない。(文字コードで一番小さい数を代入しておくなど)
		indicator[library.length() - 1] = 1;
		for(int i = library.length() - 2; i >= 0; i--){
			if (library.codePointAt(i) < library.codePointAt(i+1)){
				indicator[i] = 1;
			}
			else
				indicator[i] = 0;
		}
		
		return indicator;
		
	}
	
	
	/**
	 * Sort LMS-type suffixes and create the suffix array.
	 * 
	 * @param slindicator
	 * @param library
	 * @return presuffixarray with LMS-types' score.
	 */
	private static int[] sortLMSSuffixes(byte[] slindicator, String library){
		
		// TODO sortLMSの実装
		
		/* saの初期化 */
		int[] sa = new int[library.length() + 1];
		for(int i = 0; i < sa.length; i++){
			sa[i] = -1;
		}
		
//		まずLMSを発見する。
//		末尾は別扱いで登録する。
		List<Integer> lmslist = new ArrayList<Integer>(library.length() / 10);// 最大でもこのサイズで済む<- この仕様はやめたほうがいい
		int j = 0;
		for(int i = 0; i < library.length(); i++){
			if (slindicator[i] == 0){
				if (slindicator[i+1] == 1){
					lmslist.add(i+1);
					i++;
					j++;
				}
			}
		}
		
		
//		次にそれをソートする。
//		ソートはサブルーチン化したほうがスリムなのでそうする。
		int[] sortedlmslist = lazysortSuffixes(lmslist, library);
		
//		ソートしたものをSAに登録する。
//		最初のものはnullであるはずなので自明で問わずに登録する。
		sa[0] = sortedlmslist[0];// ここはlibrary.length + 1になっているはず
		// 確認ルーチン
		if (DEBUG){
			System.out.print(sa[0]); System.out.println(sortedlmslist[0]); System.out.print(library.length()+1);
			if (sa[0] != sortedlmslist[0]){
				new Exception().printStackTrace();
			}
		}
		
		int tmp = 0;
		for(int i = 0; i < sortedlmslist.length; i++){
			/* DNA塩基列のみへの対応、他への対応を考えるならこの部分はエラーとなる */
			tmp = library.codePointAt(sortedlmslist[i]);
			
			switch(tmp){
			case 'A':
				break;
			case 'T':
				break;
			case 'C':
				break;
			case 'G':
				break;
			}
		}
		
		return sa;
		
	}
	
	
	
	/**
	 * 与えられたsuffixの開始位置配列をもとにそれを整列して返す。
	 * 低速なアルゴリズムを仕様する。
	 * @param list
	 * @param library
	 * @return
	 */
	private static int[] lazysortSuffixes(List<Integer> list, String library){
		
//		libraryの中から指定場所の接尾辞を拾ってくる
		
		String tmpstr = new String();
		String pop = library.substring(list.get());
		for(int i = 0; i < list.size(); i++){
			
			tmpstr = pickUpSuffix(i, library);
		}
		
		return null;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param library
	 * @return
	 */
	private static String pickUpSuffix(int a, String library){
		return library.substring(a);
	}
	
	
	
	/**
	 * Sort L-type suffixes and update the suffix array.
	 * @param slindicator
	 * @param sa
	 * @param library
	 * @return updated suffixarray with L-types' score.
	 */
	private static int[] sortLSuffixes(byte[] slindicator, int[] sa, String library){
		// TODO sortLSuffixesの実装
		int[] updsa = sa;
		
		
		
		return updsa;
		
	}
	
	
	/**
	 * Sort S-type suffixes and update the suffix array.
	 * @param slindicator
	 * @param sa
	 * @param library
	 * @return updated suffixarray with S-types' score.
	 */
	private static int[] sortSSufixes(byte[] slindicator, int[] sa, String library){
		// TODO sortSSuffixesの実装
		int[] updsa = sa;
		
		
		return updsa;
	}

}
