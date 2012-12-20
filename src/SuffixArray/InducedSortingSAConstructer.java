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
	 * @return
	 */
	private static byte[] checkSL(String library){
		
		byte[] indicator = new byte[library.length()];
		
//		右となりと確認してその大小でSLtypeをつける
		
//		イテレータを使いたい
		for(int i = 0; i < library.length(); i++){
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
		
		// TODO sortLMEの実装
		
		int[] sa = new int[library.length()];
		
		
		
		return sa;
		
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
