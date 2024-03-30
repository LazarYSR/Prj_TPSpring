package ma.ehei.Gestion.Generateur.impl;

import ma.ehei.Gestion.Generateur.IdGenerateur;

public class AutoIncrIdGenerateur implements IdGenerateur {

    @Override
    public int GenererId(int d) {
        d++;
        return d;
    }
}
