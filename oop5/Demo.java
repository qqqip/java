package kr.co.jhta;

// �ٸ�Ŭ������ ��Ű���� ����Ҷ��� import�� �ʿ��ϴ�. 
// import kr.co.l2.*;
// import kr.co.l2.sub.*;

import kr.co.l2.Employee;
import kr.co.l2.sub.Family;

public class Demo {
	public static void main(String[] args) {
		System.out.println("��Ű�� ���� ���ø����̼�");

		Person p = new Person();
		p.setName("ȫ�浿");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}