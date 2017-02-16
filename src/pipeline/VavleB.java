package pipeline;

/**
 * 将字符串中的zz转换为yy
 * @author Administrator
 *
 */
public class VavleB implements Vavle {

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
		handing = handing.replaceAll("zz", "yy");
		System.out.println("阀门B执行完后："+handing);
		getNext().invoke(handing);
	}

}
