<div class="list ${domainClass.propertyName}">
    <p>List generated from _list.gsp template</p>
    <g:each in="${domainClass.persistentProperties}" var="p">
        <div class="row">
            <div class="col-sm-5 property-label" id="${p.name}-label">
                <strong><g:message code="${domainClass.propertyName}.${p.name}.label" default="${p.naturalName}"/>:</strong>
            </div>
            <div class="col-sm-7 property-value" aria-labelledby="${p.name}-label">${body(p)}</div>
        </div>
    </g:each>
</div>
