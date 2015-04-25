package fr.touin.thierry.service.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Date;

@RequestMapping("/rest")
@RestController()
public class RestWebService {

	private static final Logger _log = LoggerFactory.getLogger(RestWebService.class);
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserBiz test() {

		if (_log.isInfoEnabled()) _log.info("test()");
		
		UserBiz user = new UserBiz(1,"toto");
		
		return user;
	}	
	
}