import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.university.test.TestStatelessBeanLocal;

import dao.SupplierDAORemote;
import dao.Supplier_StockDAORemote;
import dao.WineDAORemote;
import dto.SupplierDTO;
import dto.Supplier_StockDTO;
import dto.WineDTO;

public class Main {

	public static void main(String[] args) throws NamingException
	{
		InitialContext ctx = new InitialContext();
		//TestStatelessBeanLocal tsbl = (TestStatelessBeanLocal) ctx.lookup("java:global/testEAR/testEJB/TestStatelessBean!com.university.test.TestStatelessBeanLocal");
		
	    WineDAORemote wineDAORemote = (WineDAORemote) ctx.lookup("java:global/testEAR/testEJB/WineDAO!dao.WineDAORemote");
		
//		WineDTO wineDTO = new WineDTO();
//		wineDTO.setName("test wine name");
//		wineDTO.setWineType("DRY");
//		wineDAORemote.insert(wineDTO);
		
		SupplierDAORemote supplierDAORemote = (SupplierDAORemote) ctx.lookup("java:global/testEAR/testEJB/SupplierDAO!dao.SupplierDAORemote");
		SupplierDTO supplierDTO = new SupplierDTO();
		supplierDAORemote.insert(supplierDTO);
		
		Supplier_StockDAORemote supplier_stockDAO = (Supplier_StockDAORemote) ctx.lookup("java:global/testEAR/testEJB/Supplier_StockDAO!dao.Supplier_StockDAORemote");
		Supplier_StockDTO supplier_stockDTO = new Supplier_StockDTO();
		supplier_stockDTO.setId_supplier(1);
		supplier_stockDTO.setId_wine(1);
		supplier_stockDAO.insert(supplier_stockDTO);
		
	
		
	}

}
