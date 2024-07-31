package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RehabProgram.class)
public abstract class RehabProgram_ {

	public static volatile SingularAttribute<RehabProgram, Doctor> doctor;
	public static volatile SingularAttribute<RehabProgram, Instant> createdAt;
	public static volatile SingularAttribute<RehabProgram, Boolean> isCurrent;
	public static volatile SingularAttribute<RehabProgram, Instant> endDate;
	public static volatile SingularAttribute<RehabProgram, Patient> patient;
	public static volatile SingularAttribute<RehabProgram, Long> id;
	public static volatile ListAttribute<RehabProgram, Protocol> protocols;
	public static volatile SingularAttribute<RehabProgram, Instant> startDate;
	public static volatile ListAttribute<RehabProgram, Module> modules;
	public static volatile ListAttribute<RehabProgram, ProgramForm> forms;

	public static final String DOCTOR = "doctor";
	public static final String CREATED_AT = "createdAt";
	public static final String IS_CURRENT = "isCurrent";
	public static final String END_DATE = "endDate";
	public static final String PATIENT = "patient";
	public static final String ID = "id";
	public static final String PROTOCOLS = "protocols";
	public static final String START_DATE = "startDate";
	public static final String MODULES = "modules";
	public static final String FORMS = "forms";

}

