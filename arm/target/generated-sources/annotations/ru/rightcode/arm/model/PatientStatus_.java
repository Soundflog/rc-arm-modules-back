package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PatientStatus.class)
public abstract class PatientStatus_ {

	public static volatile SingularAttribute<PatientStatus, String> name;
	public static volatile SingularAttribute<PatientStatus, Long> id;

	public static final String NAME = "name";
	public static final String ID = "id";

}

