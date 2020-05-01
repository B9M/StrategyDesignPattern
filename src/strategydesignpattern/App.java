package strategydesignpattern;

import java.util.Scanner;

import strategy.IStrategy;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;
import strategy.StrategyImpl3;

public class App {
	public static void main(String[] args) throws Exception{
		//Version Statique
		System.out.println("---------------Version Statique-----------------");
		Context ctx = new Context();
		ctx.process();
		System.out.println("--------------------------------");
		ctx.setStrategy(new StrategyImpl1());
		ctx.process();
		System.out.println("--------------------------------");
		ctx.setStrategy(new StrategyImpl2());
		ctx.process();
		System.out.println("--------------------------------");
		ctx.setStrategy(new StrategyImpl3());
		ctx.process();
		
		System.out.println("---------------Version Dynamique-----------------");

		boolean fin = false ;
		Scanner scanner = new Scanner(System.in);
		while (!fin) {
			System.out.print("Donner la strategie (Int 1,2,3) :");
			int sl = scanner.nextInt();
			String strategyClassName = "strategy.StrategyImpl"+sl;
			//System.out.println(strategyClassName);
			IStrategy strategyDynamique = (IStrategy) Class.forName(strategyClassName).newInstance();
			ctx.setStrategy(strategyDynamique);
			System.out.println("--------------------------------");
			ctx.process();
			
		}
	}

}
