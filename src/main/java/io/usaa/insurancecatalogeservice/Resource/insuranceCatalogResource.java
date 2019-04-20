package io.usaa.insurancecatalogeservice.Resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.usaa.insurancecatalogeservice.models.CatalogItem;



@RestController
@RequestMapping("/catalog")
public class insuranceCatalogResource {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
		
	}

}
