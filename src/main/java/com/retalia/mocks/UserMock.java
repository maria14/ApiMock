package com.retalia.mocks;

import java.util.ArrayList;
import java.util.List;

import com.retalia.models.User;

public class UserMock {
	
	private static List<User> users= new ArrayList<User>();
	static{
		users.add(new User("0","14", 0,"María Díaz Calvo","mdiaz_calvo@hotmail.com","https://scontent.xx.fbcdn.net/hprofile-prn2/v/t1.0-1/c33.0.200.200/p200x200/544122_10200162153588842_2023102720_n.jpg?oh=f86afe86c2681a1e2b346a3b765ed3e2&oe=576E304B",0,0,"16/02/2016 12:03:02"));
		users.add(new User("1","17", 0,"Álvaro Arbeloa","arbeloa@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwimvK3HyJ3NAhUE2hoKHeRrCtgQjRwIBw&url=http%3A%2F%2Fokdiario.com%2Fdeportes%2Ffutbol%2F2016%2F03%2F31%2Fsera-el-ultimo-clasico-de-cristiano-ronaldo-99279&psig=AFQjCNFDy_vJIz6Hs-0eD33e5URFUJGgIw&ust=1465651785925310",0,0,"16/02/2016 12:03:02"));
		users.add(new User("2","7", 0,"Cristiano Ronaldo","cristiano@hotmail.com","http://www.nosoloposters.com/3750/postal-real-madrid-arbeloa-2014-15.jpg",0,0,"16/02/2016 12:03:02"));
		users.add(new User("3","22", 0,"Isco","isco@hotmail.com","",0,0,"16/02/2016 12:03:02"));
		users.add(new User("4","19", 0,"Luka modric","lukita@hotmail.com","",0,0,"16/02/2016 12:03:02"));
		users.add(new User("5","18", 0,"Lucas Vazquez","lvazquez@hotmail.com","",0,0,"16/02/2016 12:03:02"));
		users.add(new User("6","12", 0,"Marcelo","marcelo@hotmail.com","",0,0,"16/02/2016 12:03:02"));
		users.add(new User("7","11", 0,"Gareth Bale","bale@hotmail.com","",0,0,"16/02/2016 12:03:02"));
		users.add(new User("8","9", 0,"Karim Benzema","benzema@hotmail.com","",0,0,"16/02/2016 12:03:02"));
	}
	
	public static User getMe(){
		return users.get(0);
	}

	public static List<User> getMyFriends() {
		List<User> friends= new ArrayList<User>();
		for (int i=1;i<7;i++){
			friends.add(users.get(i));
		}
		return friends;
	}

	public static User getUser(int id) {

		return users.get(id);
	}

	public static User getRandomUser() {
		int numeroAleatorio = (int) (Math.random()*8+1);
		return users.get(numeroAleatorio);
	}

}
