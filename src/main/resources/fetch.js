var tch=function(){
    var uril = 'https://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search';

    // post body data
    var user = {
      "RequestInfo": {},
      "MdmsCriteria": {
        "tenantId": "pb",
        "moduleDetails": [
          {
            "moduleName": "tenant",
            "masterDetails": [
              {
                "name": "tenants",
                "filter": "$.*.code"
              }
            ]
          }
        ]
      }
    };
    // request options
    var options = {
        method: 'POST',
        body: JSON.stringify(user),
        headers: {
            'Content-Type': 'application/json'
        }
    }

    // send POST request
    fetch(uril, options)
        .then(res => res.json())
        .then(res => console.log(res));

/*
    fetch(uril, options)
            .then(function(response){
                return response.json();
            } )
            .then(function(responseBody) {
                console.log(responseBody)
            });

        */
}