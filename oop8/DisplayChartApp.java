public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart ���� ��ü �����
		// Chart c = new XLSChart();
		Chart c = new CloudChart();

		// Chart�� ��ü�� �����ؼ� Display ��ü ����� 
		Display chartDisplay = new Display(c);

		// �׷��� �׸��� 
		chartDisplay.drawGraph();



	}
}
