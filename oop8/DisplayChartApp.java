public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart 구현 객체 만들기
		// Chart c = new XLSChart();
		Chart c = new CloudChart();

		// Chart류 객체를 전달해서 Display 객체 만들기 
		Display chartDisplay = new Display(c);

		// 그래프 그리기 
		chartDisplay.drawGraph();



	}
}
