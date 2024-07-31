package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ {

	public static volatile SingularAttribute<Patient, String> lastName;
	public static volatile SingularAttribute<Patient, String> address;
	public static volatile SingularAttribute<Patient, String> gender;
	public static volatile ListAttribute<Patient, RehabProgram> rehabPrograms;
	public static volatile SingularAttribute<Patient, String> polis;
	public static volatile SingularAttribute<Patient, LocalDate> birthDate;
	public static volatile SingularAttribute<Patient, String> firstName;
	public static volatile SingularAttribute<Patient, String> bookmark;
	public static volatile SingularAttribute<Patient, String> phoneNumber;
	public static volatile SingularAttribute<Patient, Passport> passport;
	public static volatile SingularAttribute<Patient, String> workPlaceData;
	public static volatile SingularAttribute<Patient, LocalDate> deathDate;
	public static volatile SingularAttribute<Patient, String> middleName;
	public static volatile SingularAttribute<Patient, Long> id;
	public static volatile SingularAttribute<Patient, String> snils;
	public static volatile SingularAttribute<Patient, PatientStatus> patientStatus;
	public static volatile SingularAttribute<Patient, Long> patientCode;

	public static final String LAST_NAME = "lastName";
	public static final String ADDRESS = "address";
	public static final String GENDER = "gender";
	public static final String REHAB_PROGRAMS = "rehabPrograms";
	public static final String POLIS = "polis";
	public static final String BIRTH_DATE = "birthDate";
	public static final String FIRST_NAME = "firstName";
	public static final String BOOKMARK = "bookmark";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String PASSPORT = "passport";
	public static final String WORK_PLACE_DATA = "workPlaceData";
	public static final String DEATH_DATE = "deathDate";
	public static final String MIDDLE_NAME = "middleName";
	public static final String ID = "id";
	public static final String SNILS = "snils";
	public static final String PATIENT_STATUS = "patientStatus";
	public static final String PATIENT_CODE = "patientCode";

}

