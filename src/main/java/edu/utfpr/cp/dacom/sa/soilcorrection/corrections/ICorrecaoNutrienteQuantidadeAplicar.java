package edu.utfpr.cp.dacom.sa.soilcorrection.corrections;

import edu.utfpr.cp.dacom.sa.soilcorrection.fonts.IFonteNutriente;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {

    public default double calculaQuantidadeAplicar(
        double necessidade,
        T fonteNutriente) {

        if (necessidade <= 0) {
            throw new IllegalArgumentException();
        }

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
