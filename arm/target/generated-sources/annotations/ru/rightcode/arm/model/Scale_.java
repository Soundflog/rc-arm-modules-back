package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Scale.class)
public abstract class Scale_ {

	public static volatile SingularAttribute<Scale, String> name;
	public static volatile SingularAttribute<Scale, String> description;
	public static volatile SingularAttribute<Scale, Long> id;
	public static volatile ListAttribute<Scale, Interpretation> interpretations;

	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String INTERPRETATIONS = "interpretations";

}

