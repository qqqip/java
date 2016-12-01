import java.util.*;

public class SystemDemo {

	public static void main(String[] args) {

		// ���� �ð� ���� �˾Ƴ��� 1970-01-01
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// �ý����� ȯ�溯���� ��ȸ�ϱ�
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// �ý����� ������Ƽ�� ��ȸ

		// ���� �ý����� �ٹٲ޹��� ��ȸ�ϱ�
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newLineChar+"ghijk");

		// ���� �ý����� ����� Ȩ ���丮 ��ȸ�ϱ�
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// ���α׷� �����ϱ�
		// System.exit(0);

		// �迭 �����ϱ�
		String[] src = {"�̼���", "������", "������", "ȫ�浿", "������", "�Ӳ���"};
		String[] dest = new String[10];

		/*
		System.arraycopy(src, srcPosition, dest, destPosition, length)
			src			 : �����迭
			srcPosition  : ���� �迭���� ������ �׸��� ���� ��ġ
			dest		 : �� �迭
			destPosition : �� �迭���� ������ �׸��� �ٿ����� ���� ��ġ 
			length		 : ���� �迭���� ������ �׸��� ����
		
		*/

		
		System.arraycopy(src, 3 , dest, 0, 2);

		System.out.println(Arrays.toString(dest));


	}
}