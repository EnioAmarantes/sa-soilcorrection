package edu.utfpr.cp.dacom.sa.soilcorrection.fonts;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrients.NutrienteAdicional;

public interface IFonteNutriente {

    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
