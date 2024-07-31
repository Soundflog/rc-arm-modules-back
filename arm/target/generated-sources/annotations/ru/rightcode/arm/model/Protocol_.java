package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Protocol.class)
public abstract class Protocol_ {

	public static volatile SingularAttribute<Protocol, String> scalesResult;
	public static volatile SingularAttribute<Protocol, String> rehabResult;
	public static volatile SingularAttribute<Protocol, Long> id;
	public static volatile SingularAttribute<Protocol, RehabProgram> rehabProgram;
	public static volatile SingularAttribute<Protocol, Boolean> isFinal;
	public static volatile SingularAttribute<Protocol, String> rehabDiagnosis;
	public static volatile SingularAttribute<Protocol, Instant> creationDate;
	public static volatile SingularAttribute<Protocol, String> recommendations;

	public static final String SCALES_RESULT = "scalesResult";
	public static final String REHAB_RESULT = "rehabResult";
	public static final String ID = "id";
	public static final String REHAB_PROGRAM = "rehabProgram";
	public static final String IS_FINAL = "isFinal";
	public static final String REHAB_DIAGNOSIS = "rehabDiagnosis";
	public static final String CREATION_DATE = "creationDate";
	public static final String RECOMMENDATIONS = "recommendations";

}

