package yjm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class listennner implements ActionListener, array {
	// ��ʼ����
	public int Numpeople = 0;
	public int Numbook = 0;

	public HashMap<people, book> hm = new HashMap<people, book>();

	/*
	 * hashmap����Ա��������� Ҳ����people������Ӷ��ķ�����arraylist<book>����ʱ�� ������ hashmap��Լʱ��ɱ�
	 */

	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();
		if ("¼�����".equals(a)) {
			Object[] possibleValues = { "��Ա", "����" };
			Object selectedValue = JOptionPane.showInputDialog(null, "ѡ����������",
					"Input", JOptionPane.INFORMATION_MESSAGE, null,
					possibleValues, possibleValues[0]);

			if (selectedValue == null) {
				return;
			}// ��֤���쳣,�����ˣ���

			if ("��Ա".equals(selectedValue.toString())) {
				Numpeople++;
			} else {
				Numbook++;
			}
			// System.out.println(selectedValue.toString());
			while (true) {
				String inputValue = JOptionPane.showInputDialog("������(ȡ������ֹ)");
				if (inputValue == null) {
					break;// ȡ����ֹͣ
				} else {
					// System.out.println("����Ϊѵ������ "+(naturebook+sciencebook)+" ��ӱ�ǩ   : "+inputValue);
					if ("��Ա".equals(selectedValue.toString())) {
						people.add(new people(inputValue));// ����Ա��Ϣ����arraylist
					} else {
						int iv = Integer.parseInt(JOptionPane
								.showInputDialog("������۸�(���֣���ȻҪ�쳣)"));

						books.add(new book(inputValue, iv));
					}
					// ��book��Ϣ����arraylist
				}
			}
		} else if (("���ı���".equals(a))) {
			people key = null;// ������
			book value = null;// ������
			int flag = 0;
			String inputKey = JOptionPane.showInputDialog("����������");
			for (int i = 0; i < people.size(); i++) {
				// �ҵ������Ķ���
				if (people.get(i).name.equals(inputKey)) {
					flag++;
					key = people.get(i);
					break;
				}
			}
			String inputValue = JOptionPane.showInputDialog("�����뱨����");
			for (int i = 0; i < books.size(); i++) {
				// �ҵ������Ķ���
				if (books.get(i).name.equals(inputKey)) {
					flag++;
					value = books.get(i);
					break;
				}
			}
			if (flag == 2) {
				hm.put(key, value);
				JOptionPane.showMessageDialog(null, "����ˣ�" + key.name + ",�飺"
						+ value.name + ",�۸�" + value.value);
			} else {
				JOptionPane.showMessageDialog(null, "���޴��˻����");
			}
		} else if ("��ѯͳ��".equals(a)) {
			System.out.println("=================");
			// �������鷳...��
			// ˼·��һ���ɣ��õ���������hashmap�ҵ�������Ϣ(��д��)
			System.out.println("�����ˣ�");
			for (int i = 0; i < people.size(); i++) {
				System.out.println(people.get(i).name);
			}
			System.out.println("������");
			for (int i = 0; i < books.size(); i++) {
				System.out.println(books.get(i).name);

			}
			System.out.println("���ж��ģ�");
			Iterator iter = hm.entrySet().iterator();
			while (iter.hasNext()) {
				Entry entry = (Entry) iter.next();
				people key = (people) entry.getKey();
				book val = (book) entry.getValue();
				System.out.println("�����ˣ�" + key.name + "������:" + val.name);
			}
		}
	}
}
// �ж�����
// private double JudeNature() {
// double s=0;
// for (int i = 0; i < PlayTag.size(); i++) {
// s = s+Math.log(gailv(PlayTag.get(i), NatureTag));
// }
// return s;
// }
// �жϿ�ѧ
// private double JudeScience() {
// double s=0;
// for (int i = 0; i < PlayTag.size(); i++) {
// s = s*+Math.log(gailv(PlayTag.get(i), ScienceTag));
// }
// return s;
// }
// ���ظö������ж��ٸ������ı�ǩ
// private int gailv(String n, ArrayList<String> list) {
// int p = 0;
// for (int i = 0; i < list.size(); i++) {
// if (n.equals(list.get(i))) {
// p++;
// }
// }
// if (p == 0) {
// return 1;//�����ǩ����û�������ǩ���ñ�ǩû�вο���ֵ
// } else {
// return(p / list.size());
// }
// }
// ��ӡ����
// private void print(){
// for(int i=0;i<NatureTag.size();i++){
// System.out.println(NatureTag.get(i));
// }
// for(int i=0;i<ScienceTag.size();i++){
// System.out.println(ScienceTag.get(i));
// }
// }

