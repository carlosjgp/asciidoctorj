package org.asciidoctor.extension

import groovy.transform.CompileStatic
import org.asciidoctor.ast.DocumentRuby

@CompileStatic
@Location(LocationType.FOOTER)
class AnnotatedDocinfoProcessor extends DocinfoProcessor {

    public static final String META_TAG = '<meta name="robots" content="index, follow"/>'

    AnnotatedDocinfoProcessor() {}

    AnnotatedDocinfoProcessor(LocationType location) {
        config['location'] = ":${location.name().toLowerCase()}"
    }

    @Override
    String process(DocumentRuby document) {
        META_TAG
    }
}