/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.search.runtime;

/**
 * AbstractRelationshipSearchRecord
 *
 * @since 8.0
 */
public abstract class AbstractRelationshipRecord extends AbstractSearchRecord {

    private String name;
    private String objectUri;

    /* (non-Javadoc)
     * @See org.teiid.designer.relationship.search.index.RelatedObjectRecord#getUri()
     */
    public String getUri() {
        return objectUri;
    }

    /**
     * @param string
     */
    public void setUri( String string ) {
        objectUri = string;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.core.relationship.search.index.RelatedObjectRecord#getObjectName()
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param string
     */
    public void setName( String string ) {
        name = string;
    }

}
