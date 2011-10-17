/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.extension;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.eclipse.osgi.util.NLS;
import org.teiid.designer.extension.definition.ModelExtensionAssistant;
import org.teiid.designer.extension.properties.ModelExtensionPropertyDefinition;
import org.teiid.designer.extension.registry.ModelExtensionRegistry;

import com.metamatrix.core.util.CoreArgCheck;
import com.metamatrix.core.util.CoreStringUtil;

/**
 * 
 */
public class ModelExtensionAssistantAggregator {

    private final ModelExtensionRegistry registry;

    public ModelExtensionAssistantAggregator( ModelExtensionRegistry registry ) {
        CoreArgCheck.isNotNull(registry, "registry is null"); //$NON-NLS-1$
        this.registry = registry;
    }

    public Properties getOverriddenValues( Object modelObject ) throws Exception {
        Properties props = new Properties();

        for (String namespacePrefix : this.registry.getAllNamespacePrefixes()) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

            if (assistant.supportsMyNamespace(modelObject)) {
                props.putAll(assistant.getOverriddenValues(modelObject));
            }
        }

        return props;
    }

    public Collection<ModelExtensionPropertyDefinition> getPropertyDefinitions( Object modelObject ) throws Exception {
        Collection<String> supportedNamespacePrefixes = getSupportedNamespacePrefixes(modelObject);

        if (supportedNamespacePrefixes.isEmpty()) {
            return Collections.emptyList();
        }

        Collection<ModelExtensionPropertyDefinition> propDefns = new ArrayList<ModelExtensionPropertyDefinition>();
        String metaclassName = modelObject.getClass().getName();

        for (String namespacePrefix : supportedNamespacePrefixes) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);
            propDefns.addAll(assistant.getModelExtensionDefinition().getPropertyDefinitions(metaclassName));
        }

        return propDefns;
    }

    public Properties getPropertyValues( Object modelObject ) throws Exception {
        Properties props = new Properties();

        for (String namespacePrefix : this.registry.getAllNamespacePrefixes()) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

            if (assistant.supportsMyNamespace(modelObject)) {
                props.putAll(assistant.getPropertyValues(modelObject));
            }
        }

        return props;
    }

    public Collection<String> getSupportedNamespacePrefixes( Object modelObject ) throws Exception {
        Collection<String> supportedNamespaces = new ArrayList<String>();

        for (String namespacePrefix : this.registry.getAllNamespacePrefixes()) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

            if (assistant.supportsMyNamespace(modelObject)) {
                supportedNamespaces.add(namespacePrefix);
            }
        }

        return supportedNamespaces;
    }

    public boolean hasExtensionProperties( File file ) throws Exception {
        for (String namespacePrefix : this.registry.getAllNamespacePrefixes()) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

            if (assistant.hasExtensionProperties(file)) {
                return true;
            }
        }

        return false;
    }

    public boolean hasExtensionProperties( Object modelObject ) throws Exception {
        for (String namespacePrefix : this.registry.getAllNamespacePrefixes()) {
            ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

            if (assistant.hasExtensionProperties(modelObject)) {
                return true;
            }
        }

        return false;
    }

    public void removeProperty( Object modelObject,
                                String propId ) throws Exception {
        String namespacePrefix = ModelExtensionPropertyDefinition.Utils.getNamespacePrefix(propId);

        if (CoreStringUtil.isEmpty(namespacePrefix)) {
            throw new Exception(NLS.bind(Messages.namespacePrefixNotFound, propId));
        }

        ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

        if (assistant == null) {
            throw new Exception(NLS.bind(Messages.modelExtensionAssistantNotFound, propId));
        }

        assistant.removeProperty(modelObject, propId);
    }

    public void setPropertyValue( Object modelObject,
                                  String propId,
                                  String newValue ) throws Exception {
        String namespacePrefix = ModelExtensionPropertyDefinition.Utils.getNamespacePrefix(propId);

        if (CoreStringUtil.isEmpty(namespacePrefix)) {
            throw new Exception(NLS.bind(Messages.namespacePrefixNotFound, propId));
        }

        ModelExtensionAssistant assistant = this.registry.getModelExtensionAssistant(namespacePrefix);

        if (assistant == null) {
            throw new Exception(NLS.bind(Messages.modelExtensionAssistantNotFound, propId));
        }

        assistant.setPropertyValue(modelObject, propId, newValue);
    }
}