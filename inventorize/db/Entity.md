inventorize ERD

There are 5 entities: Product, Order, Sales, Vendor, and Customer

Entities and attributes:

Product: ProductID (Primary Key), ProductName, Description, Quantity, Price

Order: OrderID (Primary Key), VendorID (Foreign Key), OrderDate, ProductID (Foreign Key), Price, Quantity, Total Price

Sales: SalesID (Primary Key), CustomerID (Foreign Key), OrderDate, ProductID (Foreign Key), Price, Quantity, Total Price

Vendor: VendorID (Primary Key), VendorName, VendorAddress, VendorCity, VendorState, VendorZip, VendorPhoneNo

Customer: CustomerID (Primary Key), CustomerName, CustomerAddress, CustomerCity, CustomerState, CustomerZip, CustomerPhoneNo


The relationships between the entities are as follows:

Vendor (one and only one) to (one or more) Order

Customer (one and only one) to (one or more) Sales

Order (one or more) to (one or more) Product

Sales (one or more) to (one or more) Product
