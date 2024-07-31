package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormQuestion.class)
public abstract class FormQuestion_ {

	public static volatile SingularAttribute<FormQuestion, Instant> createdAt;
	public static volatile SingularAttribute<FormQuestion, Question> question;
	public static volatile SingularAttribute<FormQuestion, Form> form;
	public static volatile SingularAttribute<FormQuestion, Long> id;

	public static final String CREATED_AT = "createdAt";
	public static final String QUESTION = "question";
	public static final String FORM = "form";
	public static final String ID = "id";

}

