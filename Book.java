public class Book {
String name;
Author author;
double price;
int qtyInStock;
public Book(String name, Author author, double price, int qtyInStock) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
	this.qtyInStock = qtyInStock;
}
public Book(String string, String string2, String string3, char c, double d, int i) {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQtyInStock() {
	return qtyInStock;
}
public void setQtyInStock(int qtyInStock) {
	this.qtyInStock = qtyInStock;
}
@Override
public String toString() {
	return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
}

}