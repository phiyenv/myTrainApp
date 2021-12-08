package myTrain.session;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

@Stateful (mappedName = "MyTrainJNDI")
public class AchatBean implements AchatItf {

    @PersistenceContext(unitName = "MyTrainPU")
    private EntityManager em;
	// TODO Quand est utilisee elle doit etre synchronisee
    
    @Override
	public String reserver (String FROM, String TO, String date) {
        try {
            List<TrainEntity> lesTrains = List<TrainEntity> em.createQuery(
                "SELECT t 
                FROM TrainEntity t
                JOIN t.lesDates d 
                WHERE t.depart =: depart
                    AND t.arrivee =: arrivee
                    AND d.uneDate =: da"
            ) 
            .setParameter("d", date)
            .getSingleResult();
            return lesTrains;
            // serveur fournit la liste des horaires et des numéros de train

        } catch (NoResultException e) { 
			return String.format("PAS DE TRAIN");
		} 
		
    }

    public String choisir (int numTrain, int numSiege) {
        try {
            
        } catch (EntityNotFoundException enfe) {
            return String.format("TRAIN COMPLET!");
        }
         catch (EntityExistsException eee) {
             return String.format("Veuillez saisir les informations voyageur.");
         }

    }
    public String renseigner(List<Voyageur> voyageurs) {}

}