package pipeline;

/**
 * 将字符串中的11转换为22
 * @author Administrator
 *
 */
public class VavleA implements Vavle {

	protected Vavle next = null;
	
	@Override
	public Vavle getNext() {
		return next;
	}

	@Override
	public void setNext(Vavle vavle) {
		this.next = vavle;
	}

	@Override
	public void invoke(String handing) {
		handing = handing.replaceAll("11", "22");
		System.out.println("阀门A执行完后："+handing);
		getNext().invoke(handing);
	}

}
