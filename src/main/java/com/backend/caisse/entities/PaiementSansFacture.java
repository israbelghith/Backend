package com.backend.caisse.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class PaiementSansFacture extends Paiement{
    public PaiementSansFacture(Long idP, Date dateP,String modePaiement,String etat,Encaissement encaissement,Agent agent,Client client){
        super(idP, dateP, modePaiement, etat, encaissement,agent);
      this.cli=client;
    }
    public PaiementSansFacture(Long idP, Date dateP,String modePaiement,String etat,Encaissement encaissement,Client client){
      
    }
    @ManyToOne
    private Client cli;
}