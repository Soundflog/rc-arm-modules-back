package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Passport.class)
public abstract class Passport_ {

	public static volatile SingularAttribute<Passport, String> number;
	public static volatile SingularAttribute<Passport, LocalDate> issuedDate;
	public static volatile SingularAttribute<Passport, String> series;
	public static volatile SingularAttribute<Passport, Long> id;
	public static volatile SingularAttribute<Passport, String> issued;

	public static final String NUMBER = "number";
	public static final String ISSUED_DATE = "issuedDate";
	public static final String SERIES = "series";
	public static final String ID = "id";
	public static final String ISSUED = "issued";

}

