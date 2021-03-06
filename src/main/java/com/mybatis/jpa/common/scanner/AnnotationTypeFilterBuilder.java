package com.mybatis.jpa.common.scanner;

import java.lang.annotation.Annotation;

import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

/**
 * TypeFilterBuilder
 * 
 * @author svili
 * @data 2017年5月5日
 *
 */
public class AnnotationTypeFilterBuilder {

	public static TypeFilter build(Class<? extends Annotation> annotionType) {
		return new AnnotationTypeFilter(annotionType, false);
	}

}
