package Homework4;


public class Homwork5 {
static class Monitor{
	private String monitorSize;
	private String color;
	private String power;
	
	public void turnOn() {
		System.out.println("Turning on the monitor.");
	}
	public void printInfo() {
		System.out.println("The spec of the monitor\n"+"Size: "+monitorSize+"\n"+"Color: "+color+"\n"+"Power: "+power);
	}
	public String getMonitorSize() {
		return monitorSize;
	}
	public void setMonitorSize(String monitorSize) {
		this.monitorSize = monitorSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
}

static class Computer{
	private String cpu;
	private String memory;
	private String hd;
	private String color;
	private String power;
	
	public void turnOn() {
		System.out.println("Turning on the computer.");
	}
	public void printInfo() {
		System.out.printf("The spec of hte computer\n CPU: %s\n Memory: %s\n HDD: %s\n Color: %s\n Power: %s\n",cpu,memory,hd,color,power);
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
}
static class PersonalComputer {
	private Computer computer;
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	private Monitor monitor;
	void turnOn() {
		computer.turnOn();
		monitor.turnOn();
	}
	void printInfo() {
		computer.printInfo();
		monitor.printInfo();
	}
}

public static void main(String[] args) {
	PersonalComputer pc = new PersonalComputer();
	Computer com = new Computer();
	Monitor mon = new Monitor();
	com.setCpu("Core i7");
	com.setMemory("16GB");
	com.setHd("2TB");
	com.setColor("White");
	com.setPower("500W");
	mon.setMonitorSize("24 inch");
	mon.setColor("Black");
	mon.setPower("45W");
	pc.setComputer(com);
	pc.setMonitor(mon);
	pc.turnOn();
	pc.printInfo();
}
}