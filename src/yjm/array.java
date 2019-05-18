package yjm;
import java.util.ArrayList;
/**
 * 全项目思路：
 * 登陆，管理人员和订阅消息
 * 添加用arraylist存人员和书消息
 * 用hashmap存订阅情况
 * 用迭代器迭代hashmap进行查找
 * @author 123
 *
 */


public interface array {
	
	//接口，存arraylist地址
	ArrayList<people> people  = new ArrayList<people>();
	ArrayList<book> books = new ArrayList<book>();
	ArrayList<String> PlayTag    = new ArrayList<String>();
}
