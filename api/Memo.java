import java.io.*;

public class Memo {
	public static void main(String[] args) throws Exception {
		String text = "";
		text += "�б����� ������" + System.lineSeparator();
		text += "� ������" + System.lineSeparator();
		text += "�������� �츮��" + System.lineSeparator();
		text += "��ٸ��Ŵ�." + System.lineSeparator();

		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();
			
	}
}