package dao;

import javax.ejb.Remote;

import dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends DAOGenericInterface<SupplierDTO> {

}
