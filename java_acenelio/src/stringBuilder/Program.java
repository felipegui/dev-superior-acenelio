package stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c01 = new Comment("Haven a nice trip!");
		Comment c02 = new Comment("Wow that's awesome!");

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:04"), "Traveling to New Zealand", "I'm going to visit this wonderfull!", 12);
		
		p1.addComment(c01);
		p1.addComment(c02);
		
		Comment c03 = new Comment("Good night");
		Comment c04 = new Comment("May the Force be with you");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		p2.addComment(c03);
		p2.addComment(c04);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
