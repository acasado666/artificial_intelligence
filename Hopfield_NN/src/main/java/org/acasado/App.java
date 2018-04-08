package org.acasado;

public class App {

	public static void main(String[] args) {
		
		HopfieldNetwork hopfieldNetwork = new HopfieldNetwork(4);
		// patterns to be train
		hopfieldNetwork.train(new double[]{1,0,1,0});
		hopfieldNetwork.train(new double[]{1,1,1,1});
		
		hopfieldNetwork.recall(new double[]{1,0,1,0});
		//recognised inverse
		hopfieldNetwork.recall(new double[]{0,1,0,1});
		hopfieldNetwork.recall(new double[]{1,1,1,1});

	}
}
