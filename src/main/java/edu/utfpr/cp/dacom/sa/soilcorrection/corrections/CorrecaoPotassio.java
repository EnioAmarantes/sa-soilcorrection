package edu.utfpr.cp.dacom.sa.soilcorrection.corrections;

import edu.utfpr.cp.dacom.sa.soilcorrection.fonts.FontePotassio;

public class CorrecaoPotassio
        implements
            ICorrecaoNutriente<FontePotassio>,
            ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        double teorSolo,
        double participacaoCTCExistente,
        double participacaoCTCDesejada) {

            if ((teorSolo <= 0) || (participacaoCTCExistente <= 0) || (participacaoCTCDesejada <= 0)) {
                throw new IllegalArgumentException();
            }

            return (teorSolo
                    * participacaoCTCDesejada
                    / participacaoCTCExistente)
                    - teorSolo;
    }

}
