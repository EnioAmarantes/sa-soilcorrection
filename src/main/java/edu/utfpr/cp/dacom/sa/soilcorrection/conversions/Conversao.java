package edu.utfpr.cp.dacom.sa.soilcorrection.conversions;

public interface Conversao<T, R> {

    public R converte(T valor);
}
