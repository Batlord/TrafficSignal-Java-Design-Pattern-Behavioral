package fr.iutvalence.info.dut.m3105.preamble;

public class GreenState implements StateTrafficInterface {

	int stateSecondsRemaining;
	
	@Override
	public int getTimeRemaining() {
		return this.stateSecondsRemaining;
	}

	@Override
	public void secondEllapsed(TrafficSignal context) {
		
		context.stateSecondsRemaining = context.stateSecondsRemaining + 1;
		if (context.stateSecondsRemaining = 10)
		context.switchToState(new OrangeState());
	}

	@Override
	public void pressButton(TrafficSignal context) {
		if (context.stateSecondsRemaining > 2)
			context.stateSecondsRemaining = 2;
	}

}
