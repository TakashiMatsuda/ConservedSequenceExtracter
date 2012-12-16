package chaining;

import java.util.*;

/**
 * 赤黒木の実装
 * 
 * @param <K>  the thpe of keys maintained by this map
 * @param	 <V> the type of mapped values
 * @author takashi
 *	 @see Map
 * @see TreeMap
 * @see Collection
 * @see Comparator
 */
public class RedBlackMultiTree<K,V> {
	// 先頭はnull;
	// ほとんどTreeMapの真似
	
	// TreeMapの拡張として定義できないだろうか
	// できなかったら、思想を学んでつける
	// MultiKeyを実現する方法だが、普通にやればそうなる
	
	// Mapインターフェースの実装を読んでいる
	// 中に知識を格納するためのサブインターフェースを定義していた
	// keyからの参照関数の仕様でおそらくMultiKeyは実現されていない
	// そこを変えれば良い、どのようにするべきか
//	おそらくパフォーマンスの問題でそうしているんだろうか、
//	リストで返す？
//	参照手続きのオーバーロードをしたいだけ
//	それをするとほとんどのもとからあったメソッドは動かなくなる
//	自分で定義した方が速いのでは
//	単純にRedBlackMultiTreeと言っているが、どのメソッドが必要だったのか
//	もう一度確認して、
//	必要なメソッドだけ実装する
//	必要なメソッドは
//	挿入
//	参照
//	削除、このくらいか
	
//	極力無駄なものは省いて軽量に実装しよう
	
	/**
	 * The comparator used to maintain order in this tree map, or
	 * null if it uses the natural ordering of its keys.
	 * 
	 *@serial
	 */
	private final Comparator<? super K> comparator;
	
	/**
	 * The number of entries in the tree
	 */
	private transient int size = 0;
	
	/**
	 * The number of structural modifications to the tree.
	 * 
	 */
	private transient int modCount = 0;
	
	
	/**
	 * Constructs a new, empty redblackmultitree, using the natural ordering of
	 * keys. All keys inserted into the map mulst implement the {@link Comparable}
	 * interface. Furthermore, all such keys must be 
	 * <em>mutually comparable</em>: {@code k1.compareTo(k2)}...(to be continued)
	 * 
	 */
	public RedBlackMultiTree(){
		comparator = null;
	}
	
	public RedBlackMultiTree(Comparator<? super K> comparator){
		this.comparator = comparator;
	}
	
	// その他ライブラリコードだと様々なコンストラクタが定義されているが、必要ないので割愛
}
