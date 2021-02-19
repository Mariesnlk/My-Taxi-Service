# My-Taxi-Service

## Description
### Taxi Service System. 
The customer registers in the system and has the opportunity to create a taxi order by pointing departure address, 
destination address, number of passengers and car category. The taxi service has a fleet of drivers. The car has 
capacity characteristics, categories and may be available: "to order", "make order" or be inactive (located in the 
fleet without a driver). The system calculates the cost of the trip depending on the distance and assigns the appropriate 
car among the available. If there are no suitable cars - the client can cancel the order or use an alternative solution:
- cars with the required number of seats, but a different category;
- several cars of the selected category to provide the required capacity.

The system supports the loyalty program - a discount is calculated depending on amount spent sum.
After confirming the order by the customer, the system reports the waiting time.
The system administrator can view order statistics, sort:
- by the date of ordering;
- at the cost of the order

and filter orders:
- by customers;
- on certain dates.
## Installation and running

### Prerequisites
- JDK, JRE 8 or later,
- Apache Maven,
- Apache Tomcat,
- MySQL.

## Set up
- Clone the project to local repository.
- Add Apache Tomcat in Edit Configuration.
- Create database taxi_servise_db.


