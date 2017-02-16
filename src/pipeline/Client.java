package pipeline;

public class Client {

	public static void main(String[] args) {
		
		String handing = "aa11zz";
		
		BasicVavle basicVavle = new BasicVavle();
		VavleA vavleA = new VavleA();
		VavleB vavleB = new VavleB();
		
		StandardPipeline pipeline = new StandardPipeline();
		pipeline.setBasic(basicVavle);
		pipeline.addVavle(vavleA);
		pipeline.addVavle(vavleB);
		
		pipeline.getFirst().invoke(handing);
	}

}
