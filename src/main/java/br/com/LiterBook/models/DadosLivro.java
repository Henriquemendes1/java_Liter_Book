package br.com.LiterBook.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public record DadosLivro(@JsonAlias("title") String titulo,
                         @JsonAlias("languages")String idioma,
                         @JsonAlias("download_count")Integer numeroDeDownloads) {
}
