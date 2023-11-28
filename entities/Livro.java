package com.SA.bibliocrud.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Livros")

public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "IdLivro")
private Long IdLivro; 
@Column(name = "ISBN")
private long ISBN;
@Column(name = "Nome")
private String Nome;
@Column(name = "Autor")
private String Autor;
@Column(name = "Editora")
private String Editora;
@Column(name = "DataPublicacao") 
private Date DataPublicacao;
}

  
