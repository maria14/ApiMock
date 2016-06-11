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
		users.add(new User("3","22", 0,"Isco","isco@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwityKHH4J_NAhWDDRoKHYAkAIAQjRwIBw&url=http%3A%2F%2Fwww.transfermarkt.es%2Fisco%2Fprofil%2Fspieler%2F85288&psig=AFQjCNEzIZH8VZIp3DCaK3kbO1S14-dAKg&ust=1465726946741604",0,0,"16/02/2016 12:03:02"));
		users.add(new User("4","19", 0,"Luka modric","lukita@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwig05_b4J_NAhXKhRoKHdCNCyUQjRwIBw&url=http%3A%2F%2Fes.uefa.com%2Fuefasupercup%2Fseason%3D2014%2Fclubs%2Fplayer%3D74699%2Findex.html&bvm=bv.124272578,d.d2s&psig=AFQjCNErVyH8O_EuVGhScktiC1a9J49ogQ&ust=1465726982767941",0,0,"16/02/2016 12:03:02"));
		users.add(new User("5","18", 0,"Lucas Vazquez","lvazquez@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwj6-u3k4J_NAhWE1hoKHRM9BP4QjRwIBw&url=http%3A%2F%2Fwww.diariolagrada.com%2Fnoticias%2Fespanyol%2Flucas-vazquez-perico_12223.html&bvm=bv.124272578,d.d2s&psig=AFQjCNFhBZpsV3WpVtR4y5bCUqn73updCQ&ust=1465727017331131",0,0,"16/02/2016 12:03:02"));
		users.add(new User("6","12", 0,"Marcelo","marcelo@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwi65fzu4J_NAhWDVhoKHUS5BL8QjRwIBw&url=http%3A%2F%2Fwww.mediavida.com%2Fforo%2Fdeportes%2Fquien-regatea-mejor-marcelo-neymar-558754&bvm=bv.124272578,d.d2s&psig=AFQjCNEClHvuOC8D1qlHs3Ss6cxetflWew&ust=1465727039478936",0,0,"16/02/2016 12:03:02"));
		users.add(new User("7","11", 0,"Gareth Bale","bale@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjL2P744J_NAhXBDxoKHUgvA6IQjRwIBw&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGareth_Bale&bvm=bv.124272578,d.d2s&psig=AFQjCNEXGk8VTKwOBkFnONe-9CdNfA0Aog&ust=1465727057168714",0,0,"16/02/2016 12:03:02"));
		users.add(new User("8","9", 0,"Karim Benzema","benzema@hotmail.com","https://www.google.es/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjj9ZSE4Z_NAhVICBoKHX2oBZ0QjRwIBw&url=http%3A%2F%2Fwww.marca.com%2Ffutbol%2Fkarim-benzema.html&bvm=bv.124272578,d.d2s&psig=AFQjCNE_OsSHBodwV3D-7bFig_BmiFODzA&ust=1465727077945951",0,0,"16/02/2016 12:03:02"));
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
