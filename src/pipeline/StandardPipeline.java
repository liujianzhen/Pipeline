package pipeline;

/**
 * 管道实现类
 * 我们一般的操作是先通过setBasic设置基础阀门，接着按顺序添加其他阀门，
 * 执行时的顺序是：先添加进来的先执行，最后才执行基础阀门。
 * @author Administrator
 *
 */
public class StandardPipeline implements Pipeline {

	protected Vavle first = null;
	
	protected Vavle basic = null;
	
	@Override
	public Vavle getFirst() {
		return first;
	}

	@Override
	public Vavle getBasic() {
		return basic;
	}

	@Override
	public void setBasic(Vavle vavle) {
		this.basic = vavle;
	}

	@Override
	public void addVavle(Vavle vavle) {
		
		if(first == null){
			//管道为  basic 的情况
			first = vavle;
			vavle.setNext(basic);
		}else{
			Vavle current = first;
			while(current != null){
				if(current.getNext() == basic){
					//管道为  first-basic 的情况
					current.setNext(vavle);
					vavle.setNext(basic);
					break;
				}
				//管道为 first-vavle1-...-basic 的情况
				current = current.getNext();
			}
		}
	}

}
