package OnlineLibraryIndividualProject.IndividualProject;

import OnlineLibraryIndividualProject.IndividualProject.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class IndividualProjectApplication {
	@Autowired
private Email email;

	public static void main(String[] args) {



		SpringApplication.run(IndividualProjectApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		email.sendEmail("andrada.valcan01@e-uvt.ro","fd","hg");
	}



}
