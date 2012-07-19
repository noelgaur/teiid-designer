/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.core.metamodel;

import java.util.Map;

/**
 * @since 8.0
 */
public interface IPasteContributor {

    // ===========================================================================================================================
    // Controller Methods

    /**
     * Called by {@link org.teiid.designer.core.container.PasteWithRelatedFromClipboardCommand#execute()} after the
     * core paste action has occurred.
     * 
     * @param map
     *            A map of original to pasted objects.
     * @param uri
     *            The metamodel URI of the target model.
     * @since 4.3.1
     */
    void contribute(Map map,
                    String uri);
}
