package Homewokr2;

abstract class Printer{
	String model;
	int printedCount=0;
	int availableCount;
	abstract boolean print();
}

class InkjetPrinter extends Printer{
	boolean print() {
		if(availableCount ==0) {
			System.out.println(model+": "+(printedCount+1)+"매째 인쇄 실패 -잉크 부족");
			return false;
		}
		else {
			printedCount++;
			availableCount--;
			return true;
		}
	}
	public InkjetPrinter(String s, int a) {
		model=s;
		availableCount= a;
		
	}
}

class LaserPrinter extends Printer{
	boolean print() {
		if(availableCount ==0) {
			System.out.println(model+": "+(printedCount+1)+"매째 인쇄 실패 -토너 부족");
			return false;
		}
		else {
			printedCount++;
			availableCount--;
			return true;
		}
	}
	public LaserPrinter(String s, int a) {
		model=s;
		availableCount= a;
	}
}

public class Homework7 {
public static void main(String[] args) {
InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
while (inkjet.print());
while (laser.print());
}
}