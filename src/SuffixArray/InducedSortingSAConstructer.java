/**
 * 
 */
package SuffixArray;

/**
 * @author takashi
 *	
 *	inducedSotringを用いてSAを構築します。
 *	ネストしたメソッドを用いてください。(static only use)
 *
 */
public class InducedSortingSAConstructer {

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
		
		int[] suffixarray = new int[library.length()];
		
//		step 0: Check S or L type.
		/*
		 * Sは1, Lは0.
		 */
		
		
//		step 1: Sort LMS suffixes.
		
//		step 2: Sort L-type suffixes.
		
//		step 3: Sort S-type suffixes.
		
		return null;
	}
	
	
	/**
	 * Check "S or L type" in the induced sorting algorithm.
	 * @param library
	 * @return
	 */
	private byte[] checkSL(String library){
		byte[] indicator = new byte[library.length()];
		
		
		return indicator;
	}

}
