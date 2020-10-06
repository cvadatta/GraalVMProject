/*
var tch=function(){

    var uril = 'https://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search';

    var headers = {
      "Content-Type": "application/json",
      "client_id": "1001125",
      "client_secret": "876JHG76UKFJYGVHf867rFUTFGHCJ8JHV"
    }


    var data = {
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

    fetch(uril, { method: 'POST', headers: headers, body: data})
      .then((res) => {
         return res.json()
    })
    .then((json) => {
       // Do something with the returned data.
      console.log(json);

    });


 /*   // post body data
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

    */
    /*

     //send POST request
      fetch(uril, options)
        .then(res => res.json())
        .then(res => console.log(res));

   */
    /*fetch(uril, options)
            .then(function(response){
                return response.json();
            } )
            .then(function(responseBody) {
                //console.log(responseBody)
                print(responseBody);
            });
    */



//}


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
        //mode: 'no-cors',
        body: JSON.stringify(user),
        headers: {
            'Content-Type': 'application/json'
        }
    }

    // send POST request
    fetch(uril, options)
    .then(res => res.json())
    .then(res => console.log(res));

};

