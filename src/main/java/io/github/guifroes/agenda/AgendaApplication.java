package io.github.guifroes.agenda;

import io.github.guifroes.agenda.mode.repository.ContatoRepository;
import io.github.guifroes.agenda.model.entity.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApplication {

    public static void main(String[] args) {

        SpringApplication.run(AgendaApplication.class, args);
    }

}
