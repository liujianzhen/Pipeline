package pipeline;

/**
 * 基础阀门
 * 将字符串aa转换成bb
 * @author Administrator
 *
 */
public class BasicVavle implements Vavle{

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
		handing = handing.replaceAll("aa", "bb");
		System.out.println("basic阀门执行完后："+handing);
	}

}
