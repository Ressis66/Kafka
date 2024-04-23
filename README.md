Mикросервис "Metrics Producer  
Endpoint:    
POST http://localhost:8080/metrics  
Body for testing:
{  
  "id": 1,  
  "timestamp": 1200,  
  "appName": "tri",  
  "cpuUsage": 50  
}  

Микросервис "Metrics Consumer"  
Endpoints:  
GET http://localhost:8081/metrics  
GET http://localhost:8081/metrics/1
