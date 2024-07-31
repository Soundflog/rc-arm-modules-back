package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProgramFormAnswer.class)
public abstract class ProgramFormAnswer_ {

	public static volatile SingularAttribute<ProgramFormAnswer, Variant> variant;
	public static volatile SingularAttribute<ProgramFormAnswer, Long> id;
	public static volatile SingularAttribute<ProgramFormAnswer, ProgramForm> programForm;

	public static final String VARIANT = "variant";
	public static final String ID = "id";
	public static final String PROGRAM_FORM = "programForm";

}

