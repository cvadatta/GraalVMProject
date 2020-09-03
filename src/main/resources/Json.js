
function returnsJson(data) {
    //print(typeof data);
    //print(data.get("firstName").asText());
    var response = {
        "first": "Siv",
        "last": "Dat"
    }
    return response;
}

function Apicalls(data){
    var request={
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
                }

}
