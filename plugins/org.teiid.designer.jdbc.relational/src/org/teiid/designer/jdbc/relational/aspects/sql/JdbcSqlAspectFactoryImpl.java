/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.jdbc.relational.aspects.sql;

import org.eclipse.emf.ecore.EClassifier;
import org.teiid.designer.core.metamodel.aspect.MetamodelAspect;
import org.teiid.designer.core.metamodel.aspect.MetamodelAspectFactory;
import org.teiid.designer.core.metamodel.aspect.MetamodelEntity;
import org.teiid.designer.jdbc.JdbcPackage;


/**
 * RelationalSqlAspectFactoryImpl
 *
 * @since 8.0
 */
public class JdbcSqlAspectFactoryImpl implements MetamodelAspectFactory {
    
    
    @Override
	public MetamodelAspect create(EClassifier classifier, MetamodelEntity entity) {

        switch (classifier.getClassifierID()) {
            case JdbcPackage.JDBC_SOURCE_PROPERTY: return null;
            case JdbcPackage.JDBC_DRIVER: return null;
            case JdbcPackage.JDBC_SOURCE: return new JdbcSourceAspect(entity);
            case JdbcPackage.JDBC_DRIVER_CONTAINER: return null;
            case JdbcPackage.JDBC_SOURCE_CONTAINER: return null;
            case JdbcPackage.JDBC_IMPORT_SETTINGS: return null;
            case JdbcPackage.JDBC_IMPORT_OPTIONS: return null;
            default:
                throw new IllegalArgumentException(org.teiid.designer.jdbc.relational.ModelerJdbcRelationalConstants.Util.getString("JdbcSqlAspectFactoryImpl.Invalid_ClassiferID,_for_creating_SQL_Aspect_1",classifier)); //$NON-NLS-1$
        }
    }

}
