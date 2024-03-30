package ma.ehei.Gestion.Generateur.impl;

import ma.ehei.Gestion.Generateur.IdGenerateur;

public class PrefixIdGenerateur implements IdGenerateur {
    //private static int inc ;
    @Override
    public int GenererId(int d) {
        return d;
    }
}
