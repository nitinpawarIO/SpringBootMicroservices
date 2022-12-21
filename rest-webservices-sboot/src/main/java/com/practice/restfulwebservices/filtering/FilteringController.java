package com.practice.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
		
		@GetMapping("/filteredBean")
		public MappingJacksonValue getFilteredBean() {
			
			TestBean testBean = new TestBean("value1","value2","value3");
			//MappingJacksonValue jacksonValue = new MappingJacksonValue(testBean);
			
			SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
			//FilterProvider filters = new SimpleFilterProvider().addFilter("beanFilter", filter );
			//jacksonValue.setFilters(filters );
			return getMapJacksonValue(testBean, filter);
			
		}
		
		@GetMapping("/filteredBeanList")
		public MappingJacksonValue getFilteredBeanList() {
			
			List<TestBean> beanList =  Arrays.asList(new TestBean("value1","value2","value3"),
					new TestBean("value4", "value5", "value6"));
			SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
			return getMapJacksonValue(beanList, filter);
		}
		
		private MappingJacksonValue getMapJacksonValue(Object bean, SimpleBeanPropertyFilter filter)
		{
			MappingJacksonValue jacksonValue = new MappingJacksonValue(bean);
			
			FilterProvider filters = new SimpleFilterProvider().addFilter("beanFilter", filter );
			jacksonValue.setFilters(filters );
			
			return jacksonValue;
		}
}
