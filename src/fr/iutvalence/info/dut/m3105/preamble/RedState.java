package fr.iutvalence.info.dut.m3105.preamble;

public class RedState implements StateTrafficInterface {

	@Override
	public int getTimeRemaining() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void secondEllapsed(TrafficSignal context) {
		
		context.switchToState(new GreenState());
	}

	@Override
	public void pressButton(TrafficSignal context) {
		// TODO Auto-generated method stub

	}

}
