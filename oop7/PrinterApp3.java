public class PrinterApp3 {
	public static void main(String[] args) {

		Printer p1 = new ColorPrinter();

		// p1 ���������� ColorPrinter ��ü�� �Բ� ������ Printer ��ü�� �������̴�. 
		// p1 ���������� printer ��ü�� �ʵ�/�޼ҵ带 ������ �� �ִ�. 
		// p1 ���������� ColorPrinter��ü�� �ʵ�/�޼ҵ�� ������ �� ����. 
		// ��, ColorPrinter ��ü�� Printer ��ü�� ������ ���迡 �ִ� �޼ҵ尡 �ִٸ� 
		// p1 ���������� ColorPrinter��ü�� �����ǵ� �޼ҵ带 ������ �� �ִ�. 
		// 
		p1.feed();			// Printer�� ���ǵ� �޼ҵ� 
		p1.print("����");	// Printer�� ����, ColorPrinter�� ������ 
							// ColorPrinter�� print(String text)�� ����

		// �Ʒ��� �ڵ��� ���� <-- p1 ���������δ� ���� �Ұ�. 					
		//p1.dpi = 600;		// ColorPrinter�� ���ǵ� �ʵ� 
		//p1.chargeInk();		// ColorPrinter�� ���ǵ� �޼ҵ� 
		
		// ��ü�� ���� ����ȯ
		ColorPrinter p2 = (ColorPrinter)p1;	// p1���� ColorPrinter ��ü�� �Űܰ���.
							// ColorPrinter��ü�� �������� ��ȯ�ȴ�. 
		p2.dpi = 600;
		p2.chargeInk();

		((ColorPrinter) p1).chargeInk();
		
	}
}