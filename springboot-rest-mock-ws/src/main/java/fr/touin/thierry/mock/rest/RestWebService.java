package fr.touin.thierry.mock.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.touin.thierry.mock.bean.UserBiz;
import fr.touin.thierry.mock.rest.exception.BusinessException;
import fr.touin.thierry.mock.rest.exception.TechnicalException;

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


	
	
	@RequestMapping(value = "/order/{uid}", method = RequestMethod.GET)
	public UserBiz getOrder(@PathVariable String uid) throws TechnicalException, BusinessException {
		String name = "Mon order";
		if (_log.isInfoEnabled()) _log.debug("recherche de l'order: " + name + "uid: " + uid);

		UserBiz order = new UserBiz(Integer.parseInt(uid),"Order"+uid);

		return order;
	}
	
	
	
	
}
