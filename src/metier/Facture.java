package metier;

import java.time.LocalDate;

public class Facture
{
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	private Int montantfacture;
	
	public Facture Facture(int montant)
	{
		this.montantfacture = montant;
	}
	
	public Client getClient()
	{
		return Client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return Montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return Date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}