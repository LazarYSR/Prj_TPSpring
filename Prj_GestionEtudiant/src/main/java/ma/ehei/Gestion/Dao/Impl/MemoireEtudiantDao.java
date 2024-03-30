package ma.ehei.Gestion.Dao.Impl;

import ma.ehei.Gestion.Dao.EtudiantDao;
import ma.ehei.Gestion.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class MemoireEtudiantDao implements EtudiantDao {
    private List <Etudiant> LstEtudiant = new ArrayList<>();
    @Override
    public void Persister(Etudiant etd) {
        LstEtudiant.add(etd);
    }
}
