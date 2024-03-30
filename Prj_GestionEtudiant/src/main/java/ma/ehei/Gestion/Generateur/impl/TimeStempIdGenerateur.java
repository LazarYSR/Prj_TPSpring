package ma.ehei.Gestion.Generateur.impl;

import ma.ehei.Gestion.Generateur.IdGenerateur;

public class TimeStempIdGenerateur implements IdGenerateur {

    @Override
    public int GenererId(int d) {
        return d;
    }
}
