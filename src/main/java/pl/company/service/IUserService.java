package pl.company.service;

import pl.company.entity.User;
import pl.company.model.UserDto;
import pl.company.validator.EmailExistsException;

public interface IUserService {
	User registerNewUserAccount(UserDto accountDto) 
		      throws EmailExistsException;
}