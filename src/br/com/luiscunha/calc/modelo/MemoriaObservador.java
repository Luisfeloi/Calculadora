package br.com.luiscunha.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
    void valorAlterado(String novoValor);
}
