package pipeline;

/**
 * 阀门接口
 * 多个阀门之间是以链表的形式串起来的
 * @author Administrator
 *
 */
public interface Vavle {

	//获取下一个阀门
	public Vavle getNext();
	
	//设置下一个阀门
	public void setNext(Vavle vavle);
	
	//执行此阀门的处理方法
	public void invoke(String handing);
	
}
