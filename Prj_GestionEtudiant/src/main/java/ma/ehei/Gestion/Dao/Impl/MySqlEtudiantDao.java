package ma.ehei.Gestion.Dao.Impl;

import ma.ehei.Gestion.Dao.EtudiantDao;
import ma.ehei.Gestion.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class MySqlEtudiantDao implements EtudiantDao {

    @Override
    public void Persister(Etudiant etd) {
        System.out.println("Etudiant A Persister dans DB :"+etd);
    }
}
