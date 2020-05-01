package strategydesignpattern;

import strategy.IStrategy;

public class Context {
	private IStrategy strategy;
	

	public Context() {
		this.strategy = new DefaultStrategyImpl();
	}

	public void process() {
		System.out.println("Etape 1 de l'algorithme ......");
		strategy.applyStrategy();
		System.out.println("Etape finale  de l'algorithme ......");
		
	}
	
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

}
