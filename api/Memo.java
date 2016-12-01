import java.io.*;

public class Memo {
	public static void main(String[] args) throws Exception {
		String text = "";
		text += "학교종이 땡땡땡" + System.lineSeparator();
		text += "어서 모이자" + System.lineSeparator();
		text += "선생님이 우리를" + System.lineSeparator();
		text += "기다리신다." + System.lineSeparator();

		FileWriter writer = new FileWriter("a.txt");
		writer.write(text);
		writer.close();
			
	}
}