package com.spring.tutor;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.spring.tutor.bo.Player;

public class HelloWorld {

	private String name;
	private List<String> nameList;
	private List<String> keyList;
	private Map<String, Player> playerMap;
	private Properties teams;
	
	
	public void printHello(){
		System.out.println("Hello ! " + name);
	}
	
	public void printNameList(){
		System.out.println("====================");
		System.out.println("a <list> sample...");
		System.out.println("Printing nameList...");
		
		Iterator<String> iterator = nameList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
	
	public void printKeyList(){
		System.out.println("====================");
		System.out.println("a <set> sample...");
		System.out.println("Pringting keyList...");
		Iterator<String> iterator = keyList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	
	public void printPlayerMap(){
		System.out.println("====================");
		System.out.println("a <map> sample...");
		System.out.println("Pringting playerMap...");
		Iterator<String> iterator = playerMap.keySet().iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			playerMap.get(key).move();
		}
		
		
	}
	
	public void printTeams(){
		System.out.println("====================");
		System.out.println("a <props> sample...");
		System.out.println("Pringting teams...");
		Iterator<Object> iterator = teams.keySet().iterator();
		while(iterator.hasNext()){
			System.out.println("Team " + teams.getProperty((String)iterator.next()));
		}
		
		
		
	}
	public void setName(String name){
		this.name = name;
	}
	
	
	public void setNameList(List<String> nameList){
		this.nameList = nameList;
	}
	
	
	public void setKeyList(List<String> keyList){
		this.keyList = keyList;
	}
	
	
	public void setPlayerMap(Map<String, Player> playerMap){
		this.playerMap = playerMap;
	}
	
	
	public void setTeams(Properties teams){
		this.teams = teams;
	}
}
