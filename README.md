# Radar Management 

## Introduction

The aim of this project is to create a distributed system based on micro-services.This application allows to manage and automate the process of vehicle infractions following speed overruns detected by automatic radars. The system consists of three micro-services :
- Registration Service : allows to manage vehicles and their owners.
- Radar Service : allows to manage radars.
- Violation Service : manage the cars violations that detected by radars.

## Outils
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](	https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Angular](https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white)
![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![GraphQL](https://img.shields.io/badge/GraphQl-E10098?style=for-the-badge&logo=graphql&logoColor=white)
```
- Spring Cloud
- Spring Data
- SOAP
- Eureka Discovery
- H2DataBase
- BloomRPC
```

## Class Diagram 
<table align="center">
  <tr><img src="Screenshots/1.png"/></tr>
</table>

## Project Architecture
<table align="center">
  <tr><img src="Screenshots/4.png"/></tr>
</table>

## Service Architecture
<table align="center">
  <tr><img src="Screenshots/5.png"/></tr>
</table>

## Eureka Service 
<table align="center">
  <tr><img src="Screenshots/8.png"/></tr>
</table>

## Gateway Service
<table align="center">
  <tr><img src="Screenshots/6.png"/></tr>
</table>

## Regisration Service
<table align="center">
  <tr>
    <th>Rest</th>
    <th>SOAP</th>
   </tr>
  <tr>
    <td><img src="Screenshots/27.png"/></td>
    <td><img src="Screenshots/26.png"/></td>
  </tr>
    <th>GraphQL</th>
    <th>GRPC</th>
  <tr>
    <td><img src="Screenshots/25.png"/></td>
    <td><img src="Screenshots/28.png"/></td>
  </tr>
</table>

## Radar Service
<table align="center">
  <tr>
    <th>Rest</th>
    <th>SOAP</th>
   </tr>
  <tr>
    <td><img src="Screenshots/33.png"/></td>
    <td><img src="Screenshots/24.png"/></td>
  </tr>
    <th>GraphQL</th>
    <th>GRPC</th>
  <tr>
    <td><img src="Screenshots/31.png"/></td>
    <td><img src="Screenshots/35.png"/></td>
  </tr>
</table>

## Violation Service
<table align="center">
  <tr>
    <th>Rest</th>
    <th>SOAP</th>
   </tr>
  <tr>
    <td><img src="Screenshots/34.png"/></td>
    <td><img src="Screenshots/36.png"/></td>
  </tr>
    <th>GraphQL</th>
    <th>GRPC</th>
  <tr>
    <td><img src="Screenshots/32.png"/></td>
    <td><img src="Screenshots/30.png"/></td>
  </tr>
</table>


## Radar Simulation Application 
<table align="center">
  <tr>
    <td><img src="Screenshots/7.png"/></td>
    <td><img src="Screenshots/24.png"/></td>
  </tr>
</table>

## Web Application
<table align="center">
  <tr>
    <th>Authentication</th>
    <th>Home</th>
   </tr>
  <tr>
    <td><img src="Screenshots/9.png"/></td>
    <td><img src="Screenshots/10.png"/></td>
  </tr>
  <tr>
    <th>Table</th>
    <th>Search</th>
  </tr>  
  <tr>
    <td><img src="Screenshots/19.png"/></td>
    <td><img src="Screenshots/23.png"/></td>
  </tr>
  <tr>
    <th>Owner Detail</th>
    <th>Violation Detail</th>
  </tr>  
  <tr>
    <td><img src="Screenshots/15.png"/></td>
    <td><img src="Screenshots/22.png"/></td>
  </tr>
  <tr>
    <th>Add</th>
    <th>Update</th>
  </tr>
  <tr>
    <td><img src="Screenshots/17.png"/></td>
    <td><img src="Screenshots/18.png"/></td>
  </tr>
</table>


## License
[MIT LICENSE](LICENSE)

