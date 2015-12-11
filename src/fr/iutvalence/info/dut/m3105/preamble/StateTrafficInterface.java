package fr.iutvalence.info.dut.m3105.preamble;

public interface StateTrafficInterface {
	int getTimeRemaining();
	void secondEllapsed(TrafficSignal context);
	void pressButton(TrafficSignal context);
}
