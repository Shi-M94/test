package jp.co.internous.action;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){

		A_member A=new A_member();

		ArrayList <String> seito=new ArrayList<String>();
		ArrayList <Integer> bangou=new ArrayList<Integer>();

		for(int i=1;i<=20;i++){
			bangou.add(i);
		}

		for(int n=0;n<=bangou.size();n++){
		A.setNumber(bangou.get(n));
		A.getNumber();
		}






	}







}
