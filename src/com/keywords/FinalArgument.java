package com.keywords;

/*
 * Java 1.1 �������ǽ��Ա������ final ���ԣ����������Ա����б��ж����ǽ����ʵ�������������ζ����һ
 * ���������ڲ������ǲ��ܸı��Ա������ָ��Ķ���
 * 
 * ע���ʱ��Ȼ��Ϊfinal �Ա�������һ��null���գ������ͬʱ���������Ჶ�������������ǶԷ� final �� ������ȡ�Ĳ�����һ���ġ� ����f()��
 * g()������չʾ���������͵��Ա���Ϊ final ʱ�ᷢ��ʲô���������ֻ�ܶ�ȡ�Ա��������ɸı� ����
 */
public class FinalArgument {
	public void with(final Gizmo g) {
		// ! g = new Gizmo(); // Illegal -- g is final

		// g ������θ�ֵ����null �˴��д�
		g.spin();
	}

	public void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}

	// void f(final int i) { i++; } // Can't change
	// You can only read from a final primitive:
	public int g(final int i) {
		return i + 1;
	}

	/*
	 * final ���� ֮����Ҫʹ��final �����������ǳ��ڶ����������ɵĿ��ǡ���һ����Ϊ����������������ֹ�κμ̳����
	 * �����ı������塣��Ƴ���ʱ����ϣ��һ����������Ϊ�ڼ̳��ڼ䱣�ֲ��䣬���Ҳ��ɱ����ǻ��д���Ϳ� �Բ�ȡ���������� ����final
	 * �����ĵڶ��������ǳ���ִ�е�Ч�ʡ���һ��������� final �󣬱������Ϳ��԰Ѷ��Ǹ�������
	 * ���е��ö����롰Ƕ�롱�����
	 * ֻҪ����������һ��final �������ã��ͻᣨ�������Լ����жϣ�����Ϊ
	 * ִ�з������û��ƶ���ȡ�ĳ��������뷽�������Ա���ѹ���ջ�������������벢ִ����������������� 
	 * ��ջ�Ա��������Է���ֵ���д��������෴�������÷���������ʵ�ʴ����һ���������滻�������á���
	 * �����ɱ��ⷽ������ʱ��ϵͳ��������Ȼ�����������̫����ô����Ҳ����Ӻ�ף������ܵ�������Ƕ��
	 * �������������κ�������������Ϊ�κ������������ڷ����ڲ���ʱ������ˡ�Java ���������Զ������Щ��
	 * ��������Ϊ�����ǡ��ؾ����Ƿ�Ƕ��һ��final ������Ȼ������û��ǲ�Ҫ��ȫ���ű���������ȷ��������
	 * ���жϡ�ͨ����ֻ���ڷ����Ĵ������ǳ��٣���������ȷ��ֹ���������ǵ�ʱ�򣬲�Ӧ���ǽ�һ��������Ϊ final��
	 * ��������private�������Զ���Ϊfinal���������ǲ��ܷ���һ�� private���������������Բ��ᱻ������
	 * �����ǣ���ǿ���������������������������ʾ����
	 * ��Ϊһ�� private��������final ָʾ������ȴ����Ϊ �Ǹ������ṩ�κζ���ĺ���
	 */
	public void FinalFunction() {

	}

	/*
	 * public static void main(String[] args) { FinalArguments bf = new
	 * FinalArguments(); bf.without(null); bf.with(null); }
	 */
}