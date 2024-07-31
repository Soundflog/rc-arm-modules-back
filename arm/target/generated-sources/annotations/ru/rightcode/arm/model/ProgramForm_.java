package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProgramForm.class)
public abstract class ProgramForm_ {

	public static volatile SingularAttribute<ProgramForm, BigDecimal> score;
	public static volatile SingularAttribute<ProgramForm, Form> form;
	public static volatile SingularAttribute<ProgramForm, Long> id;
	public static volatile SingularAttribute<ProgramForm, RehabProgram> rehabProgram;
	public static volatile SingularAttribute<ProgramForm, Type> type;
	public static volatile SingularAttribute<ProgramForm, Instant> finishedAt;

	public static final String SCORE = "score";
	public static final String FORM = "form";
	public static final String ID = "id";
	public static final String REHAB_PROGRAM = "rehabProgram";
	public static final String TYPE = "type";
	public static final String FINISHED_AT = "finishedAt";

}

