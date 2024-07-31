package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Variant.class)
public abstract class Variant_ {

	public static volatile SingularAttribute<Variant, BigDecimal> score;
	public static volatile ListAttribute<Variant, ProgramFormAnswer> programFormAnswers;
	public static volatile SingularAttribute<Variant, Question> question;
	public static volatile ListAttribute<Variant, ModuleFormAnswer> moduleFormAnswers;
	public static volatile SingularAttribute<Variant, Long> id;
	public static volatile SingularAttribute<Variant, String> content;

	public static final String SCORE = "score";
	public static final String PROGRAM_FORM_ANSWERS = "programFormAnswers";
	public static final String QUESTION = "question";
	public static final String MODULE_FORM_ANSWERS = "moduleFormAnswers";
	public static final String ID = "id";
	public static final String CONTENT = "content";

}

