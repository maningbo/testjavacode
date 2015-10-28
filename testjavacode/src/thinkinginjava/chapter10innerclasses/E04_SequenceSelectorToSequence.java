package thinkinginjava.chapter10innerclasses;
/**
 *  E04_SequenceSelectorToSequence.java
 *  Description:
 *  
 *  CreateDate: 2015年10月26日 上午9:16:34 
 * 
 *  @author 马宁波
 */

class Sequence2{
	private Object[] items;
	private int next;
	public Sequence2(int size){items=new Object[size];}
	public void add(Object x){
		if(next<items.length){
			items[next++]=x;
		}
	}
	private class SequenceSelector implements Selector{
		private int i;
		public boolean end(){return i==items.length;}
		public Object current(){return items[i];}
		public void next(){if(i<items.length){i++;}}
		public Sequence2 sequence(){return Sequence2.this;}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public boolean check(){
		return this == ((SequenceSelector)selector()).sequence();
	}
}

public class E04_SequenceSelectorToSequence {

}
