public class Display {

	// Chart�� ��ü�� ����� ���� 
	private Chart chart;

	public Display(Chart chart) {
		this.chart = chart;
	}

	public void drawGraph() {
		chart.draw();
	}
}

