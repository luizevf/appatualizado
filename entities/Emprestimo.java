package com.SA.bibliocrud.entities;

import java.util.Date;
import com.SA.bibliocrud.enums.StatusLivro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Emprestimos")

public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "IdEmprestimo")
    private Integer IdEmprestimo;

    @OneToMany
    @JoinColumn(name = "id_livro")
    private IdLivro idlivro;

    private Date Prazo;

    private StatusLivro Status;
  
}
