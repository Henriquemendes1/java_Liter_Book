package br.com.LiterBook.service;

public interface IConverteDados {
    <T> T  getData(String json, Class<T> classe);
}
