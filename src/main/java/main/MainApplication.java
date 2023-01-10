package main;

//import main.repositories.Initialazer;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

//	private static Initialazer initiator;
//
//	@Autowired
//	public void setInitialLoader(Initialazer initiator) {
//		MainApplication.initiator = initiator;
//	}


	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		//initiator.initial();
	}

}
