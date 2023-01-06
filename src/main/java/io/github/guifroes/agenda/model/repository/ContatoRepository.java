package io.github.guifroes.agenda.model.repository;

import io.github.guifroes.agenda.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
