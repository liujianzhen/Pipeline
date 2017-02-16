package pipeline;

/**
 * 管道接口
 * @author Administrator
 *
 */
public interface Pipeline {

	//获取该管道的第一个阀门
	public Vavle getFirst();
	
	//获取基础阀门
	public Vavle getBasic();
	
	//设置基础阀门
	public void setBasic(Vavle vavle);
	
	//添加阀门
	public void addVavle(Vavle vavle);
	
}
