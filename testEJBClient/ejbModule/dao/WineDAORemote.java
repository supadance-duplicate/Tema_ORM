package dao;

import javax.ejb.Remote;

import dto.WineDTO;

@Remote
public interface WineDAORemote extends DAOGenericInterface<WineDTO> {

}
