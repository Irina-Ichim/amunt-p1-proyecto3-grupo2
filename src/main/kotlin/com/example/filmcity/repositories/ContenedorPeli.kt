package com.example.filmcity.repositories.com.example.filmcity.repositories

import javax.persistence.*

@Entity
@Table(name = "Peliculas")
data class ContenedorPeli(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val title: String,
        val director: String,
        @Column(name = "releaseYear")
        val releaseYear: Int,
)









