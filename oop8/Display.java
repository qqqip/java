public class Display {

	// Chart류 객체가 저장될 변수 
	private Chart chart;

	public Display(Chart chart) {
		this.chart = chart;
	}

	public void drawGraph() {
		chart.draw();
	}
}

