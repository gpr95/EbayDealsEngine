# Ebay Deals - search engine
Student project - subject Enterprise And Web Applications
## Simple web applications which uses Ebay API to do periodic searching
### Functionality
In this application users are able to search in popular auction service (eBay). User can make specific criteria about wanted auction (even if it not exists yet). 
Application searching periodically eBay production service. When application find something, it sent notifications to interested user (mail and browser).

0. Registration and singing in.
1. Mail notification about found results
2. Encryption, safe communication
3. Browser notifications about found result
### Architecture and technologies
![Alt text](img/architecture.png?raw=true "Architecture")
### Brief documentation
Project was devided into two separated projects - backend and frontend. Both projects communication is made in OAuth 2.0 protocol. For remote database was used Heroku.