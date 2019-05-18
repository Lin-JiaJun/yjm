package yjm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class listennner implements ActionListener, array {
	// 初始数量
	public int Numpeople = 0;
	public int Numbook = 0;

	public HashMap<people, book> hm = new HashMap<people, book>();

	/*
	 * hashmap存人员订阅情况， 也可在people类中添加订阅方法和arraylist<book>，费时间 ，我用 hashmap节约时间成本
	 */

	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();
		if ("录入添加".equals(a)) {
			Object[] possibleValues = { "人员", "报刊" };
			Object selectedValue = JOptionPane.showInputDialog(null, "选择加入的类型",
					"Input", JOptionPane.INFORMATION_MESSAGE, null,
					possibleValues, possibleValues[0]);

			if (selectedValue == null) {
				return;
			}// 保证无异常,加新人，书

			if ("人员".equals(selectedValue.toString())) {
				Numpeople++;
			} else {
				Numbook++;
			}
			// System.out.println(selectedValue.toString());
			while (true) {
				String inputValue = JOptionPane.showInputDialog("请输入(取消后终止)");
				if (inputValue == null) {
					break;// 取消后停止
				} else {
					// System.out.println("您在为训练集第 "+(naturebook+sciencebook)+" 书加标签   : "+inputValue);
					if ("人员".equals(selectedValue.toString())) {
						people.add(new people(inputValue));// 把人员信息加入arraylist
					} else {
						int iv = Integer.parseInt(JOptionPane
								.showInputDialog("请输入价格(数字，不然要异常)"));

						books.add(new book(inputValue, iv));
					}
					// 把book消息加入arraylist
				}
			}
		} else if (("订阅报刊".equals(a))) {
			people key = null;// 订阅人
			book value = null;// 订阅书
			int flag = 0;
			String inputKey = JOptionPane.showInputDialog("请输入人名");
			for (int i = 0; i < people.size(); i++) {
				// 找到人名的对象
				if (people.get(i).name.equals(inputKey)) {
					flag++;
					key = people.get(i);
					break;
				}
			}
			String inputValue = JOptionPane.showInputDialog("请输入报刊名");
			for (int i = 0; i < books.size(); i++) {
				// 找到书名的对象
				if (books.get(i).name.equals(inputKey)) {
					flag++;
					value = books.get(i);
					break;
				}
			}
			if (flag == 2) {
				hm.put(key, value);
				JOptionPane.showMessageDialog(null, "添加人：" + key.name + ",书："
						+ value.name + ",价格：" + value.value);
			} else {
				JOptionPane.showMessageDialog(null, "查无此人或此书");
			}
		} else if ("查询统计".equals(a)) {
			System.out.println("=================");
			// 查找真麻烦...，
			// 思路给一个吧，用迭代器遍历hashmap找到订阅消息(我写了)
			System.out.println("所有人：");
			for (int i = 0; i < people.size(); i++) {
				System.out.println(people.get(i).name);
			}
			System.out.println("所有书");
			for (int i = 0; i < books.size(); i++) {
				System.out.println(books.get(i).name);

			}
			System.out.println("其中订阅：");
			Iterator iter = hm.entrySet().iterator();
			while (iter.hasNext()) {
				Entry entry = (Entry) iter.next();
				people key = (people) entry.getKey();
				book val = (book) entry.getValue();
				System.out.println("订阅人：" + key.name + "订阅书:" + val.name);
			}
		}
	}
}
// 判断人文
// private double JudeNature() {
// double s=0;
// for (int i = 0; i < PlayTag.size(); i++) {
// s = s+Math.log(gailv(PlayTag.get(i), NatureTag));
// }
// return s;
// }
// 判断科学
// private double JudeScience() {
// double s=0;
// for (int i = 0; i < PlayTag.size(); i++) {
// s = s*+Math.log(gailv(PlayTag.get(i), ScienceTag));
// }
// return s;
// }
// 返回该队列里有多少个这样的标签
// private int gailv(String n, ArrayList<String> list) {
// int p = 0;
// for (int i = 0; i < list.size(); i++) {
// if (n.equals(list.get(i))) {
// p++;
// }
// }
// if (p == 0) {
// return 1;//如果标签库里没有这个标签，该标签没有参考价值
// } else {
// return(p / list.size());
// }
// }
// 打印队列
// private void print(){
// for(int i=0;i<NatureTag.size();i++){
// System.out.println(NatureTag.get(i));
// }
// for(int i=0;i<ScienceTag.size();i++){
// System.out.println(ScienceTag.get(i));
// }
// }

