package myTrain.session;

import javax.ejb.Remote;

@Remote
public interface VoyageurVoucherItf {
    public List <Voucher> obtenirVoucher(String refDossier);
}