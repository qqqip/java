import java.io.*;

public class ExceptionDemo3 {

	public static void writing() throws HtaException {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";

			writer.write(text);
			writer.flush();

		} catch (FileNotFoundException e) {
			throw new HtaException();
		} catch (IOException e) {
			throw new HtaException();
		}
	}

	public static void reading() throws HtaException {
		try {
			// FileNotException �� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			// IOException�� ������ �޼ҵ� 
			String text = reader.readLine();
			System.out.println("����: " + text);
		} catch (FileNotFoundException e) {
			// FileNotFoundException�� �߻��� ���� ����ä��, ��� HtaException�� �����ؼ� ������
			throw new HtaException();
		} catch (IOException e) {
			throw new HtaException();
		}
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo3.reading();
			ExceptionDemo3.writing();
		} catch(HtaException e ) {
			System.out.println("���α׷� ������ ������ �߻��߽��ϴ�.");
		}
	}

}