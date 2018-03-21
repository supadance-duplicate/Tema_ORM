package dao;

import javax.ejb.Remote;

import dto.SOrderDTO;

@Remote
public interface SOrderDAORemote extends DAOGenericInterface<SOrderDTO> {

}
