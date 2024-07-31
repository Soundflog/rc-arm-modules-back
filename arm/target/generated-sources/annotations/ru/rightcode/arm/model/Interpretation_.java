package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Interpretation.class)
public abstract class Interpretation_ {

	public static volatile SingularAttribute<Interpretation, BigDecimal> minValue;
	public static volatile SingularAttribute<Interpretation, BigDecimal> maxValue;
	public static volatile SingularAttribute<Interpretation, Scale> scale;
	public static volatile SingularAttribute<Interpretation, String> description;
	public static volatile SingularAttribute<Interpretation, Long> id;

	public static final String MIN_VALUE = "minValue";
	public static final String MAX_VALUE = "maxValue";
	public static final String SCALE = "scale";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

