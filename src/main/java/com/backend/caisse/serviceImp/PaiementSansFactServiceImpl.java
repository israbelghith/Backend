package com.backend.caisse.serviceImp;

import com.backend.caisse.entities.Client;
import com.backend.caisse.entities.PaiementSansFacture;
import com.backend.caisse.repos.PaiementSansFactureRepos;
import com.backend.caisse.service.PaiementSFactureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementSansFactServiceImpl implements PaiementSFactureService {

    @Autowired
    PaiementSansFactureRepos paiementSansFactureRepos;

    @Override
    public PaiementSansFacture saisirAvance(PaiementSansFacture p) {
      System.out.println("///////////// le client a insérer "+ p.getCli());
        return paiementSansFactureRepos.save(p);
    }
    
}
