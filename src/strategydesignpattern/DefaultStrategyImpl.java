package strategydesignpattern;

import strategy.IStrategy;

public class DefaultStrategyImpl implements IStrategy{

	@Override
	public void applyStrategy() {
		System.out.println("Etape Intermediare de l'algo avec la strategie par Defaut");		
	}

}
