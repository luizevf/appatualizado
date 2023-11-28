package com.SA.bibliocrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Usuarios")

public class Usuario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "UserID")
  private Long UserId;

  @Column(name = "Nome")
  private String Nome;

  @Column(name = "Sobrenome")
  private String Sobrenome;

  @Column(name = "Email")
  private String Email;

  @Column(name = "Senha")
  private String Senha;

}