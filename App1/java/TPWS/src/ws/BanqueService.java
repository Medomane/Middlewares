package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConvertionEuroToDH")
	public double conversion(@WebParam(name="montant") double mnt) {
		return mnt * 11;
	}
	@WebMethod
	public Compte getCompte(@WebParam(name = "code") int code) {
		return new Compte(code, Math.random()*9000,new Date());
	}
	@WebMethod
	public List<Compte> listComptes(){
		List<Compte> lst = new ArrayList<Compte>();
		lst.add(new Compte(1, Math.random()*9000,new Date()));
		lst.add(new Compte(2, Math.random()*9000,new Date()));
		lst.add(new Compte(3, Math.random()*9000,new Date()));
		lst.add(new Compte(4, Math.random()*9000,new Date()));
		lst.add(new Compte(5, Math.random()*9000,new Date()));
		return lst ;
	}
}
