package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doctor.class)
public abstract class Doctor_ {

	public static volatile SingularAttribute<Doctor, String> firstName;
	public static volatile SingularAttribute<Doctor, String> lastName;
	public static volatile SingularAttribute<Doctor, String> phoneNumber;
	public static volatile SingularAttribute<Doctor, Long> doctorCode;
	public static volatile SingularAttribute<Doctor, String> middleName;
	public static volatile SingularAttribute<Doctor, Long> id;
	public static volatile SingularAttribute<Doctor, User> user;
	public static volatile SingularAttribute<Doctor, String> email;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String DOCTOR_CODE = "doctorCode";
	public static final String MIDDLE_NAME = "middleName";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String EMAIL = "email";

}

